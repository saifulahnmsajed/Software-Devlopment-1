import java.util.Scanner;

public class RATED_PROBLEMS_575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        char c = sc.next().charAt(0);

        
        char x = sc.next().charAt(0);

        
        if (x == a || x == b || x == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
