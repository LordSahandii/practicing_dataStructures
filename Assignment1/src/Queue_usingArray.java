public class Queue_usingArray<T> implements QueueInterface<T> {
    int front;
    int rear;
    int size;
    T arr[];
    public Queue_usingArray(){
        Object arr2 = new Object[10];
        arr = (T[]) arr2;
        size = 0;
        front = -1;
        rear = -1;
    }

    public void insert (T a) throws PushingError{
        if(isEmpty()){
            front = 0;
            rear = 0;

        }
        if(size == 5){
            throw new PushingError("ARRAY HAS REACHED THE SIZE 5");
        }
        arr[rear] = a;
        rear++;
        size++;
    }

    public T remove() throws EmptyError{
        if(isEmpty()){
            throw new EmptyError("ARRAY IS EMPTY!!!");
        }else{
            T temp = arr[front];
            front++;
            size--;
            return temp;
        }
    }
    public T peek(){
        return arr[rear];
    }

    public boolean contains(T data){
        for(int i = 0; i < size; i++){
            if(arr[i] == data){
                return true;

            }        }
        return false;
    }

    public boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public int getFrequencyOf(T data){
        int f = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] == data){
                f++;

            }        }
        return f;

    }
    public void clear(){
        front = -1;
        rear = -1;
        size = 0;
    }
}
