import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ədəd daxil edin: ");
        Scanner sc = new Scanner(System.in);
        PyramidOfNumber(sc.nextInt());
    }

    public static void PyramidOfNumber(int n)
    {
        int x;
        int s=n-1;
        for(int i=1;i<=n;i++)
        {
            for(x=s;x>0;x--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            s--;
        }
    }


}
