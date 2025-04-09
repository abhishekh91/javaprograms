package javaprograms;
import java.util.Scanner;
class logic{
    int fact(int num){
        if(num == 1) {return 1;}
        return num * fact(num-1);
    }
}

public class factorial {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scan.nextInt();

        logic obj = new logic();

        System.out.printf("factorial: %d\n",obj.fact(num));
        scan.close();
    }
}
