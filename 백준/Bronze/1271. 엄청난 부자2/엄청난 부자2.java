import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger money = sc.nextBigInteger();
        BigInteger people = sc.nextBigInteger();
        System.out.println(money.divide(people));
        System.out.println(money.remainder(people));

    }
}