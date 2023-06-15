package aims.cart;

import aims.disc.DigitalVideoDisc;

public class Cart {

    private int qtyOrdered = 0;

    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == 20){
            System.out.println("Full cart, no more disc allowed");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("Add disc completely");
    }

    //Method Overloading
//    public void addDigitalVideoDisc(aims.disc.DigitalVideoDisc [] dvdList){
//        int c = 0;
//        int n = dvdList.length;
//        for(int i=0; i < n; i++){
//            if(qtyOrdered == 20){
//                System.out.println("Full cart, no more disc allowed");
//                break;
//            }
//            itemsOrdered[qtyOrdered] = dvdList[i];
//            qtyOrdered++;
//            c++;
//        }
//        System.out.println("There are " + c + "/" + n + " DVD added in the list");
//
//    }

    public void addDigitalVideoDisc(DigitalVideoDisc...dvdList){
        int c = 0;
        int n = dvdList.length;
        for(int i=0; i < n; i++){
            if(qtyOrdered == 20){
                System.out.println("Full cart, no more disc allowed");
                break;
            }
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered++;
            c++;
        }
        System.out.println("There are " + c + "/" + n + " DVD added in the list");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if(qtyOrdered == 20){
            System.out.println("Full cart, no more disc allowed");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd1;
        qtyOrdered++;
        if(qtyOrdered == 20){
            System.out.println("Full cart, no more disc allowed");
            System.out.println("There is only the first dvd was added in cart");
            return;
        }
        itemsOrdered[qtyOrdered] = dvd2;
        qtyOrdered++;
        System.out.println("Complete!");
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        System.out.println("Your cart BEFORE remove: ");
        for(int i=0; i<qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle());
        }
        int count = 0;
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i].getTitle().equals(disc.getTitle())){
                count++;
                qtyOrdered--;
                for(int j=i; j<qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                i--;
            }
        }
        if(count == 0){
            System.out.println("This disc is not in your cart! No removal was conducted");
        }
        else{
            System.out.println("Removed " + (count + " ") + "successfully");
        }
        System.out.println("Your cart AFTER remove: ");
        for(int i=0; i<qtyOrdered; i++){
            System.out.println(itemsOrdered[i].getTitle());
        }
    }

    public float totalCost(){
        float sum = 0;
        for(int i=0; i<qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
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

        for(int i=0; i < qtyOrdered; i++){
            itemsOrdered[i].toString();
        }

        System.out.println("Total cost: " + totalCost());

        for(int i=1; i<=54; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void searchById(int id){
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i].getId() == id){
                System.out.println("The match result: ");
                itemsOrdered[i].toString();
                return;
            }
        }
        System.out.println("There is no match found");
    }

    public void searchByTitle(String title){
        int k=0;
        System.out.println("Result for searching");
        for(int i=0; i<qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(title)){
                itemsOrdered[i].toString();
                k++;
            }
        }
        if(k == 0) System.out.println("There is no match");
    }

}
