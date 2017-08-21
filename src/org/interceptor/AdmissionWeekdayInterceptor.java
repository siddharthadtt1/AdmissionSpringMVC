package org.interceptor;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdmissionWeekdayInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
			response.getWriter()
					.write("Please visit website on weekday & weekend");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object object,
			ModelAndView modelAndView) {
		System.out.println(
				"PostHandle() after the controller method has executed : "
						+ request.getRequestURI().toString());
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception ex) {
		System.out.println(
				"AfterCompletion() method , view has been successfully returned "
						+ request.getRequestURI().toString());
	}

}
