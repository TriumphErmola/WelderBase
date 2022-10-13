package welderbase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelderIndexController {

    @RequestMapping({"/index","","/","index.hmtl"})
    public String index() {
        return "index";
    }
}
