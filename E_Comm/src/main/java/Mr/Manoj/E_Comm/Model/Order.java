package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "orders")
public class Order {

        @Id
        private String orderId;

        private LocalDateTime orderDate;
        private Double totalAmount;
        private String status;
        private String customerEmail;

        private List<Product> products;

        public Order(){}

        //Parameterized constructor
        public Order(LocalDateTime orderDate, Double totalAmount, String status, String customerEmail) {
                this.orderDate =orderDate;
                this.totalAmount = totalAmount;
                this.status = status;
                this.customerEmail = customerEmail;
        }

        // Getters and Setters
        public String getOrderId(){
                return orderId;
        }

        public void setOrderId(String orderId){
                this.orderId=orderId;
        }
        public LocalDateTime getorderDate(){
                return orderDate;
        }

        public void setorderDate(LocalDateTime orderDate){
                this.orderDate=orderDate;
        }

        public Double getTotalAmount(){
                return  totalAmount;
        }

        public void status(String status){
                this.status=status;
        }

        public String getCustomerEmail(){
                return customerEmail;
        }

        public void setCustomerEmail(String customerEmail){
                this.customerEmail=customerEmail;
        }

}
