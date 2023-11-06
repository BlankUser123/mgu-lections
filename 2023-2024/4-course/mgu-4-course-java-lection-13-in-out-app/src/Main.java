import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

        scanner.close();

        
    }
}