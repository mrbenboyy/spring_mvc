package org.example.springmvc;

import org.example.springmvc.entities.*;
import org.example.springmvc.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository ;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
 @Override
    public void run(String... args) throws Exception{
        /* patientRepository.save(new Patient(null,"messi","leo", new Date(),false));
     patientRepository.save(new Patient(null,"hakim","benbouanane", new Date(),false));
     patientRepository.save(new Patient(null,"mbappé","kylian", new Date(),true));
     patientRepository.save(new Patient(null,"justin","bieber", new Date(),false)); */
 }
}
