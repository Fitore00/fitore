import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sheno nje numer:");
        int userinput = input.nextInt();

        while (userinput != 0) {
            System.out.println(userinput--);
        }
        // #1 userinput=13  count=1  True
        // #2  userinput=12  count=1  True
        //#3  userinput=11 count=1  True
        //11 userinput=2 count=1 True
        //#12 userinput=1 count=1 True
        //#13 userinput=0 count=1 False
    }
}
