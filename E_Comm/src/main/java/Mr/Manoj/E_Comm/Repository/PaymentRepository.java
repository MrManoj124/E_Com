package Mr.Manoj.E_Comm.Repository;

import Mr.Manoj.E_Comm.Model.PaymentMethod;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<PaymentMethod, String> {
}
