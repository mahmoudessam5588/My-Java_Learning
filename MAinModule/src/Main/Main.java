package Main;




import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?>c = Class.forName("Example.Example");
            Constructor cons = c.getDeclaredConstructor();
            Object o = cons.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
