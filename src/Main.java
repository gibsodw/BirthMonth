import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        System.out.print("Enter your birth month [1 - 12]: ");

        if(in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("You said your birth month is " + birthMonth);
            } else {
                System.out.println("You said your birth month is " + birthMonth);
                System.out.println("But, it has to be in [1 - 12] and it is not ");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and do proper input. ");
        }


    }
}