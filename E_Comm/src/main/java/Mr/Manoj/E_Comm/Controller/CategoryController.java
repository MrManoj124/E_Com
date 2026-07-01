package Mr.Manoj.E_Comm.Controller;

import Mr.Manoj.E_Comm.Model.Category;
import Mr.Manoj.E_Comm.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping
    public Category postCat(@RequestBody Category category){
        return service.postCat(category);
    }

    @GetMapping
    public List<Category> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable String id){
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Category update(@PathVariable String id, @RequestBody Category category){
        return service.update(id, category);
    }

    @PatchMapping("/{id}")
    public Category patchcat(@PathVariable String id, @RequestBody Category category){
        return service.patchcat(id, category);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        service.delete(id);
        return "Category deleted Successfully";
    }

}
