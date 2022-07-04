package MainHelloWorld;

import Hello.HelloWorld;

import java.util.ServiceLoader;

public class MainHelloWorld {
    public static void main(String[] args) {
        ServiceLoader<HelloWorld> loader = ServiceLoader.load(HelloWorld.class);
        loader.stream().forEach(h-> System.out.println(h.get().sayHello()));
    }
}
