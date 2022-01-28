import org.w3c.dom.Node;

public class Queue_usingLinkedList<T> implements QueueInterface<T> {
    NodeGeneric<T> front;
    NodeGeneric<T> rear;
    int size;
    public Queue_usingLinkedList(){
        front = null;
        rear = null;
        size = 0;
    }
    public void insert (T a) throws PushingError{
        NodeGeneric<T> temp = new NodeGeneric<T>();
        temp.data = a;
        temp.next = null;
        if(isEmpty()){
            this.rear = this.front = temp;
        }
        if(size == 5){
            throw new PushingError("SIZE LIMIT REACHED 5");

        }        this.rear.next = temp;
        this.rear = temp;
        size++;
    }

    public T remove() throws EmptyError{
        if(isEmpty()) {
            throw new EmptyError("THE QUEUE IS EMPTY");
        }

        NodeGeneric<T> temp = new NodeGeneric<T>();
        temp = this.front;
        this.front = front.next;
        size--;
        return temp.data;
        }

    public T peek(){
        return rear.data;
    }

    public boolean contains(T data){
        NodeGeneric<T> iterator = front;
        while (iterator!=null){
            if(iterator.data == data){
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == null && rear == null){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public int getFrequencyOf(T data){
        int f = 0;
        NodeGeneric<T> iterator = front;
        while (iterator!=null){
            if(iterator.data == data){
                f++;
            }
            iterator = iterator.next;
        }
        return f;
    }

    public void clear(){
        front = null;
        rear = null;
        size = 0;
    }
}
