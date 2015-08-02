package demo;

import com.sun.faces.config.FacesInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    ServletRegistrationBean facesServletRegistration() {
        return new ServletRegistrationBean() {
            @Override
            public void onStartup(ServletContext servletContext) throws ServletException {
                FacesInitializer facesInitializer = new FacesInitializer();
                facesInitializer.onStartup(Collections.singleton(DemoApplication.class), servletContext);
            }
        };
    }
}
