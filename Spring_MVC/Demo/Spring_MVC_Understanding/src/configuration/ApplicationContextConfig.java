package configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import controller.HelloSpring;
/**
 * BeanNameUrlHandlerMapping Configuration using java config
 *
 */
public class ApplicationContextConfig 
{
	 @Bean(name = "viewResolver")
	    public InternalResourceViewResolver getViewResolver() {
		 System.out.println("View resolver gets configured");
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }	     
	    @Bean(name = "/hello.ds")
	    public Controller getHelloSpring() {
	    	System.out.println("Handler is  gets configured for the request path");
	        return new HelloSpring();
	    }	  
}
