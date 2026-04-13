package Mr.Manoj.Begin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hello")
public class BeginController {
    @GetMapping("/name")
    String sayMyName(){
        return "Manorooban";
    }

    @GetMapping("/{id}")
    String getById(){
        return "hello with Id";
    }
}
