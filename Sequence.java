import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int result = findNthMember(k, n);
        System.out.println(result);
    }

    public static int findNthMember(int k, int n) {
        if (n == 1) {
            return k;
        } else if (n == 2) {
            return k + 1;
        } else if (n == 3) {
            return 2 * k + 1;
        } else if (n % 3 == 0) {
            return findNthMember(k, (n / 3)) * 2 + 1;
        } else if (n % 3 == 1) {
            return findNthMember(k, n / 3) + 2;
        } else {
            return findNthMember(k, (n/3)) + 1;
        }
    }
}
