import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        start();
    }

    private static void executeChoice(int choice) {
        if (choice == 1) {
            System.out.println("Masukkan kata yang ingin di check: ");
            String word = scanner.next();
            palindrome(word);
            nextStart();
        } else if (choice == 2) {
            System.out.println("Terimakasih telah menggunakan aplikasi ini");
            System.exit(0);
        } else {
            start();
        }
    }

    private static void nextStart() {
        System.out.println("apakah anda ingin mengulangi pengecekan? \n" +
                "pilih (Y/N)");
        String nextChoice = scanner.next();
        if (nextChoice.equals("y")) {
            nextChoice = "Y";
        } else if (nextChoice.equals("n")) {
            nextChoice = "N";
        }

        switch (nextChoice) {
            case "Y":
                executeChoice(1);
                break;
            case "N":
                executeChoice(2);
                break;
            default:
                start();
        }
    }

    static void start() {
        System.out.println("Aplikasi ini adalah aplikasi sederhana untuk memeriksa suatu kata\n " +
                "apakah berupa palindrome atau bukan.\n" +
                "\t Masukan pilihan anda untuk melanjutkan:\n" +
                "\t 1 Untuk memulai program. \n" +
                "\t 2 untuk mengakhiri program.\n");
        nextChoice();
    }

    static void nextChoice() {
        int choice = scanner.nextInt();
        executeChoice(choice);
    }

    static boolean palindrome(String text) {
        StringBuilder result = new StringBuilder();
        char[] text1 = text.toCharArray();
        for (int i = text1.length - 1; i >= 0; i--) {
            result.append(text1[i]);
        }
        if (text.equals(result.toString())) {
            System.out.println(text + " : " + result);
            System.out.println(true);
            return true;

        } else {
            System.out.println(text + " : " + result);
            System.out.println(false);
            return false;
        }
    }
}