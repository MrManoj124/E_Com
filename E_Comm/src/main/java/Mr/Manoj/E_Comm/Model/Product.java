package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "products")
    public class Product {

        @Id
        private String productId;

        private String productName;
        private Double price;
        private int stock;
        private String description;

        //  Default Parameter
        public Product(){}

        //prameterized constructor
        public Product(String productName, Double price, int stock, String description){
            this.productName=productName;
            this.price=price;
            this.stock=stock;
            this.description=description;
        }

        public String getProductId(){
            return productId;
        }

        public  void setProductId(String productId){
            this.productId=productId;
        }

        public String getProductName(){
            return productName;
        }

        public void setProductName(String productName){
            this.productName=productName;
        }

        public Double getPrice(){
            return price;
        }

        public void setPrice(Double price){
            this.price=price;
        }

        public int getStock(){
            return stock;
        }

        public void setStock(int stock){
            this.stock=stock;
        }

        public String getDescription(){
            return description;
        }

        public void setDescription(String description){
            this.description=description;
        }

}

