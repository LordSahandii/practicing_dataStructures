public class List_usingArray<T> implements ListInterface<T> {
    int size;
    T[] arr;
    int index;
    public List_usingArray(){
        index = -1;
        size = 0;
        Object arr2 = new Object[10];
        arr = (T[])arr2;
    }

    public void add (T a) throws PushingError{
        if(isEmpty()){
            index = 0;
        }
        if(size == 5){
            throw new PushingError("SIZE LIMIT REACHED 5");
        }
        index++;
        arr[index] = a;
        size++;
    }

    public void add (int position, T a) throws PushingError{
        if(isEmpty()){
            index = 0;
        }
        if(size == 5){
            throw new PushingError("SIZE LIMIT REACHED 5");
        }
        if(position < index) {
            // shifting
            for (int i = index; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
        }

        arr[position] = a;
        index++;
        size++;
    }

    public void remove(int position) throws EmptyError{
        if(isEmpty()){
            throw new EmptyError("EMPTY LIST");
        }
        if(position < index) {
            // shifting
            for (int i = position ; i < index; i++) {
                arr[i] = arr[i + 1];
            }
        }
        index--;
        size--;
    }
    public T peek(){
        return arr[index];
    }

    public boolean contains(T data){
        for(int i  = 1; i <= index; i++){
            if(arr[i] == data){
                return true;
            }

        }
        return false;

    }

    public boolean isEmpty(){
        if(index == -1 || size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public int getFrequencyOf(T data){
        int f = 0;
        for(int i  = 1; i <= index; i++){
            if(arr[i] == data){
                f++;
            }

        }
        return f;

    }

    public void clear(){
        size = 0;
        index = -1;
    }
}
