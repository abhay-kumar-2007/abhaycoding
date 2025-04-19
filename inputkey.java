import java.util.Scanner;
public class inputkey {
    public static void main(String[] args) {
        String name;
        int age;
        double salary;
        char sex;
       Scanner inp = new Scanner(System.in);
        System.out.println("enter your name");
        name=inp.nextLine();
        System.out.println("enter your age");
        age=inp.nextInt();
        System.out.println("enter your salary");
        salary=inp.nextDouble();
        System.out.println("enter m for male and f for female");
        sex = inp.next().charAt(0);
        System.out.println("the employee details are");
        System.out.println("kuch vi");
        System.out.println("The employee Name :  "+name);
        System.out.println("The employee age :  "+age);
        System.out.println("The employee salary :  "+salary);
        System.out.println("The employee sex : "+sex
        );
        
    }
    
}
