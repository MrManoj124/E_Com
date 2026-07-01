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
        private List<PaymentMethod> paymentMethods;

        public Order(){}

        //Parameterized constructor
        public Order(LocalDateTime orderDate, Double totalAmount, String status, String customerEmail,
                     List<Product> products, List<PaymentMethod> paymentMethods) {
                this.orderDate =orderDate;
                this.totalAmount = totalAmount;
                this.status = status;
                this.customerEmail = customerEmail;
                this.products = products;
                this.paymentMethods = paymentMethods;
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

        public List<Product> getProducts(){
                return products;
        }

        public List<PaymentMethod> getPaymentMethods(){
                return paymentMethods;
        }

        public void setProducts(List<Product> products){
                this.products=products;
        }

        public void setPaymentMethods(List<PaymentMethod> paymentMethods){
                this.paymentMethods=paymentMethods;
        }

}
