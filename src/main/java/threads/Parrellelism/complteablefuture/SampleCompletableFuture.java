package threads.Parrellelism.complteablefuture;

import java.util.Calendar;
import java.util.concurrent.CompletableFuture;

public class SampleCompletableFuture {

    // Ayschronous -- non blocking call
    // call returns immediatley but response is sent when it is available
    // exception doest break ur app
    // it normally runs in  pool of threads

    //CompletableFuture -- has 3 methods Factory Completion Exceptions
    // supplyAysnc() -- initiates the aysnc process ,takes a supplier as input ,returns  CompletableFuture <T>
    // and theAccept() -- input is the supplier function takes consumer as input returns CompletableFuture <void>

    /*
     *
     *   thenApply()-- completion stage method which takes in the completed aysnc result and acts upon that
     *   transforms one data from one form to  another
     *    input is a FunctionalInterface - takes an input and retuns an output
     * */

    public static void main(String[] args) {

        HelloWorldService helloWorldService = new HelloWorldService();
        CompletableFuture
                .supplyAsync(()->helloWorldService.helloWorld()) // this is part is called a pipeline  and runs in a fork/join pool
                .thenApply(String::toUpperCase)
               // .thenApply((result)->result.toUpperCase()) // functional Interface -- it will take the input and so someting with it
                .thenAccept((result)-> System.out.println(result));


        try{
            Thread.sleep(2000);
            Calendar calendar = Calendar.getInstance();
        }catch (InterruptedException exception){

        }

        System.out.println(Thread.currentThread().getName()+" done");
    }
}


class HelloWorldService {

    public  String helloWorld()  {
        try{
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException exception){

        }
        return "hello world ";
    }
}