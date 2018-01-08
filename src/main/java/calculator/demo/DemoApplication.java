package calculator.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Calculator calculator = new Calculator(5,1);
		int result = calculator.addAtoB();
		System.out.println(result);
	}
}
