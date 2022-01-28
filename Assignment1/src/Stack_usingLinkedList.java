public class Stack_usingLinkedList<T> implements StackInterface<T> {
    NodeGeneric<T> top;

    public Stack_usingLinkedList() {
        top = null;
    }

    int size = 0;

    public void push(T a) throws PushingError {
        if (size == 5)
            throw new PushingError("Maximum Size has bean reached to 5");
        NodeGeneric<T> temp = new NodeGeneric<T>();
        temp.data = a;
        temp.next = null;

        // check whether the stack is empty or not
        if (top == null) {
            top = temp;
        } else {
            // the stack is not empty
            temp.next = top;
            top = temp;
        }
        size++;
    }


    public T pop() throws EmptyError {
        if (size == 0)
            throw new EmptyError("AccessingAnEmptyStackCheckedException");
        T temp = (T) top.data;
        top = top.next;

        size--;
        return temp;
    }

    public T peek() {
        return (T) top.data;
    }
    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }

    }
    public int size(){
        return size;

    }
    public boolean contains(T data){
        NodeGeneric iterator = top;
        while(iterator!=null){
            if(iterator.data == data){
                return true;
            }
            iterator = iterator.next;
        }
        return false;

    }

    public int getFrequencyOf(T data){
        int f = 0;
        NodeGeneric iterator = top;
        while(iterator!=null){
            if(iterator.data == data){
                f++;
            }
            iterator = iterator.next;
        }
        return f;

    }

    public void clear(){
        top = null;
        size = 0;

    }

}

