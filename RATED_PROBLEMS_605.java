import java.util.Scanner;

public class RATED_PROBLEMS_605 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      
      int[] arr = new int[n];
      int sum = 0;
      for(int i=0; i<n; i++)
      {
        arr[i] = sc.nextInt();
        if(arr[i]>=x)
        {
          sum++;
        }
      }
      System.out.println(sum);
      ///end
    }
}
