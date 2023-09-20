import matematik.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız:");

        String name = scanner.nextLine();

        System.out.println("Merhaba " + name);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2, 3);
        Logaritma logaritma = new Logaritma();
    }
}