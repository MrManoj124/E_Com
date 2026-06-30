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

        //prameterized constructor
        public Product(String productName, Double price, int stock, String description){
            this.productName=productName;
            this.price=price;
            this.stock=stock;
            this.description=description;
        }



}

