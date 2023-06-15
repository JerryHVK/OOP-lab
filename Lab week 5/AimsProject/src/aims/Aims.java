package aims;

import aims.disc.DigitalVideoDisc;
import aims.store.Store;

public class Aims {
    public static void main(String[] args) {


        //Create a new cart
        //aims.cart.Cart anOrder = new aims.cart.Cart();

        //Create new DVD objects and add them to the cart
//        aims.disc.DigitalVideoDisc dvd1 = new aims.disc.DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//
//        aims.disc.DigitalVideoDisc dvd2 = new aims.disc.DigitalVideoDisc("Star Wars",
//                "Science Fiction", "Geoge Lucas", 87, 24.95f);
//
//        aims.disc.DigitalVideoDisc dvd3 = new aims.disc.DigitalVideoDisc("Aladin",
//                "Animation", 18.99f);
//
//        anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);

//        aims.disc.DigitalVideoDisc dvd4 = new aims.disc.DigitalVideoDisc("Aladin",
//                "Animation", 18.99f);
//        anOrder.addDigitalVideoDisc(dvd4);
//
//        aims.disc.DigitalVideoDisc dvd5 = new aims.disc.DigitalVideoDisc("The Lion King",
//                "Animation", "Roger Allers", 87, 19.95f);
//        anOrder.addDigitalVideoDisc(dvd5);
//
//        if(dvd1 == dvd5){
//            System.out.println("Equal");
//        }
//        else{
//            System.out.println("Not Equal");
//        }


        //print total cost of the items in the cart
//        System.out.println("Total Cost is: ");
//        System.out.println(anOrder.totalCost());
//
//        anOrder.removeDigitalVideoDisc(dvd3);

        //aims.cart.Cart anOrder = new aims.cart.Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "Geoge Lucas", 87, 24.95f);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        //aims.disc.DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};

        //anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
        //anOrder.printTheList();

        //anOrder.searchById(4);
        //anOrder.searchByTitle("My lion");
        //anOrder.searchByTitle("Crazy man");

        Store jerry = new Store();
        jerry.addDVD(dvd1);
        jerry.addDVD(dvd2);
        jerry.addDVD(dvd3);

        jerry.printTheStoreList();

        jerry.removeDVD(dvd1);
        jerry.printTheStoreList();
    }
}