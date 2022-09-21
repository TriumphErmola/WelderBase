package com.example.welderbase.bootstrap;

import com.example.welderbase.domain.model.Welder;
import com.example.welderbase.domain.model.WelderJoints;
import com.example.welderbase.repository.WelderJointsRepository;
import com.example.welderbase.repository.WelderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {


    private final WelderRepository welderRepository;
    private final WelderJointsRepository welderJointsRepository;

    public DataInitializer(WelderRepository welderRepository, WelderJointsRepository welderJointsRepository) {
        this.welderRepository = welderRepository;
        this.welderJointsRepository = welderJointsRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Welder welder1 = new Welder("Andrey", "Ermolenko");
        WelderJoints welderJoints1 = new WelderJoints("Stail20", 159);

        welder1.getWelderJointsSet().add(welderJoints1);
        welderJoints1.getWelders().add(welder1);

        welderRepository.save(welder1);
        welderJointsRepository.save(welderJoints1);


        Welder welder2 = new Welder("Manarbek", "Shahmanov");
        WelderJoints welderJoints2 = new WelderJoints("Сhromium Marganese", 214);

        welder2.getWelderJointsSet().add(welderJoints2);
        welderJoints2.getWelders().add(welder2);

        welderRepository.save(welder2);
        welderJointsRepository.save(welderJoints2);

        System.out.println("Starter DataItializer");
        System.out.println("All Welders : "+ welderRepository.count());
        System.out.println("All Joints : "+ welderJointsRepository.count());
    }
}
