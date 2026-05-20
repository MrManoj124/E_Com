package Mr.Manoj.E_Comm.Controller;


// import Mr.Manoj.E_Comm.Model.Product;
// import Mr.Manoj.E_Comm.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
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

}
