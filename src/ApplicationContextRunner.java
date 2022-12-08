

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codewithz.Car;
import com.codewithz.Hello;

public class ApplicationContextRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Hello hello=(Hello)ctx.getBean("hello");
		
		System.out.println(hello.getMessage());
		
		System.out.println("-----------------------------------");
		
		Car c=(Car)ctx.getBean("car");
		System.out.println(c.getName());
		System.out.println(c.getPrice());
	}

}
