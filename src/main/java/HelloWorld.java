import java.util.Scanner;

public class HelloWorld {
    static void printHelloName() {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        printHelloName();
    }
}
