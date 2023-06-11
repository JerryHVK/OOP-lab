package aims;

import aims.cart.Cart;
import aims.media.*;
import aims.store.Store;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;
    public static void main(String[] args) {
        while (true) {
            showMenu();
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    storeMenu();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Thanks for using the program");
                    return;
                default:
                    System.out.println("Invalid input, please re-enter the option");
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");

    }

    public static void storeMenu() {
        store.printTheStoreList();

        while(true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media’s details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mediaDetailsMenu();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("End of store menu show");
                    return;
                default:
                    System.out.println("Invalid option, please re-enter");
                    break;
            }

        }

    }

    public static void updateStore(){

        while(true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to store");
            System.out.println("2. Remove from store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input, please re-enter the option");
                    break;
            }
        }
    }

    public static void addMediaToStore(){
        System.out.println("Please enter the title of media: ");
        scanner.nextLine();
        String title = scanner.nextLine();

        DigitalVideoDisc dvd = new DigitalVideoDisc(title);
        store.addMedia(dvd);
    }

    public static void removeMediaFromStore(){
        System.out.println("Please enter the title of media: ");
        scanner.nextLine();
        String title = scanner.nextLine();

        if(store.inStore(title)){
            DigitalVideoDisc dvd = new DigitalVideoDisc(title);
            store.removeMedia(dvd);
            System.out.println("Removing complete!");
        } else{
            System.out.println("This media is not in the store");
        }
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    filterMediasInCart();
                    break;
                case 2:
                    sortMediasInCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playAMediaInCart();
                    break;
                case 5:
                    System.out.println("The order was created");
                    cart.makeEmpty();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input, please re-enter the option");
            }
        }
    }

    public static void addMediaToCart(){
        System.out.println("Please enter the title of media: ");
        scanner.nextLine();
        String title = scanner.nextLine();

        if(store.inStore(title)){
            DigitalVideoDisc dvd = new DigitalVideoDisc(title);
            cart.addMedia(dvd);
            System.out.println("Adding complete!");
            System.out.println("Number of DVDs in cart: " + cart.numberOfDVD());
        } else{
            System.out.println("This media is not in the store");
        }
    }

    public static void playAMediaInStore(){
        System.out.println("Please enter the title of media: ");
        scanner.nextLine();
        String title = scanner.nextLine();

        if(store.inStore(title)){
            System.out.println("Playing " + title);
        } else{
            System.out.println("This media is not in the store");
        }
    }

    public static void playAMediaInCart(){
        System.out.println("Please enter the title of media: ");
        scanner.nextLine();
        String title = scanner.nextLine();

        if(cart.inCart(title)){
            System.out.println("Playing " + title);
        } else{
            System.out.println("This media is not in the cart");
        }
    }

    public static void filterMediasInCart(){
        while(true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter by id");
            System.out.println("2. Filter by title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            scanner.nextLine();
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    int id = scanner.nextInt();

                    cart.searchById(id);
                    break;
                case 2:
                    scanner.nextLine();
                    String title = scanner.nextLine();

                    cart.searchByTitle(title);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input, please re-enter the option");
                    break;
            }
        }
    }

    public static void sortMediasInCart(){
        while(true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort by title");
            System.out.println("2. Sort by cost");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    cart.sortByTitleCost();
                    System.out.println("Complete!");
                    cart.printTheList();
                    break;
                case 2:
                    cart.sortByCostTitle();
                    System.out.println("Complete!");
                    cart.printTheList();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input, please re-enter the option");
                    break;
            }
        }
    }

    public static void removeMediaFromCart(){
        System.out.println("Please enter the title of media: ");
        scanner.nextLine();
        String title = scanner.nextLine();

        if(cart.inCart(title)){
            DigitalVideoDisc dvd = new DigitalVideoDisc(title);
            cart.removeMedia(dvd);
            System.out.println("Removing complete!");
        } else{
            System.out.println("This media is not in the cart");
        }
    }
}


