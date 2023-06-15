package aims.cart;
import aims.media.DigitalVideoDisc;
import aims.media.Media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public boolean inCart(String title){
        for(Media i : itemsOrdered){
            if(i.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }

    public void sortByTitleCost(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }


    public void addMedia(Media media){
        if(itemsOrdered.size() == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full, no more added Media");
            return;
        }
        for(Media i : itemsOrdered){
            if(i.equals(media)){
                System.out.println("The media is already in the cart!");
                return;
            }
        }
        itemsOrdered.add(media);
        System.out.println("Successful adding");
    }

    public void removeMedia(Media media){
        if(itemsOrdered.isEmpty()){
            System.out.println("The cart is empty, no more remove");
        }
        int beforeRemove = itemsOrdered.size();
        itemsOrdered.remove(media);
        int afterRemove = itemsOrdered.size();
        if(beforeRemove == afterRemove){
            System.out.println("The media is not in the cart, no removal was done");
        }
        else{
            System.out.println("Successfully remove " + (beforeRemove - afterRemove) + " media!");
        }
    }

    public float totalCost(){
        float sum = 0;
        for(Media i : itemsOrdered){
            sum += i.getCost();
        }
        return sum;
    }

    public void printTheList(){
        for(int i=1; i<=25; i++){
            System.out.print("*");
        }
        System.out.print("CART");
        for(int i=1; i<=25; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Ordered Items");
        for(Media i : itemsOrdered){
            i.printMedia();
        }
        System.out.println("Total cost: " + totalCost());
        for(int i=1; i<=54; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void searchById(int id){
        for(Media i : itemsOrdered){
            if(i.getId() == id){
                System.out.println("The match result: ");
                i.printMedia();
                return;
            }
        }
        System.out.println("There is no match found");
    }

    public void searchByTitle(String title){
        int k=0;
        System.out.println("Result for searching");
        for(Media i : itemsOrdered){
            if(i.isMatch(title)){
                i.printMedia();
                k++;
            }
        }
        if(k == 0) System.out.println("There is no match");
    }

    public int numberOfDVD(){
        int num = 0;
        for(Media i : itemsOrdered){
            if(i instanceof DigitalVideoDisc){
                num++;
            }
        }
        return num;
    }

    public void makeEmpty(){
        itemsOrdered.removeAll(itemsOrdered);
    }
}