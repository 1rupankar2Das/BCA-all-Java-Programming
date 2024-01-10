class thread1 extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread 1 = " + i);
        }
    }
}
class thread2 extends Thread 
{
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread 2 = " + j);
        }
    }
}
public class Prog1
{
    public static void main(String[] args) 
    {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        th1.start();
        th2.start();
    }
}