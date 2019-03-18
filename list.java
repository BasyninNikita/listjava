public class  list <T> {
    public class node{
        T value;
        node next;
    }
    private node head;
    private node tail;

    void add(T val){
        node a = new node();
        a.value=val;
        if(head==null){
            head=a;
            tail=a;
        }
        else {
            tail.next=a;
            tail=a;
        }
    }
    T get(int index){
        T a=null;
        for(int i=0;i<index;++i){
            a=head.next.value;
        }

        return a;
    }

    public static void main(String[] args) {

    }


}
