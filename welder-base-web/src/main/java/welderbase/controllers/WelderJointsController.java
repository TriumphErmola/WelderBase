package welderbase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelderJointsController {

    @RequestMapping({"/indexwelderjoints","indexWelderJoints.hmtl"})
    public String indexWelderJoints(){
        return "indexWelderJoints";
    }
}
