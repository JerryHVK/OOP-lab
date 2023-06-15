import java.util.Scanner;
public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int month, year;
        int a = 0;
        do{
            if(a > 0){
                System.out.println("Invalid month/year. Please enter again!");
            }
            System.out.print("Enter the month (For example: January, Jan., Jan or 1 to for January): ");
            String strMonth = keyboard.nextLine();

            switch (strMonth){
                case "January", "Jan.", "Jan", "1":
                    month = 1;
                    break;
                case "February", "Feb.", "Feb", "2":
                    month = 2;
                    break;
                case "March", "Mar.", "Mar", "3":
                    month = 3;
                    break;
                case "April", "Apr.", "Apr", "4":
                    month = 4;
                    break;
                case "May", "5":
                    month = 5;
                    break;
                case "June", "Jun", "6":
                    month = 6;
                    break;
                case "July", "Jul", "7":
                    month = 7;
                    break;
                case "August", "Aug.", "Aug", "8":
                    month = 8;
                    break;
                case "September", "Sept.", "Sep", "9":
                    month = 9;
                    break;
                case "October", "Oct.", "Oct", "10":
                    month = 10;
                    break;
                case "November", "Nov.", "Nov", "11":
                    month = 11;
                    break;
                case "December", "Dec.", "Dec", "12":
                    month = 12;
                    break;
                default:
                    month = 0;
                    break;
            }

            System.out.print("Enter the year (For example: 2023): ");
            year = keyboard.nextInt();
            keyboard.nextLine();
            a++;
        }while( month == 0 || year < 1);

        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("There are 31 days in month " + (month + "") + "/" + (year + ""));
                break;
            case 4, 6, 9, 11:
                System.out.println("There are 30 days in month " + (month + "") + "/" + (year + ""));
                break;
            case 2:
                if(year % 100 == 0 && year % 4 == 0){
                    System.out.println("There are 29 days in month " + (month + "") + "/" + (year + ""));
                }
                else if(year % 4 == 0){
                    System.out.println("There are 29 days in month " + (month + "") + "/" + (year + ""));
                }
                else{
                    System.out.println("There are 28 days in month " + (month + "") + "/" + (year + ""));
                }
                break;

        }

    }
}