package cl.duoc.ms_usuario_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsUsuarioBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUsuarioBffApplication.class, args);
	}

}
