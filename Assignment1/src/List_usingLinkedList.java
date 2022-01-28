public class List_usingLinkedList<T> implements ListInterface<T> {
    NodeGeneric<T> first;
    NodeGeneric<T> last;
    int size;

    public List_usingLinkedList(){
        first = null;
        last = null;
        size = 0;
    }
    public void add (T a) throws PushingError{
        NodeGeneric<T> temp = new NodeGeneric<T>();
        temp.data = a;
        temp.next = null;
        if(size == 5){
            throw new PushingError("SIZE LIMIT HAS REACHED 5");
        }
        if(isEmpty()){
            this.first = this.last = temp;
        }else {
            last.next = temp;
            last = temp;
        }
        size++;
    }

    public void add (int position, T a) throws PushingError{
        NodeGeneric<T> temp = new NodeGeneric<T>();
        temp.data = a;
        temp.next = null;

        NodeGeneric<T> y = first;
        NodeGeneric<T> x = first.next;

        while(position  - 2 > 0){
            y = x;
            x = y.next;

            position--;
        }
        temp.next = x;
        y.next = temp;

        size++;
    }

    public void remove(int position) throws EmptyError{}
    public T peek(){}

    public boolean contains(T data){}

    public boolean isEmpty(){}

    public int size(){}

    public int getFrequencyOf(T data){}

    public void clear(){}
}
