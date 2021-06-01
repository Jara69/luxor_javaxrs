package luxor.educanet;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class Luxor implements Serializable {
    private String id, title, author, glossary, price;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.id = id;
    }

    public String getAuthor(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getGlossary(){
        return glossary;
    }

    public void setGlossary(String glossary){
        this.glossary = glossary;
    }


    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }



}
