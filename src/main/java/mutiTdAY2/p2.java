package mutiTdAY2;

public class p2 {
    public static void main(String[] args)
    {
        Thread t1=new Thread(new p1("chrome"));
        Thread t2=new Thread(new p1("firefox"));

                t1.start();
                t2.start();
    }
}
