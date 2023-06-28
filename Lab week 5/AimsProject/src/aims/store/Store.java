package aims.store;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

import java.util.ArrayList;

public class Store {
    public static final int MAX_NUMBERS_STORE = 100;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public boolean inStore(String title){
        for(Media media : itemsInStore){
            if(media.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }

    public void addMedia(Media media){
        if(itemsInStore.size() == MAX_NUMBERS_STORE){
            System.out.println("The store is full, no added media");
            return;
        }
        itemsInStore.add(media);
        System.out.println("Added Completely!");
    }

    public void removeMedia(Media media){
        if(itemsInStore.isEmpty()){
            System.out.println("The store is empty, no removal was done");
            return;
        }
        int beforeRemove = itemsInStore.size();
        itemsInStore.remove(media);
        int afterRemove = itemsInStore.size();
        if(beforeRemove == afterRemove){
            System.out.println("This disc is not in the store! No removal was conducted");
        }
        else{
            System.out.println("Removed " + ((beforeRemove - afterRemove) + " ") + "successfully");
        }
        System.out.println("The store AFTER remove: ");
        for(Media i : itemsInStore){
            printTheStoreList();
        }
    }

    public void printTheStoreList(){
        System.out.println("The list in store");
        for(Media i : itemsInStore){
            i.printMedia();
        }
    }

    public ArrayList<Media> getItemsInStore(){
        return itemsInStore;
    }
}
