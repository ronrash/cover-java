package threads.sampleforVolatileAtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketCounter {

    // we have multiple counters and counter need to keep track of the tickeys sold
    // tickercounter
    private static AtomicInteger ticketsSold = new AtomicInteger(0);
  //  private static Integer ticketCounter = 0;

    public static void main(String[] args) {

        // create two threads or ticket counters
        Thread counter1 = new Thread(new TicketSeller());
        Thread counter2 = new Thread(new TicketSeller());

        Thread counter3 = new Thread(new TicketSeller());
        Thread counter4 = new Thread(new TicketSeller());

        // start two threads
        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();

        try{
            counter1.join();
            counter2.join();
            counter3.join();
            counter4.join();
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("ticket sold "+ ticketsSold.get());
      //  System.out.println("ticket sold "+ticketCounter);
    }

static class  TicketSeller implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            // increment the ticket count automtically
          ticketsSold.incrementAndGet();
        //    ticketCounter++;
        }
    }
}

}

//    In the provided code, counter1.join() and counter2.join() are used to ensure that the main thread waits
//    for counter1 and counter2 threads to complete their execution before proceeding further.
//
//        The join() method is a synchronization mechanism provided by the Thread class in Java.
//        When you call join() on a thread, the calling thread (in this case, the main thread) will wait until the specified thread (in this case, counter1 and counter2) completes its execution.
//
//        By invoking counter1.join(), the main thread will pause its execution and wait for counter1 to
//        finish before moving on to the next statement. Similarly, counter2.join() ensures that the main thread waits for counter2 to complete.
//
//        Using join() is useful when you want to ensure that all threads have finished their
//        tasks before proceeding with further operations. In this case, we want to wait for both counter1 and counter2 to finish selling tickets before printing the final ticket count.
//
//        Once both threads have completed their execution (i.e., finished selling tickets), the main thread can continue its execution,
//        and the program displays the total number of tickets sold.
