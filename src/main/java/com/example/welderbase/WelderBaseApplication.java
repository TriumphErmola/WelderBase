package com.example.welderbase;

import com.example.welderbase.model.Human;
import com.example.welderbase.model.PlaceOfWork;
import com.example.welderbase.model.Welder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelderBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelderBaseApplication.class, args);

        Welder welder1 = new Welder("BHCC", 5, true, true);
        welder1.setFirstName("Andrey");
        welder1.setSecondName("Ermolenko");
        welder1.setAge(28);

        Welder welder2 = new Welder("ABCDQ", 5, true, false);
        welder2.setFirstName("Manarbek");
        welder2.setSecondName("Shahmanov");
        welder2.setAge(23);

        Welder welder3 = new Welder("RTYU", 6, true, true);
        welder3.setFirstName("Evgeniy");
        welder3.setSecondName("Ohrimenko");
        welder3.setAge(42);

        Welder welder4 = new Welder("----", 3, false, false);
        welder4.setFirstName("Vlad");
        welder4.setSecondName("Marmelad");
        welder4.setAge(21);

        PlaceOfWork uchastok6 = new PlaceOfWork("Montajniy Uchastok 6");
        uchastok6.addWelder(welder1);
        uchastok6.addWelder(welder2);
        uchastok6.addWelder(welder3);
        uchastok6.addWelder(welder4);

        System.out.println(uchastok6);

        uchastok6.showWelder();


    }

}
