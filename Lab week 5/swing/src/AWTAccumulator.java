import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutPut;
    private int sum = 0;


    public AWTAccumulator(){
        setLayout(new GridLayout(2, 2));

        add(new Label("Enter an Integer: "));

        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        add(new Label("The Accumulated Sum is: "));

        tfOutPut = new TextField(10);
        tfOutPut.setEditable(false);
        add(tfOutPut);

        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);

    }

    public static void main(String[] args){
        new AWTAccumulator();
    }

    private class TFInputListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberInt = Integer.parseInt(tfInput.getText());
            sum += numberInt;
            tfInput.setText("");
            tfOutPut.setText(sum + "");
        }
    }
}
