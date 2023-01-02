package datastructures.stacks;

public class StackUsingArrayExtension<T> extends StackUsingArray{

    public StackUsingArrayExtension() {
        super();
    }

    private Object peek()
    {
        Object o = super.array[--super.count];
        return o;
    }

    public static void main(String[] args) {

        StackUsingArrayExtension<Integer> stackUsingArrayExtension = new StackUsingArrayExtension<>();
        stackUsingArrayExtension.push(10);
        stackUsingArrayExtension.push(20);

        System.out.println(stackUsingArrayExtension.peek());
    }
}
