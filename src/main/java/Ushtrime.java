import java.util.Scanner;

public class Ushtrime {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Shkruaj numrat:");
        int numri1 = 0;
        int numri2 = 0;
        double numri3 = 0;

        while (numri1 != -1) {
            numri1 = input.nextInt();
            numri2 = input.nextInt();
            numri3 = input.nextDouble();

            double total = numri1 - numri2 * numri3;
            System.out.println(+total);
            System.out.print("Done");
        }
            System.out.println("Error");





    }
}
