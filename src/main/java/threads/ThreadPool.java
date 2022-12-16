package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool {
    /*
     * Creating threads not good for every job
     * pool of threads to do
     *    Runnable has run method  and does not return anything
     *   Callable has call method ,, return type is object and We can hold that using future
     *
     *   ExecutorService is good as we dont have to create and wait on the threads
     *    Problem with executoService is that it still blocks -->> i,e it has to wait
     *   When we use get from callable we can use get(1.TimeUnit) --> but if this time lapses we will not  get the result
     *   Secondly we don not have a proper way to combine the furture
     *
     *    Fork/JOin -- is an extension of executorService  is designed to achieve  data parallelism --works recursively
     *   ExecutorService --  is designed to achieve  task based  parallelism
     *
     * */

    public static void main(String[] args) {
//        final List<Task> tasks = Arrays.asList(new Task("Task1"),
//                new Task("Task2"),
//                new Task("Task3"),
//                new Task("Task4"),
//                new Task("Task5")
//        );
//
//
//        ExecutorService service = Executors.newFixedThreadPool(3);
//        tasks.stream()
//                .forEachOrdered(task -> service.submit(task));

        final List<NewTask> newTaskList = Arrays.asList(new NewTask(2),
                new NewTask(3),
                new NewTask(4)
        );
        ExecutorService service = Executors.newFixedThreadPool(3);
        newTaskList.stream().forEach(newTask ->
                {
                    final Future future = service.submit(newTask);
                    try {
                        System.out.println(future.get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }

                }

        );
        service.shutdown();
    }
}


class Task implements Runnable {

    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {

        System.out.println(this.name + "..... Job Started by " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Job Completed " + Thread.currentThread().getName());
    }
}

class NewTask implements Callable {

    String name;
    int num;
    public NewTask(Integer num) {
        this.num = num;
    }

    public Object call() throws Exception{
        System.out.println(this.name + "..... Job Started by " + Thread.currentThread().getName());
      int sum=0;
        for(int i=0;i<num;i++)
        {
            sum=sum+i;
        }

        return sum;
    }
}