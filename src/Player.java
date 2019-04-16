import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    int shootX;
    int shootY;

    int doShootX() {
        System.out.println("Введи координату выстрела X от 1 до 10");
        while (true) {
            if (scanner.hasNextInt()) {
                int tmp = scanner.nextInt() - 1;
                if ((tmp > Cell.SIZE) || (tmp < 0)) {
                    System.out.println("Введи ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ число от 1 до 10");
                } else {
                    shootX = tmp;
                    break;
                }
            } else {
                System.out.println("Введите целое положительное число от 1 до 10");
                scanner.nextLine();
            }
        }
        return shootX;
    }

    int doShootY() {
        System.out.println("Введи координату выстрела Y от 1 до 10");
        while (true) {
            if (scanner.hasNextInt()) {
                int tmp = scanner.nextInt() - 1;
                if ((tmp > Cell.SIZE) || (tmp < 0)) {
                    System.out.println("Введи ЦЕЛОЕ ПОЛОЖИТЕЛЬНОЕ число от 1 до 10");
                } else {
                    shootY = tmp;
                    break;
                }
            } else {
                System.out.println("Введите целое положительное число от 1 до 10");
                scanner.nextLine();
            }
        }
        return shootY;
    }
}