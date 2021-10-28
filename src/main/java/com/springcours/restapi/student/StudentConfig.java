package com.springcours.restapi.student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	CommandLineRunner commandeLineRunner(StudentRepository repository) {
		return args ->{
			Student yassine = new Student(3L,"yassine", "am@gmail.com", LocalDate.of(1998, Month.SEPTEMBER, 16), 23);
			Student alex = new Student(4L,"alex", "alex@gmail.com", LocalDate.of(1992, Month.SEPTEMBER, 16), 33);
			
			repository.save(yassine);
			repository.save(alex);
		};
	}

}
