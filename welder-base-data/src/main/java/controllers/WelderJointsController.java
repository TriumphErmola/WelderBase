package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.WelderJointsRepository;


@Controller
public class WelderJointsController {

    private final WelderJointsRepository welderJointsRepository;

    public WelderJointsController(WelderJointsRepository welderJointsRepository) {
        this.welderJointsRepository = welderJointsRepository;
    }

    @RequestMapping("/welderJoints")
    public String getWelderJoints(Model model) {
        model.addAttribute("welderJoints", welderJointsRepository.findAll());

        return "welderJoints/list";
    }
}
