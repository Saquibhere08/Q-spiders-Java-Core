package NonStatic;

public class Main3 {
    int x=10;
    {//Multi Line Non-Static Initializer
        int x=100; //It does not get Executed as the block executed the memory inside the block also get executed and finished.
        System.out.println("Blockk Executed");
        System.out.println(x); //X=100 only get executes inside the block
    }
    public static void main(String[] args) {
        Main3 m=new Main3();
        System.out.println(m.x);
    }
}
