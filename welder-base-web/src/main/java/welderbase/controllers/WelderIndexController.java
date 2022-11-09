package welderbase.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import welderbase.repositories.WelderRepository;

@Controller
public class WelderIndexController {

    private final WelderRepository welderRepository;

    public WelderIndexController(WelderRepository welderRepository) {
        this.welderRepository = welderRepository;
    }

    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }


    @RequestMapping({"/indexwelder", "indexwelder.hmtl"})
    public String indexWelder(Model model) {
        model.addAttribute("welders", welderRepository.findAll());
        return "welders/index";
    }

    @RequestMapping("/find")
    public String findWelders() {
        return "NotImplemented";
    }

    @GetMapping("/{welderId}")
    public ModelAndView showWelder(@PathVariable("welderId") Long welderId) {
        ModelAndView modelAndView = new ModelAndView("welders/weldersDetails");
        modelAndView.addObject(welderRepository.findById(welderId));
        return modelAndView;
    }
}

