package aims.store;

import aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_STORE = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_STORE];
    private int qtyItem = 0;

    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore[qtyItem] = dvd;
        qtyItem++;
        System.out.println("Added Completely!");
    }

    public void removeDVD(DigitalVideoDisc dvd){
        int count = 0;
        for(int i=0; i<qtyItem; i++){
            if(itemsInStore[i].getTitle().equals(dvd.getTitle())){
                count++;
                qtyItem--;
                for(int j=i; j<qtyItem; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                i--;
            }
        }
        if(count == 0){
            System.out.println("This disc is not in the store! No removal was conducted");
        }
        else{
            System.out.println("Removed " + (count + " ") + "successfully");
        }
        System.out.println("The store AFTER remove: ");
        for(int i=0; i<qtyItem; i++){
            System.out.println(itemsInStore[i].getTitle());
        }
    }

    public void printTheStoreList(){
        System.out.println("The list in store");
        for(int i=0; i<qtyItem; i++){
            itemsInStore[i].toString();
        }
    }
}
