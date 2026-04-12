package NonStatic;

public class Main2 {
    int x=10; //Single Line Non-Static initializers

    public static void main(String[] args) {
        Main2 m=new Main2();
        System.out.println(m.x);
    }
}
