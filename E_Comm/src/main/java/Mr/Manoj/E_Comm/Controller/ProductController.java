package Mr.Manoj.E_Comm.Controller;


import Mr.Manoj.E_Comm.Model.Product;
import Mr.Manoj.E_Comm.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productservice;

    private List<Product> Products = new ArrayList<>();
}
