package Mr.Manoj.E_Comm.Repository;

import Mr.Manoj.E_Comm.Model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
