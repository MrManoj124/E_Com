package Mr.Manoj.E_Comm.Service;

import Mr.Manoj.E_Comm.Model.Category;
import Mr.Manoj.E_Comm.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private final CategoryRepository categoryRepo;

    public CategoryService(CategoryRepository categoryRepo){
        this.categoryRepo=categoryRepo;
    }

    public List<Category> getAll(){
        return categoryRepo.findAll();
    }

    public Category postCat(Category category){
        return categoryRepo.save(category);
    }

    public Category getById(String id) {
        return categoryRepo.findById(id).orElse(null);
    }

    public Category update(String id, Category category){
        Category existing = categoryRepo.findById(id).orElse(null);
        if(existing != null){
            existing.setCategoryName(category.getCategoryName());
            existing.setDescription(category.getDescription());
            return categoryRepo.save(existing);
        }
        return null;
    }

    public String delete(String id){
        Category existing = categoryRepo.findById(id).orElse(null);
        if(existing != null){
            categoryRepo.deleteById(id);
            return "Category deleted Succesfully";
        }
        return "Category not found";
    }

    public Category patchcat(String id, Category category){
        Category existingcat = categoryRepo.findById(id).orElse(null);

        if(existingcat == null){
            return  null;
        }

        if(category.getCategoryName() != null){
            existingcat.setCategoryName(category.getCategoryName());
        }

        if(category.getDescription() != null){
            existingcat.setDescription(category.getDescription());
        }

        return categoryRepo.save(existingcat);
    }
}
