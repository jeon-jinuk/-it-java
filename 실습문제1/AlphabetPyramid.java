import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오: ");
        char input = scanner.next().charAt(0);

        for (char c = 'a'; c <= input; c++) {
            for (char j = 'a'; j <= input - (c - 'a'); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
