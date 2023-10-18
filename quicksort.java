import java.util.*;
public class quicksort {
    public static void quicksort1(int a[],int s,int e){
        if (s>=e) {
            return;
        }
        int pivot=partition(a,s,e);
        quicksort1(a, s, pivot-1);
        quicksort1(a, pivot+1, e);
    }
    public static int partition(int a[],int s,int e){
        int count=0,pivot,i=s+1;
        while (i<=e) {
            if (a[s]>=a[i]) {
                count++;
            }i++;
        }
        pivot=s+count;
        int temp;
        temp=a[pivot];
        a[pivot]=a[s];
        a[s]=temp;
        while(s<pivot&&e>pivot){
            if (a[pivot]<a[s]&&a[pivot]>=a[e]) {
                temp=a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;e--;
            }
            if(a[pivot]>=a[s]){
                s++;
            }
            if(a[pivot]<a[e]){
                e--;
            }
        }
        return pivot;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array element");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int s=0,e=n-1;
        quicksort1(a,s,e);
        System.out.println("sorted array is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
