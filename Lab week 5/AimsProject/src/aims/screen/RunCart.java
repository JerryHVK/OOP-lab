package aims.screen;

import aims.cart.Cart;
import aims.media.Book;
import aims.media.DigitalVideoDisc;

public class RunCart {

    public static void main(String[] args){
        Cart cart = new Cart();
        cart.addMedia(new DigitalVideoDisc("Dragon", "cartoon", 12.3f));
        cart.addMedia(new Book("Harry Potter", "Story", 44f));

        new CartScreen(cart);
    }

}
