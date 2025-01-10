package com.projeto.API.configuration;

import com.projeto.API.interceptor.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Autowired

	private Interceptor interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(interceptor).addPathPatterns("/**");
	}
}
