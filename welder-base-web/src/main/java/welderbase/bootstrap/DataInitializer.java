package welderbase.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import welderbase.model.Welder;
import welderbase.model.WelderJoints;
import welderbase.model.WorkPlace;
import welderbase.repositories.WelderJointsRepository;
import welderbase.repositories.WelderRepository;
import welderbase.repositories.WorkPlaceRepository;

@Component
public class DataInitializer implements CommandLineRunner {


    private final WelderRepository welderRepository;
    private final WelderJointsRepository welderJointsRepository;
    private final WorkPlaceRepository workPlaceRepository;


    public DataInitializer(WelderRepository welderRepository, WelderJointsRepository welderJointsRepository, WorkPlaceRepository workPlaceRepository) {
        this.welderRepository = welderRepository;
        this.welderJointsRepository = welderJointsRepository;
        this.workPlaceRepository = workPlaceRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Starter DataItializer");

        Welder welder1 = new Welder("Andrey", "Ermolenko");
        WelderJoints welderJoints1 = new WelderJoints("Stail20", 159);

        welder1.getWelderJointsSet().add(welderJoints1);

        welderRepository.save(welder1);
        welderJointsRepository.save(welderJoints1);

        WorkPlace workPlace1 = new WorkPlace("Очистные сооружения");


        workPlace1.getJoints().add(welderJoints1);


        workPlaceRepository.save(workPlace1);

        Welder welder2 = new Welder("Manarbek", "Shahmanov");
        WelderJoints welderJoints2 = new WelderJoints("Сhromium Marganese", 214);

        welder2.getWelderJointsSet().add(welderJoints2);

        workPlace1.getJoints().add(welderJoints2);

        welderRepository.save(welder2);
        welderJointsRepository.save(welderJoints2);
        workPlaceRepository.save(workPlace1);

        System.out.println("All Welders : " + welderRepository.count());
        System.out.println("All Joints : " + welderJointsRepository.count());
        System.out.println("All joints in place : " + workPlaceRepository.count());

    }

}
