package aims.disc;

import org.jetbrains.annotations.NotNull;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDisc = 0;

    private int id;


    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() { return id; }

    public DigitalVideoDisc(String title) {
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
        this.title = title;

    }

//    No, it has the same method signature as the above one
//
//    public aims.disc.DigitalVideoDisc(String category){
//        this.category = category;
//    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    //@Override
    public String toString(){
        System.out.println(id + ". DVD - " + title + " - " + category + " - "
                + director + " - " + length + ": " + cost) ;
        return null;
    }


    public boolean isMatch(String title){
        String[] k1 = title.split(" ", -1);
        String[] k2 = this.title.split(" ", -1);
        for(int i=0; i<k2.length; i++){
            for(int j=0; j<k1.length; j++){
                if(k1[j].equalsIgnoreCase(k2[i])) return true;
            }
        }
        return false;
    }

}
