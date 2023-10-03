package br.com.guifroes1984;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.guifroes1984.model"})
@ComponentScan(basePackages = {"br.*"})
@EnableJpaRepositories(basePackages = {"br.com.guifroes1984.repository"})
@EnableTransactionManagement
@EnableWebMvc
@RestController
@EnableAutoConfiguration
public class SpringbootrestapiApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootrestapiApplication.class, args);
	}
	
	/*Mapeamento Global que refletem em todo o sistema*/
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/usuario/**")
		.allowedMethods("*")
		.allowedOrigins("*");
		/*Liberando o mapeamento de usurio para todas as origens*/
	}

}
