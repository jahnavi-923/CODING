package patterns;
import java.util.*;
public class box {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // for square box
        // int n = sc.nextInt();
        // for(int i=0; i<n; i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for rectangle box
        // int l = sc.nextInt();
        // int b = sc.nextInt();
        // for(int i=0; i<l; i++){
        //     for(int j=0;j<b;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    
        // without a space at end
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0; i<l; i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
                if(j!=b-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
