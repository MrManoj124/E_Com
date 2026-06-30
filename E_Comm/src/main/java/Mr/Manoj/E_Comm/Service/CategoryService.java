package Mr.Manoj.E_Comm.Service;

import Mr.Manoj.E_Comm.Model.Category;
import Mr.Manoj.E_Comm.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private final CategoryRepository categoryrepo;

    public CategoryService(CategoryRepository categoryRepo){
        this.categoryrepo=categoryRepo;
    }

    public Category postcat(Category category){
        return categoryrepo.save(category);
    }

    public Category getById(String id) {
        return categoryrepo.findById(id).orElse(null);
    }

    public Category update(String id, Category category){
        Category existing = categoryrepo.findById(id).orElse(null);
        if(existing != null){
            existing.setCategoryName(category.getCategoryName());
            existing.setDescription(category.getDescription());
            return categoryrepo.save(existing);
        }
        return null;
    }

    public String delete(String id){
        Category existing = categoryrepo.findById(id).orElse(null);
        if(existing != null){
            categoryrepo.deleteById(id);
            return "Category deleted Succesfully";
        }
        return "Category not found";
    }

    public Category patchcat(String id, Category category){
        Category existingcat = categoryrepo.findById(id).orElse(null);

        if(existingcat == null){
            return  null;
        }

        if(category.getCategoryName() != null){
            existingcat.setCategoryName(category.getCategoryName());
        }

        if(category.getDescription() != null){
            existingcat.setDescription(category.getDescription());
        }

        return categoryrepo.save(existingcat);
    }
}
