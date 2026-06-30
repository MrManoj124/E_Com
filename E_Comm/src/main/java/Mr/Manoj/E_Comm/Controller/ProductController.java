package Mr.Manoj.E_Comm.Controller;

import Mr.Manoj.E_Comm.Model.Product;
import Mr.Manoj.E_Comm.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")// Match all the below Mapping to do CRUD operations
public class ProductController {

    @Autowired
    private ProductService service;

    // Create
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id){
        return service.getProductById(id);
    }

    @PutMapping
    public  Product updateProduct(@PathVariable String id, @RequestBody Product product){
        return service.updateProduct(id, product);
    }

    @PatchMapping
    public Product patchProduct(@PathVariable String id, @RequestBody Product product){
        return service.patchProduct(id, product);
    }

    @DeleteMapping
    public String deleteProduct(@PathVariable String id){
        return service.deleteProduct(id);
    }
}







/*
    // fully wrong with data post and retrieval
    // Request Param username and password

    @GetMapping("/create")
    String UsernameWithPassword(@RequestParam String userId, String password){
        return "Username id is " + userId + " and Password is " + password;
    }
    */
