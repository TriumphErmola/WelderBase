package welderbase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import welderbase.repositories.WelderJointsRepository;

@Controller
public class WelderJointsController {

    private final WelderJointsRepository welderJointsRepository;

    public WelderJointsController(WelderJointsRepository welderJointsRepository) {
        this.welderJointsRepository = welderJointsRepository;
    }

    @RequestMapping({"/indexwelderjoints","indexWelderJoints.hmtl"})
    public String indexWelderJoints(Model model){
        model.addAttribute("welderJoints",welderJointsRepository.findAll());
        return "welderJoints/list";
    }
}
