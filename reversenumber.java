import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args) {
        int n;
        int r=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter your NUMBER");
        n=inp.nextInt();
         while(n!=0){
            r = r +(n%10);
            r = r*10;
            n =n/10;
         }
         System.out.println("the riverse number : "+r);
        
    }
    }
    

