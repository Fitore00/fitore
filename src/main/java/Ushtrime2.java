import java.util.Scanner;

public class Ushtrime2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Sheno notat:");
        int sa = 5;
        int notat = 1;
        int shuma = 0;

        while (notat <= sa){
            int numri = input.nextInt();
           double total = shuma + numri;
            notat++;
        }
        System.out.print("Mesatarja:\n"  +shuma /sa);
    }
}
