abstract class vehicles {
    public abstract int getnoofwheel();
}
class BUS extends vehicles
{
public int getnoofwheel()
{
return 6;
}
} 
class AUTO extends vehicles
{
public int getnoofwheel()
{
return 3;
}
} 
class test
{
    public static void main(String[] args) {
        BUS b = new BUS();
        System.out.println(b.getnoofwheel());
        AUTO a = new AUTO();
        System.out.println(a.getnoofwheel());
    }
} 



    
    

