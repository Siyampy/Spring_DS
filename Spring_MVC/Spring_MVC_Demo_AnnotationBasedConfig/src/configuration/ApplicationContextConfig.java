package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *  Configuration using java Config
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "controller")
//The Component scan is necessary to initialize the controller annotation classes to handle the upcoming request
public class ApplicationContextConfig implements WebMvcConfigurer
{
	 @Bean(name = "viewResolver")
	    public InternalResourceViewResolver getViewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }	     
}
