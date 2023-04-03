package com.example.serverApp;

import com.example.serverApp.enumeration.Status;
import com.example.serverApp.model.Server;
import com.example.serverApp.repo.ServerRepo;
import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication
public class ServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAppApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server-pic/server1.png",
					Status.SERVER_UP));
			serverRepo.save(new Server(null, "182.138.1.58", "Fedora Linux", "16 GB", "Dell", "http://localhost:8080/server-pic/server2.png",
					Status.SERVER_DOWN));
			serverRepo.save(new Server(null, "102.16.1.163", "MS 2008", "32 GB", "Web Server", "http://localhost:8080/server-pic/server3.png",
					Status.SERVER_UP));
			serverRepo.save(new Server(null, "112.16.17.165", "Enterprise Lin", "62 GB", "Mail Server", "http://localhost:8080/server-pic/server4.png",
					Status.SERVER_DOWN));
		};
	}

//	@Bean
//	public CorsFilter corsFilter(){
//		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration corsConfiguration = new CorsConfiguration();
//		corsConfiguration.setAllowCredentials(true);
//		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:3000", "http://localhost:4200"));
//		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization", "Origin, Accept", "X-Requested-With",
//				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
//		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Jwt-Token", "Authorization", "Access-Control-Allow-Origin","Access-Control-Allow-Origin",
//				"Access-Control_Allow_Credentials", "Filename"));
//		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
//		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//		return new CorsFilter(urlBasedCorsConfigurationSource);
//	}

}
