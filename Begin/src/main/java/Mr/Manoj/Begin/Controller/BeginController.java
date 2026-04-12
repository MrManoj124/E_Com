package Mr.Manoj.Begin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeginController {
    @GetMapping("/hello")
    String sayMyName(){
        return "Manorooban";
    }
}
