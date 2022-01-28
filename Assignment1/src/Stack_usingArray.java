public class Stack_usingArray<T> implements StackInterface<T> {
    int top;
    T[] arr;
    int size;

    public Stack_usingArray(){
        Object arr1 = new Object[5];
        arr = (T[])arr1;
        top = -1;
        size = 0;
    }

    public void push (T a) throws PushingError{
        if(size == 5){
            throw new PushingError("SIZE LIMIT REACHED 5");
        }
        top++;
        arr[top] = a;
        size++;

    }

    public T pop() throws EmptyError{
        if(isEmpty()){
            throw new EmptyError("The array is empty!!!");
        }
        else{
            T temp = arr[top];
            top--;
            return temp;
        }

    }
    public T peek(){
        return arr[top];

    }

    public boolean contains(T data){
        if(size == 0){
            System.out.println("List is Empty");
            return false;
        }else {
            for (int i = 0; i < size; i++) {
                if(data == arr[i]){
                    return true;
                }

            }
        }
        return false;

    }

    public boolean isEmpty(){
        return (top < 0);

    }

    public int size(){
        return size;

    }

    public int getFrequencyOf(T data){
        int f = 0;
        for(int i=0; i < size; i++){
            if(data == arr[i]){
                f++;
            }
        }
        return f;

    }

    public void clear(){
        top = -1;
        size = 0;
    }

}
