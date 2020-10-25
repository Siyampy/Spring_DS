package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import controller.HelloGame;
import controller.HelloSpring;

public class ApplicationContextConfig 
{
	 @Bean(name = "viewResolver")
	    public InternalResourceViewResolver getViewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }
	     
	    @Bean(name = "/hello.ds")
	    public Controller getHelloSpring() {
	        return new HelloSpring();
	    }
	    @Bean(name = "/game.ds")
	    public Controller getHelloGame() {
	        return new HelloGame();
	    }
}
