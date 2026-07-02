package Mr.Manoj.E_Comm.Service;

import Mr.Manoj.E_Comm.Model.PaymentMethod;
import Mr.Manoj.E_Comm.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {
    @Autowired
    private final PaymentRepository paymentRepo;

    public PaymentMethodService(PaymentRepository paymentRepo){
        this.paymentRepo=paymentRepo;
    }

    public PaymentMethod addPayment(PaymentMethod payment){
        return paymentRepo.save(payment);
    }

    public List<PaymentMethod> getAll(){
        return paymentRepo.findAll();
    }

    public PaymentMethod getPaymentById(String id){
        return paymentRepo.findById(id).orElse(null);
    }

    public PaymentMethod updatePayement(String id, PaymentMethod payment){
        PaymentMethod payments = getPaymentById(id);

        if(payments != null){
            payments.setPaymentType(payment.getPaymentType());
            payments.setAccountNumber(payment.getAccountNumber());
            payments.setExpiryDate(payment.getExpiryDate());

            return paymentRepo.save(payments);
        }

        return null;
    }

    public PaymentMethod patchPayment(String id, PaymentMethod payment){
        PaymentMethod existing = paymentRepo.findById(id).orElse(null);

        if(existing != null){
            if(existing.getPaymentType() != null){
                existing.setPaymentType(payment.getPaymentType());
            }

            if(existing.getAccountNumber() != null){
                existing.setAccountNumber(payment.getAccountNumber());
            }

            if(existing.getExpiryDate() != null){
                existing.setExpiryDate(payment.getExpiryDate());
            }

            return paymentRepo.save(existing    );
        }
        return null;
    }

    public String deletePayment(String id){
        paymentRepo.deleteById(id);
        return "Payment deleted Successfully";
    }

}


