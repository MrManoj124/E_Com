package Mr.Manoj.E_Comm.Controller;


// import Mr.Manoj.E_Comm.Model.Product;
// import Mr.Manoj.E_Comm.Service.ProductService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api") // Match all the below Mapping to do CRUD operations
public class ProductController {
    @GetMapping("/hello")
    String Greeting() {
        return "All are Welcome";
    }

    @GetMapping("/forYou")
    String GreetingForyou() {
        return "All are Welcome to my world";
    }

    // Add path variable
    @GetMapping("/{id}")
    String GreetingWithId(@PathVariable long id){
        return "Available on " + id + " Hours";
    }

    // Request Param
    @GetMapping("/request")
    String GreetingWithString(@RequestParam ("Requesting")long id){
        return "All are transparent with " + id + " here";
    }

    /*
    // fully wrong with data post and retrieval
    // Request Param username and password

    @GetMapping("/create")
    String UsernameWithPassword(@RequestParam String userId, String password){
        return "Username id is " + userId + " and Password is " + password;
    }
    */

    @PostMapping("/Insert")
    String createUser(@RequestBody String body){
        return body;
    }
}
