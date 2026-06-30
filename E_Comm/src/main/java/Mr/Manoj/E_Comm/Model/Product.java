package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "products")
    public class Product {

        @Id
        private String productId;

        private LocalDateTime orderDate;
        private Double totalAmount;
        private String status;
        private String customerEmail;

        //Default Constructor
        public Product() {
        }

        //Parameterized constructor
        public Product(LocalDateTime orderDate, Double totalAmount, String status, String customerEmail) {
            this.orderDate =orderDate;
            this.totalAmount = totalAmount;
            this.status = status;
            this.customerEmail = customerEmail;
        }

        // Getters and Setters





}

