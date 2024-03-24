package com.denzel.GymManagementSystem;

import com.denzel.GymManagementSystem.model.Trainer;
import com.denzel.GymManagementSystem.service.TrainerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GymManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TrainerService trainerService) {
		return args -> {
			for (int i = 0; i < 5; i++) {
				Trainer trainer = new Trainer(null,"Denzel"+i,"Dzingiso"+i,"Male"+i,
						"63-23418-y"+i,"Cardio"+i,"07800340"+i,"denzel@gmail.com"+i);
				trainerService.save(trainer).subscribe();


			}
		};
	}
}