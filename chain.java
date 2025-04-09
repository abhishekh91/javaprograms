package javaprograms;
public class chain {
    chain(){
        this(10);
        System.out.println("default called");
    }
    chain (int x){
        System.out.println("para1 called");
    }
    public static void main(String args[]){
        chain obj = new chain();
        obj = null;
    }
}
