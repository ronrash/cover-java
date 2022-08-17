package collections;

public class ConcurrentHashMap {

    /*
    https://youtu.be/UwurUtvil7w

    HashMap is not thread safe
    can have one null key

    HashTable is thread safe -- entire hashTable is synchronized
    slow preformance -- no null keys and values

    SynchrnoizedHasMap threadSafe slow performance

    ConcurrentHashMap
    all segments are thread safe fast performance 16

    Important Questions
    Can twi threads read from the same segment ?
    No thread acquires lock on the segment in put() operation and at a time only one thread can read from the segment
    but the thread can do a write operation on some other segment

    Can 2 threads write in a single segment ?
    No same as above but can write in different segments

    Can multiple threads read from same segment ??
    Yes Thread doesnt acquire read lock on get() operation -- so multiple threads can read from same segment

    If one thread is writing into the segment can anothe Thread read from that segment
    yes -- last updated value will be seen by  the reading thread

    * */


}
