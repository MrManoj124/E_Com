package Mr.Manoj.E_Comm.Service;


import Mr.Manoj.E_Comm.Model.Product;
import Mr.Manoj.E_Comm.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo){
        this.productRepo=productRepo;
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }

    // FindAll products
    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    //FindById
    public Product getProductById(String id){
        return productRepo.findById(id).orElse(null);
    }

    //Update products / PUT
    public Product updateProduct(String id, Product newProduct){
        Product product=getProductById(id);
        if(product != null){
            product.setProductName(newProduct.getProductName());
            product.setPrice(newProduct.getPrice());
            product.setStock(newProduct.getStock());
            product.setDescription(newProduct.getDescription());

            return productRepo.save(product);
        }
        return null;
    }

    //delete by id
    public String deleteProduct(String id){
        Product product = getProductById(id);

        if(product != null){
            productRepo.deleteById(id);
            return "Product deleted successfully";
        }
        return ("Product not found");
    }

    // Patch operation
    public Product patchProduct(String id, Product product){
        Product existingProduct = productRepo.findById(id).orElse(null);

        if(existingProduct == null){
            return null;
        }

        if(product.getProductName() != null){
            existingProduct.setProductName(product.getProductName());
        }

        if(product.getPrice() > 0){
            existingProduct.setPrice(product.getPrice());
        }

        if(product.getStock() > 0){
            existingProduct.setStock(product.getStock());
        }

        if(product.getDescription() != null){
            existingProduct.setDescription(product.getDescription());
        }
        return productRepo.save(existingProduct);
    }
}
