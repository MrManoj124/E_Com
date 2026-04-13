package Mr.Manoj.Begin.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hello")
public class BeginController {
    @GetMapping("/name")
    String sayMyName(){
        return "Manorooban";
    }

    @GetMapping("/{id}")
    String getById(@PathVariable long id){
        return "hello with Id" + id;
    }

    @GetMapping("/")
    String getParamById(@RequestParam long id){
        return "hello with Id" + id;
    }
}
