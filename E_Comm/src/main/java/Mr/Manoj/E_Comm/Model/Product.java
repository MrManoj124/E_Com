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



}

