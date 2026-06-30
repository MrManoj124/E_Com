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

    //getter and setter
    public String getPaymentId(){
        return paymentId;
    }

    public String getPaymentType(){
        return paymentType;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public void setPaymentId(String paymentId){
        this.paymentId=paymentId;
    }

    public void setPaymentType(String paymentType){
        this.paymentType=paymentType;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate=expiryDate;
    }


}
