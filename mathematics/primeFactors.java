package mathematics;
import java.util.*;
public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if(n<=1)System.out.println(n);
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                System.out.print(i+",");
                n=n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}

