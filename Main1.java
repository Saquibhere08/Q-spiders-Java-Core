package NonStatic;

public class Main1 {
    public static void main(String[] args)
    {
        Pokemon p1=new Pokemon();
        p1.name="Pikachu";
        p1.level=16;


        Pokemon p2=new Pokemon();
        p2.name="Tigeroscores";
        p2.level=10;


        Pokemon p3=new Pokemon();
        p3.name="Sambha";
        p3.level=7;

        System.out.println(p1.name+ " "+ p1.level);
        p1.attack();

        System.out.println(p2.name+ " "+ p2.level);
        p2.attack();

        System.out.println(p3.name+ " "+ p3.level);
        p3.attack();
    }
}
