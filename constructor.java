package javaprograms;
public class constructor {
    constructor(){
        System.out.println("default constructor called");
    }
    constructor(int num){
        System.out.println("parameterized constructor called");
    }

    public static void main(String args[]){
        constructor obj1 = new constructor();
        constructor obj2 = new constructor(10);
    }
}
