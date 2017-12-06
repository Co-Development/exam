package com.jjvu.exam.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 考生是否登录拦截器
 * @author SongM
 * @date 2017年11月29日 下午3:44:01
 */
public class LoginInterceptor implements HandlerInterceptor {

	/**
	 * 在请求处理之前进行调用（Controller方法调用之前）
	 * 只有返回true才会继续向下执行，返回false取消当前请求
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 验证是否登录
		Object object = request.getSession().getAttribute("exam-id");
		if(object == null) {
			// 重定向到登录界面
			response.sendRedirect("./login.jsp");
			return false;
		}
		
		return true;
	}

	/**
	 * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	/**
	 * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
	
}
