public class Stack {

    private int size;
    private static  int MAX = 2;
    int[] placeHolder = new int[MAX];

    public Stack(int i) {
        if (i <= 0)
        throw new RuntimeException();
        MAX = i;
    }

    public int getSize() {

        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int item) {
        size++;
        if (size > MAX)
            throw new StackOverflowError();
        placeHolder[size-1] = item;
    }

    public int pop() {

        if (isEmpty())
            throw new RuntimeException();
        size--;
        return placeHolder[size];
    }
}
