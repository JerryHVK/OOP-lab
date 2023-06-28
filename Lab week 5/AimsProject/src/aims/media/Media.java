package aims.media;

import java.util.Comparator;


public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();




    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    public boolean isMatch(String title){
        String k1[] = title.split(" ", -1);
        String k2[] = this.title.split(" ", -1);
        for(String i : k1){
            for(String j : k2){
                if(i.equalsIgnoreCase(j)){
                    return true;
                }
            }
        }
        return false;
    }


    public void printMedia(){
        System.out.println(this.id + " - " + this.title + " - " + this.category + " - " + this.cost);
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        if(!(o instanceof Media)){
            return false;
        }

        Media media = (Media) o;
        if(!this.title.equalsIgnoreCase(media.getTitle())){
            return false;
        }
        return true;
    }
}

class MediaComparatorByTitleCost implements Comparator<Media> {


    @Override
    public int compare(Media o1, Media o2) {
        int titleComparation = o1.getTitle().compareTo(o2.getTitle());
        if(titleComparation == 0){
            return Float.compare(o1.getCost(), o2.getCost());
        } else{
            return titleComparation;
        }
    }
}

class MediaComparatorByCostTitle implements Comparator<Media>{

    @Override
    public int compare(Media o1, Media o2) {
        int costComparation = Float.compare(o1.getCost(), o2.getCost());
        if(costComparation == 0){
            return o1.getTitle().compareTo(o2.getTitle());
        } else{
            return costComparation;
        }
    }
}
