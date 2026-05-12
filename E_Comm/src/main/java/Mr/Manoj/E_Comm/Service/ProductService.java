package Mr.Manoj.E_Comm.Service;


import Mr.Manoj.E_Comm.Model.Product;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    //Add Product
    public String addProduct(Product product) {
        if (product.getQuantity() <= 0) {
            return "Quantity must be greater than zero";
        }

        productList.add(product);
        return "Product Added Successfully";
    }

    //Get All Products
    public List<Product> getProductList() {
        return productList;
    }

    // Get Product by ID
    public Product getProductById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return  null;
    }

    // Delete Product
    public String deleteProduct(int id) {

        boolean removed = productList.removeIf(
                product -> product.getId() == id
        );

        if (removed) {
            return "Product deleted successfully";
        }

        return "Product not found";
    }

    // Delete All Products
    public String deleteAllProducts() {
        productList.clear();
        return "All products deleted successfully";
    }

}
