import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Пожалуйста введите фразу для вывода на экран: ");
        String line = scn.nextLine();
        for (int i = 0; i <5 ; i ++){
            System.out.println(line);
        }
    }
}
