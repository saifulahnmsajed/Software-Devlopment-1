import java.util.Scanner;
import java.util.Arrays;  
public class RATED_PROBLEMS_580 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);

        int mx = arr[3];
        int sum = arr[0] + arr[1] + arr[2];

        if(mx>sum)
        {
            System.out.println("Monopoly: Yes");
        }else
        {
            System.out.println("Monopoly: No");
        }

        //end
    }
}
