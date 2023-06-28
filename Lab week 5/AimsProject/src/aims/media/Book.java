package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book(){}
    public Book(String name, float cost){
        super();
        this.setTitle(name);
        this.setCost(cost);
    }

    public Book(String name, String category, float cost) {
        super();
        this.setTitle(name);
        this.setCategory(category);
        this.setCost(cost);
    }

    public void addAuthor(String authorName){
        for(String i : authors){
            if(i.equalsIgnoreCase(authorName)){
                System.out.println("This author's name is already in the list of authors");
                return;
            }
        }
        authors.add(authorName);
    }
    public void removeAuthor(String authorName){
        for(String i : authors){
            if(i.equalsIgnoreCase(authorName)){
                authors.remove(i);
                return;
            }
        }
        System.out.println("This author is not in the author list");
    }

}
