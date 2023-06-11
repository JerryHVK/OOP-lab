// Example 6: SolveEquation

import javax.swing.*;

public class SolveEquation {
    public static void main(String[] args) {
        int choice;
        double a, b, c;
        double a11, a12, a21, a22, b1, b2;
        double x, y;
        double D, D1, D2;
        String strNum;

        while (true) {
            strNum = JOptionPane.showInputDialog(null,
                    "1. First-degree equation\n" +
                            "2. System of first-degree equations\n" +
                            "3. Second-degree equation\n" +
                            "Otherwise: Exit\n", "Enter your choice",
                    JOptionPane.INFORMATION_MESSAGE);

            choice = Integer.parseInt(strNum);
            switch(choice) {
                case 1: // The first-degree equation (linear equation) with one variable
                    strNum = JOptionPane.showInputDialog(null, "Enter a = ",
                            "First-degree equation", JOptionPane.INFORMATION_MESSAGE);

                    a = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter b = ",
                            "First-degree equation", JOptionPane.INFORMATION_MESSAGE);

                    b = Double.parseDouble(strNum);

                    if(a == 0){
                        if(b == 0){
                            JOptionPane.showMessageDialog(null,
                                    "There are infinite solutions for equation " + (a + "")
                                            + "x + " + (b + "") + "= 0 ",
                                    "First-degree equation", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,
                                    "There is no solution for equation " + (a + "")
                                            + "x + " + (b + "") + "= 0 ",
                                    "First-degree equation", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else{
                        x = -b/a;
                        JOptionPane.showMessageDialog(null,
                                "The solution for equation " + (a + "")
                                        + "x + " + (b + "") + "= 0  is x = " + (x + ""),
                                "First-degree equation", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 2: // The system of first-degree equations (linear system) with two variable
                    strNum = JOptionPane.showInputDialog(null, "Enter a11 = ",
                            "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);

                    a11 = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter a12 = ",
                            "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);

                    a12 = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter b1 = ",
                            "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);

                    b1 = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter a21 = ",
                            "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);

                    a21 = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter a22 = ",
                            "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);

                    a22 = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter b2 = ",
                            "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);

                    b2 = Double.parseDouble(strNum);

                    D = a11*a22 - a12*a21;
                    D1 = b1*a22 - b2*a12;
                    D2 = a11*b2 - a21*b1;

                    if(D == 0){
                        JOptionPane.showMessageDialog(null,
                                "There is no solution",
                                "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        x = D1/D;
                        y = D2/D;

                        JOptionPane.showMessageDialog(null,
                                "x = " + (x + "") + ", y = " + (y + ""),
                                "System of first-degree equations", JOptionPane.INFORMATION_MESSAGE);
                    }

                    break;

                case 3: // The second-degree equation with one variable
                    strNum = JOptionPane.showInputDialog(null, "Enter a = ",
                            "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);

                    a = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter b = ",
                            "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);

                    b = Double.parseDouble(strNum);

                    strNum = JOptionPane.showInputDialog(null, "Enter c = ",
                            "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);

                    c = Double.parseDouble(strNum);

                    if(a == 0){
                        if(b == 0){
                            if(c == 0){
                                JOptionPane.showMessageDialog(null,
                                        "There are infinite solutions for the equation",
                                        "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                JOptionPane.showMessageDialog(null,
                                        "There is no solution for the equation ",
                                        "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else{
                            x = -c/b;
                            JOptionPane.showMessageDialog(null,
                                    "The solution for the equation is x = " + (x + ""),
                                    "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else{
                        D = b*b - 4*a*c;
                        if(D < 0){
                            JOptionPane.showMessageDialog(null,
                                    "There is no solution for the equation ",
                                    "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);
                        }else if(D == 0){
                            x = -b/(2*a);
                            JOptionPane.showMessageDialog(null,
                                    "There is one solution, x = " + (x + ""),
                                    "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            D = Math.sqrt(D);
                            x = (-b + D)/(4*a*c);
                            y = (-b - D)/(4*a*c);
                            JOptionPane.showMessageDialog(null,
                                    "There are two solutions, x1 = " + (x + "") +
                                            " and x2 = " + (y + ""),
                                    "Second-degree equation", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Thanks for using the program",
                            "Exit", JOptionPane.INFORMATION_MESSAGE);
                    return;
            }
        }
    }

}
