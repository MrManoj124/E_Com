package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Product {

    @Document(collection = "products")
    public class Product {

        @Id
        private String productId;

        private String productName;
        private Double price;
        private Integer stock;
        private String description;

        //Default Constructor
        public Product() {
        }
    }
    //Parameterized constructor
    public Product(String productName , Double price, Integer stock, String description){
        this.productName = productName;
        this.price = price;
        this.stock=stock;
        this.description=description;
    }

    // Getters and Setters

    public int getId() {
        return productName;
    }

    public String getName(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return description;
    }

    public void setId(String id){
        this.productName=productName;
    }

    public void setName(Double price){
        this.price=price;
    }

    public void setQuantity(int stock){
        this.stock=stock;
    }

    public void setPrice(String description){
        this.description=description;
    }

}


