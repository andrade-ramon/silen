package br.com.silen.security;

import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import br.com.silen.user.User;

@Component
public class LoggedUserValidatorInterceptor extends HandlerInterceptorAdapter{
	
	@Autowired
	private TokenAuthenticationService tokenService;
	
	public static final String TOKEN_COOKIE_NAME = "token";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		if (handler instanceof HandlerMethod) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			boolean onlyAdminCanPass = handlerMethod.getMethod().isAnnotationPresent(OnlyAdmin.class);
			
			boolean isLoginPath = StringUtils.equals("/", request.getServletPath())
					|| StringUtils.equals("/login", request.getServletPath())
					|| StringUtils.equals("/logout", request.getServletPath());
			boolean isErrorPath = StringUtils.equals("/error", request.getServletPath());
			
			if(isLoginPath || isErrorPath) {
				return true;
			}
			
			String token = getTokenFromCookie(request);
			
			Optional<User> user = tokenService.getUserFromToken(token);
			if(!user.isPresent()) {
				response.sendRedirect("/");
				return false;
			}
			
			request.setAttribute("loggedUser", user.get());
			boolean isAdmin = user.get().isAdmin();
			
			if(onlyAdminCanPass && !isAdmin) {
				response.sendRedirect("/home");
				return false;
			}
		}
		
		return true;
	}

	private String getTokenFromCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if(TOKEN_COOKIE_NAME.equals(cookie.getName())) {
				return cookie.getValue();
			}
		}
		return "";
	}
}
