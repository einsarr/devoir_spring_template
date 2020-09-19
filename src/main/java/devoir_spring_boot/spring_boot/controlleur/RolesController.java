package devoir_spring_boot.spring_boot.controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class RolesController {

    @GetMapping("/all")
    public String index(){
        return "roles";
    }
}
