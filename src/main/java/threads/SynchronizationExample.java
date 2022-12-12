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

}

