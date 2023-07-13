package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @GetMapping("/hello-world")
    public String showMyView() {
        return "myView";
    }
}
