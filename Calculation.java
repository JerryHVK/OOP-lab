//Write a program to calculate sum, difference, product, and quotient of 2 double numbers which
//are entered by users

import javax.swing.*;

public class Calculation {
    public static void main(String[] args){
        String strNum1, strNum2;
        double a,b;
        double sum, diff, product, quotient;
        String strNotification;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ",
                "Input the first number ",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        sum = a + b;
        diff = a - b;
        product = a * b;
        quotient = a / b;

        //Sum
        strNotification = strNum1 + " + " + strNum2 + " = " + (sum + "");
        JOptionPane.showMessageDialog(null, strNotification,
                "Sum", JOptionPane.INFORMATION_MESSAGE);

        //Difference
        strNotification = strNum1 + " - " + strNum2 + " = " + (diff + "");
        JOptionPane.showMessageDialog(null, strNotification,
                "Difference", JOptionPane.INFORMATION_MESSAGE);

        //Product
        strNotification = strNum1 + " * " + strNum2 + " = " + (product + "");
        JOptionPane.showMessageDialog(null, strNotification,
                "Product", JOptionPane.INFORMATION_MESSAGE);

        //Quotient
        strNotification = strNum1 + " / " + strNum2 + " = " + (quotient + "");
        JOptionPane.showMessageDialog(null, strNotification,
                "Division", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
