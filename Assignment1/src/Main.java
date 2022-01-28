
public class Main {
    public static void main(String[] args){
        try{
            Stack_usingArray<Integer> s1 = new Stack_usingArray<Integer>();
            s1.push(2);
            s1.push(3);
            s1.push(4);
            s1.push(2);
            s1.push(5);
            System.out.println(s1.contains(2));
            System.out.println(s1.getFrequencyOf(2));
            s1.clear();
            s1.push(2);
            System.out.println(s1.getFrequencyOf(2));
            s1.clear();
            System.out.println(s1.isEmpty());
            s1.pop();

        }catch (PushingError e){
            System.out.println(e.getMessage());
        }catch (EmptyError e){
            System.out.println(e.getMessage());
        }


    }
}
