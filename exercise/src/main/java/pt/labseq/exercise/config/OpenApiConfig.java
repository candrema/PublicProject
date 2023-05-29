package pt.labseq.exercise.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
		.components(new Components())
			.info(new Info()
			.title("LabSeq Application API")
			.description("LabSeq Application for interview")
			.license(new License().name("candrema"))
			.version("1.0")
		);
	  }
}
