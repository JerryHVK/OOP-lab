import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int m, n;
        double a[][] = new double[100][100];
        double b[][] = new double[100][100];

        do {
            System.out.print("Enter number of rows ( > 0): ");
            m = keyboard.nextInt();
        }while(m <= 0);

        do {
            System.out.print("Enter number of columns ( > 0): ");
            n = keyboard.nextInt();
        }while(n <= 0);

        System.out.println("Input the first matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = keyboard.nextDouble();
            }
        }

        System.out.println("Input the second matrix: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                b[i][j] = keyboard.nextDouble();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] += b[i][j];
            }
        }

        System.out.println("The result of the addtion: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print((a[i][j] + "") + "  ");
            }
            System.out.println();
        }

    }
}