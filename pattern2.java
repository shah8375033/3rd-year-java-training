import java .util.*;
public class pattern2 {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
