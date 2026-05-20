package Mr.Manoj.E_Comm.Controller;


import Mr.Manoj.E_Comm.Model.Product;
import Mr.Manoj.E_Comm.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productservice;

    private List<Product> Products = new ArrayList<>();

    // Sending or Posing the data
    @PostMapping('/addProduct')
    public String PostProduct(@RequestBody Product product01){
        if(product01.getQuantity() < 0){
            return "Quantity cannot be negative. cannot add the product";
        }
        productservice.addProduct(product01);
        return "Successfully added the datas";
    }

    // Retriew the datas
    @GetMapping("/getProduct")
    public List<Product>getProduct(){
        return productservice.getProducts();
    }

    // Delete the data
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int Id){
        boolean removed = productService.deleteProductById(int Id){
            if(removed){
                return("Product deleted succesfully");
            }
            else{
                return"Product not found.";
            }
        }
    }
}
