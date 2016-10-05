import java.util.Scanner;

/**
 * Created by Sola2Be on 03.10.2016.
 *
 * Object (@code Utile) is creating and waiting
 * for input string for start check.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Util util = new Util();
        util.check(scanner.next());

    }
}
