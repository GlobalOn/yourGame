package yourGame.project10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		StringBuilder sb = new StringBuilder();
		sb.append(55);
		System.out.println(sb);
	}

}
