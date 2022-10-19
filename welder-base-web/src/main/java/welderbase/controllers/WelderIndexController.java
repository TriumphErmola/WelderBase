package welderbase.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import welderbase.repository.WelderRepository;

@Controller
public class WelderIndexController {

    private final WelderRepository welderRepository;

    public WelderIndexController(WelderRepository welderRepository) {
        this.welderRepository = welderRepository;
    }


    @RequestMapping({"/indexwelder", "indexwelder.hmtl"})
    public String indexWelder(Model model) {
        model.addAttribute("welders", welderRepository.findAll());
            return "welders/index";
    }
}
