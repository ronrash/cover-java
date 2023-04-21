package datastructures.arrays;

public class CustomArrayList<T> {

    // add
    // remove
    // resize bcox we are constructing a dynamic array
    // that is why the arraylist is slow shifting the elements


    private Object[] array;
    private static Integer DEFAULT_SIZE = 10;
    private int size;

    public CustomArrayList() {
        this.array = new Object[DEFAULT_SIZE];
    }

    void add(T data) {
        // check if my array is full
        // if yes resize or else add the value
        if (isArrayFull()) {
            resize();
        }
        array[size++] = data;
    }

    private void resize() {
        // create a temporary array with double the size ,,copy the items in that
        Object[] temp = new Object[DEFAULT_SIZE * 2];

        // Start copying th elements from original array into temp
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public Object get(int index) {
        if (index < 0 || index > array.length) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void remove(int index)
    {
        if(index < 0 || index > array.length)
            throw new IndexOutOfBoundsException();

        // copy all the elements to a new array and that is why weh have the size of the new array as original array size -1
        Object[] tempArray = new Object[array.length-1];
        int k=0;
        for(int i=0;i< array.length;i++)
        {
            if(!(array[i]==array[index]))
                tempArray[k++]=array[i];

        }
        array=tempArray;
    }

    private boolean isArrayFull() {
        return array.length == size;
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

      //  System.out.println(customArrayList.get(30));


        for(int i=1;i<=5;i++)
        {
            customArrayList.add(i*10);
        }

        System.out.println(customArrayList.get(4));

         customArrayList.remove(4);
        System.out.println(customArrayList);
    }
}
