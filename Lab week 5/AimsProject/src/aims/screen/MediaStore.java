package aims.screen;

import aims.cart.Cart;
import aims.media.Media;
import aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Media media;
    private Cart cart;
    public MediaStore(Media media, Cart cart){
        this.media = media;
        this.cart = cart;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel( media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton addingCart = new JButton("Add to cart");
        addingCart.addActionListener(new AddToCart());
//        container.add(new JButton("Add to cart"));
        container.add(addingCart);
        if(media instanceof Playable){
            JButton play = new JButton("Play");
            play.addActionListener(new PlayMedia());
//            container.add(new JButton("Play"));
            container.add(play);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

    }

    private class PlayMedia implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            JDialog dialog = new JDialog();
            dialog.setTitle("Playing " + media.getTitle());
            dialog.setSize(320, 180);
            dialog.setVisible(true);
        }
    }

    private class AddToCart implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cart.addMedia(media);
            System.out.println(media.getTitle() + " was added to cart!");
        }
    }

}