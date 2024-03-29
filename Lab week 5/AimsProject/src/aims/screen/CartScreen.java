package aims.screen;

import aims.cart.Cart;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart){
        super();
        this.cart = cart;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setVisible(true);
        this.setSize(1024, 600);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("CartScreen.fxml"));
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                }catch (Exception e){
                    System.out.println("Error loading FXML file:");
                    e.printStackTrace();
                }
            }
        });

    }
}

