import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        int x;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter your NUMBER8");
        x=inp.nextInt();
        if(x>=2){
            System.out.println("x is greater than 2");
        }
        else{
        System.out.println("x is lesser than 2");
        }
    }
    
}
