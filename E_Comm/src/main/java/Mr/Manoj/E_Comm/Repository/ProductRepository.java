package Mr.Manoj.E_Comm.Repository;

import Mr.Manoj.E_Comm.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
