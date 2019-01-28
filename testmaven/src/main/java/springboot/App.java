package springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
	@Value("${spring.application.name}")
	private String name;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
