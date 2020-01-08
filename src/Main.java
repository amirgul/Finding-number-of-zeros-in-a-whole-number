import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        System.out.println(getNumberOfZeros(number) + " ");


    }
    public static int getNumberOfZeros(int number)
    {
        int result;
        if(number <10)
        {
            result = 0;

        }
        else if(number == 0)
            result = 1;
        else if(number%10 == 0)
            result = getNumberOfZeros(number/10) +1;
        else
            result = getNumberOfZeros(number/10);

        return  result;

    }

}
