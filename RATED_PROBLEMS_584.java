import java.util.Scanner;

public class RATED_PROBLEMS_584 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mx = Math.max(a,c);
        if(b>=mx)
        {
            System.out.println("Possible");
        }else
        {
            System.out.println("Impossible");
        }
        //end
    }
}
