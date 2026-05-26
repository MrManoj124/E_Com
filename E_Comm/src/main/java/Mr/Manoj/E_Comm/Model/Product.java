package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

        //Parameterized constructor
        public Product(String productName, Double price, Integer stock, String description) {
            this.productName = productName;
            this.price = price;
            this.stock = stock;
            this.description = description;
        }

        // Getters and Setters

        public String getProductName() {
            return productName;
        }

        public Double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        public String getDescription() {
            return description;
        }

        public void setProductName(String ProductName) {
            this.productName = productName;
        }

        public void setName(Double price) {
            this.price = price;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

