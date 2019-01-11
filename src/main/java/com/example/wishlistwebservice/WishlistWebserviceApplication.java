package com.example.wishlistwebservice;

import com.example.wishlistwebservice.model.Group;
import com.example.wishlistwebservice.model.User;
import com.example.wishlistwebservice.repository.GroupRepository;
import com.example.wishlistwebservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WishlistWebserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(WishlistWebserviceApplication.class, args);
	}
}

