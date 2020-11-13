package configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 * @author siyam
 * java based configuration for the Spring MVC
 *
 */
public class Initializer implements WebApplicationInitializer {	
	@Override
	public void onStartup(ServletContext servletCxt) throws ServletException {
		 // Load Spring web application configuration Java Based
   
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(ApplicationContextConfig.class);

        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(appContext);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("springmvcjava", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("*.ds");
        servlet.setDetectAllHandlerMappings(true);
        servlet.setDetectAllViewResolvers(true);

	}

}
