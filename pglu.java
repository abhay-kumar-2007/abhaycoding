//package METHOD;
import java.util.Scanner;
public class pglu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        int y;
        System.out.println("ENTER A NUMBER X = ");
        x = inp.nextInt();
        System.out.println("ENTER A NUMBER Y = ");
        y = inp.nextInt();
      int result = sum(x,y);
       System.out.println("THE SUM NUMBER IS "+result);

} 
public static int sum (int z , int w) {
    return z+w;
}
}
