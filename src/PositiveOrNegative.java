import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a number to verify " +
                "\nif it is a positive or a negative:\n>");
        int num_input = input.nextInt();
        if (num_input > 0){
            System.out.println(num_input+" is a positive number.");
        }
        else if (num_input < 0){
            System.out.println(num_input+" is a negative number.");
        }
        else {
            System.out.println("Zero is neutral. Neither positive nor negative.");

        }
    }
}
