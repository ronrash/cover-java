package threads;

public class SynchronizationExample {

    // synchronized is for methods and blocks but not for classes and variables
    // when multiple threads try to access same object then we shoud use synchronize
    // causes data inconsitency
    // internally it uses lock concept --
    // needs the lock of the object

    // 2 diff objects have 2 different locks
    // if a method is static synchronized then threads need class level lock
    // every class in java has a lock similar to

    // for static sync methods class level lock is required
    // for normal sync methods object level lock is required

   // synchronized(A.class) {A.class} --> class level lock   or object level synchronized(this)

    /*
    * Synchronized is keyword for methods and block nt for lcasses and variables
    * Resolves data inconsistency
    * dis-adavanateg of sync --> deadlocks ,perfromance
    *
    * What is race Condition ??
    * If multiple threads operate on same  object simultaneously then data inconsistency , this can be resolved using sync keyword
    *
    * Every class has an object level lock and is required by a thread to execute sync method/block
    * Every class has an class level lock and is required by a thread to execute static sync method/block
     *
    * */

    public static void main(String[] args) {

        Player player1 = new Player();
        Thread1 thread1 = new Thread1("jack",player1);
        Thread1 thread2 = new Thread1("john",player1);

        thread1.start();
        thread2.start();

    }
}
class Thread1 extends Thread{
    Player player;
    String name;


    public Thread1(final String name,Player player) {
        this.name = name;
        this.player=player;
    }

    public void run()
    {
        player.display(name);
    }
}

class Player {

    public synchronized void display(String name )
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(name+" "+Thread.currentThread().getName());
        }

    }
}
