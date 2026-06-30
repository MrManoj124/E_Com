package Mr.Manoj.E_Comm.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
public class Category {

    @Id
    private String categoryId;

    private String categoryName;
    private String description;

    //Deafault parameter
    public Category(){}

    // Parameterized constructor
    public Category(String categoryName, String description){
        this.categoryName=categoryName;
        this.description=description;
    }

    // getters and setters
    public String getCategoryId(){
        return categoryId;
    }

    public String getCategoryName(){
        return categoryName;
    }

    public String getDescription(){
        return description;
    }

    public void setCategoryId(String categoryId){
        this.categoryId=categoryId;
    }

    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }

    public void setDescription(String description){
        this.description=description;
    }


}
