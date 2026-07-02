package Mr.Manoj.E_Comm.Controller;

import Mr.Manoj.E_Comm.Model.PaymentMethod;
import Mr.Manoj.E_Comm.Service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class paymentController {

    @Autowired
    private PaymentMethodService service;

    @PostMapping
    public PaymentMethod addPayment(@RequestBody PaymentMethod payment) {
        return service.addPayment(payment);
    }

    @GetMapping
    public List<PaymentMethod> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public PaymentMethod getPaymentById(@PathVariable String id) {
        return service.getPaymentById(id);
    }

    @PutMapping("/{id}")
    public PaymentMethod updatePayment(@PathVariable String id, @RequestBody PaymentMethod payment) {
        return service.updatePayement(id, payment);
    }

    @PatchMapping("/{id}")
    public PaymentMethod patchPayment(@PathVariable String id, @RequestBody PaymentMethod payment) {
        return service.patchPayment(id, payment);
    }

    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable String id) {
        return service.deletePayment(id);
    }





}
