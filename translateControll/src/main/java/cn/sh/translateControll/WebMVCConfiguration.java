package cn.sh.translateControll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfiguration implements WebMvcConfigurer {
	
	@Autowired
	private InterceptorForContext interceptorForContext;
	
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/", "file:translateWeb/").addResourceLocations("/", "classpath:/BOOT-INF/classes/translateWeb/");
	}
	  @Override
	  public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptorForContext).addPathPatterns("/json/**");
    }
	
}
