public interface StackInterface<T> {
    public void push (T a) throws PushingError;

    public T pop() throws EmptyError;
    public T peek();

    public boolean contains(T data);

    public boolean isEmpty();

    public int size();

    public int getFrequencyOf(T data);

    public void clear();
}


