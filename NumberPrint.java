import java.util.*;
class NumberPrint{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the term");
        int n=sc.nextInt();
        if(n%2==0){
            int v = n/2;
            System.out.println(even(v));
        }
        else{
            int v= (n/2)+1;
           System.out.println(odd(v));
        }
        
        sc.close();
    }
    public static int even(int v){
        int t=0,k=0;
        for (int i =0;i<v;i++){
            t=t+k;
            k=6;
        }
        return t;

    }
    public static int odd(int v){
        int t=0,k=0;
        for (int i =0;i<v;i++){
            t=t+k;
            k=7;
        }
        return t;

    }
    

}