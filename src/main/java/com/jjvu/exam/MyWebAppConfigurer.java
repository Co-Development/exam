package com.jjvu.exam;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jjvu.exam.interceptor.LoginInterceptor;

/**
 * 系统拦截器管理
 * @author SongM
 * @date 2017年10月28日 上午9:58:23
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
		registry
		.addInterceptor(new LoginInterceptor())
		.addPathPatterns("/**")
		.excludePathPatterns("/examen/login");
		super.addInterceptors(registry);
	}
	
}
