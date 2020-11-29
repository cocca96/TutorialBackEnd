package com.backEndTutorial.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.backEndTutorial.controller.HeroController;
import com.backEndTutorial.model.Hero;
import com.backEndTutorial.model.HeroInterface;
import com.backEndTutorial.model.MockHero;



@SpringBootApplication
@ComponentScan("com.backEndTutorial")
public class DemoApplication implements CommandLineRunner{

	HeroController controller;
	public static void main(String[] args) {
		
		
		SpringApplication.run(DemoApplication.class, args);

		
	
		
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
