import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the height of the triangle: ");
        int n = keyboard.nextInt();

        int a = 1 + (n-1)*2;
        System.out.println("This is your triangle");
        for(int i=1; i<=a; i += 2){
            for(int j=1; j<= (a-i)/2; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<= (a-i)/2; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}