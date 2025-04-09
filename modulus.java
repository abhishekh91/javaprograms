package javaprograms;
import java.util.Scanner;
public class modulus {
    public static void main(String args[]){
        int num1,num2;
        System.out.println("enter two numbers: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        System.out.printf("modulus: %d\n",(num1%num2));
        scan.close();
    }
}