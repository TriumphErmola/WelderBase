package com.example.welderbase.bootstrap;

import com.example.welderbase.model.Welder;
import com.example.welderbase.service.WelderServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataItializer implements CommandLineRunner {

    private final WelderServiceImpl welderService;

    public DataItializer(WelderServiceImpl welderService) {
        this.welderService = welderService;
    }

    @Override
    public void run(String... args) throws Exception {

        Welder welder = new Welder("BHCC", 5, true, true);
        welder.setFirstName("Andrey");
        welder.setSecondName("Ermolenko");
        welder.setAge(28);
        welderService.save(welder);
        System.out.println("Loaded Welder Andrey Ermolenko");

    }
}
