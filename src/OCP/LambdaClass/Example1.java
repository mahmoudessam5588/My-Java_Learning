package OCP.LambdaClass;
public class Example1 {
    public static void main(String[] args) {
        Instrument i= x-> System.out.println(":)");
        i.play(10);
    }
}
