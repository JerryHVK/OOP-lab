package aims.screen;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.DigitalVideoDisc;
import aims.store.Store;

public class RunStore {

    public static void main(String[] args){
        Store store = new Store();
        Cart cart = new Cart();
        store.addMedia(new DigitalVideoDisc("Dragon", "Cartoon", 12.2f));
        store.addMedia(new Book("Harry Potter", 30f));
        store.addMedia(new Book("Oke", 34f));
        store.addMedia(new DigitalVideoDisc("Dragon", "Cartoon", 12.2f));
        store.addMedia(new Book("Harry Potter", 30f));
        store.addMedia(new DigitalVideoDisc("Dragon", "Cartoon", 12.2f));
        store.addMedia(new Book("Harry Potter", 30f));
        store.addMedia(new DigitalVideoDisc("Dragon", "Cartoon", 12.2f));
        store.addMedia(new Book("Harry Potter", 30f));

        new StoreScreen(store, cart);
    }
}
