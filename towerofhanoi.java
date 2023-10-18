import java.util.*;
public class towerofhanoi {
    public static void tower(int n,char A,char B,char C) {
        if (n==1) {
            System.out.println("move 1st disk from "+A+" to "+C);
            return;
        }
        tower(n-1,A,C,B);
        System.out.println("move "+n+"th disk from "+A+" to "+C);
        tower(n-1, B, A, C);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n");
    int n=sc.nextInt();
    tower(n, 'a', 'b', 'c');
}    
}
