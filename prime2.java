import java.util.*; //count prime number within range
public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("enter number");
            n=sc.nextInt();
            prim(n);
        }
        public static void prim(int n){
            int a=2,h=0;
            while(n>1){
            if (a<=n) {
                if(n%a==0){
                    h=1;
                }
                else
                a++;
            }
            if(h==0||n==a){
                System.out.println(n);
                a=2;
                n--;
            }
            else
            a=2;n--;h=0;

        }

    }
}
