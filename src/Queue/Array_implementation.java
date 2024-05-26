package Queue;

public class Array_implementation {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
             arr = new int[n];
             size = n;
             rear = -1;
        }

        //is empty
        public static Boolean isEmpty(){
                return rear ==-1;
        }
        // add  O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            else{
                rear +=1;
                arr[rear] =data;
            }
        }
        // remove O(n)
        public static int remove(){
            int front = arr[0];
            if(rear==-1){
                System.out.println("Empty Queue");
            } else{
                for(int i=0; i<rear; i++){
                    arr[i] = arr[i+1];
                }
                rear--;
            }
            return front;
        }
        //peek O(1)
        public static int peek(){
            if(rear ==-1){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q =new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
