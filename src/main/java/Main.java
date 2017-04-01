import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int number01 = scanner.nextInt();
        int number02 = scanner.nextInt();
        if(number01 < number02){
            System.out.println(number01);
        }
        if(number01 > number02){
            System.out.println(number02);
        }
        if(number01 == number02){
            System.out.println(number01);
        }
    }
}
