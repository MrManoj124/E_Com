package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;

public class PaymentMethod {
    @Id
    private String paymentId;

    private String paymentType;
    private String  accountNumber;
    private String expiryDate;

    // default constructor
    public PaymentMethod(){}

    //parameterized constructor
    public PaymentMethod(String paymentType, String accountNumber, String expiryDate){
        this.paymentType=paymentType;
        this.accountNumber=accountNumber;
        this.expiryDate=expiryDate;
    }




}
