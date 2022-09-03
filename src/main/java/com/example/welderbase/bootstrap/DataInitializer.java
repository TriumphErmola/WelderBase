package com.example.welderbase.bootstrap;

import com.example.welderbase.model.Employee;
import com.example.welderbase.model.Specialties;
import com.example.welderbase.model.Welder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = new Employee();
        employee1.setFirstName("Andrey");
        employee1.setLastName("Ermolenko");
        employee1.setPatronymic("Vasilevich");
        employee1.setAge(28);
        employee1.setPhoneNumber("+79293606910");
        employee1.setLengthOfService(2.1);
        employee1.setSpecialties("Welder");
        employee1.setSpec(Specialties.TIG);

        System.out.println(employee1);

        Welder welder1 = new Welder();
        welder1.setSpec(Specialties.MIG);
        welder1.setFirstName("Misha");
        welder1.setLastName("Shahmanov");
        welder1.setPatronymic("Kairbekovich");
        welder1.setAge(23);
        welder1.setNaks("ABCD");
        welder1.setSpec(Specialties.TIG);
        welder1.setPhoneNumber("+79502161225");

        System.out.println(welder1.getFirstName());
        System.out.println(welder1.getSpec());
        System.out.println(welder1.getNaks());
    }
}
