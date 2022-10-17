package welderbase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelderIndexController {

    @RequestMapping({"/indexwelder","","/","indexwelder.hmtl"})
    public String indexWelder() {
        return "indexWelder";
    }
}
