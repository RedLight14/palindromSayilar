import java.util.Scanner;

public class palindromSayilar {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, digit;
        while (temp != 0) {
            digit = temp % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            temp /= 10;
        }
        System.out.println("Sayınızın tersi: " + reverseNumber);
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Palindrom Sayı sorgulayıcıya hoşgeldiniz!");

        do {
            System.out.print("Sorgulamak istediğiniz sayı: ");
            int n = inp.nextInt();
            if (isPalindrom(n)) {
                System.out.println(n + " bir Palindrom Sayıdır!");
                break;
            } else {
                System.out.println(n + " palindrom sayı değildir.");
            }
        } while (true);
    }
}
