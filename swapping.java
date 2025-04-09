package javaprograms;
public class swapping {
    public static void main(String args[]){
        int num1 = 10, num2  = 20;
        System.out.printf("before: a -> %d and b -> %d\n",num1,num2);

        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.printf("after: a -> %d and b -> %d\n",num1,num2);
    }
}
