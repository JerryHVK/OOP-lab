import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double n;
        double sum = 0, avg;
        double arr[] = new double[100];

        System.out.print("Enter the number of elements in the array: ");
        n = keyboard.nextDouble();

        for(int i=1; i<=n; i++){
            System.out.print("arr[" + (i + "") + "] = " );
            arr[i] = keyboard.nextDouble();
            sum += arr[i];
        }

        avg = sum/n;

        for(int i=1; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(arr[i] > arr[j]){
                    double t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Your array: ");
        for(int i=1; i<=n; i++){
            System.out.print((arr[i] + "") + " ");
        }
        System.out.println();
        System.out.println("The sum = " + (sum + ""));
        System.out.println("The average = " + (avg + ""));
    }
}