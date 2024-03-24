package com.denzel.GymManagementSystem.controller;


import com.denzel.GymManagementSystem.model.Trainer;
import com.denzel.GymManagementSystem.service.TrainerService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins ="http://localhost:5173/")
@Data
@RestController
@RequestMapping("/api/trainer")
public class TrainerController {
    @Autowired
    private TrainerService trainerService;

    @PostMapping("/add")
    public Mono<Trainer> add(@RequestBody Trainer trainer) {
        return trainerService.save(trainer);
    }
    @GetMapping("/all")
    public Flux<Trainer> findAll(){
        return trainerService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Trainer> deleteById(@PathVariable Long id){
        return trainerService.deleteTrainerById(id);
    }

    @PutMapping("/update/{id}/{trainer}")
    public Mono<Trainer> updateTrainer(@PathVariable Long id , @PathVariable Trainer trainer){
        return trainerService.updateTrainerBy(id,trainer);
    }

    @GetMapping("/{trainerId}")
    public Mono<Trainer> fetchById(@PathVariable Long trainerId){return trainerService.getById(trainerId);
    }
}
