package br.com.alurafood.pagamentos;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class PagamentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagamentosApplication.class, args);
	}
}
