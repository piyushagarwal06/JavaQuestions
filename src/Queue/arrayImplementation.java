package Queue;

public class arrayImplementation {
    static class queueArray{
        int f=-1;
        int r=-1;
        int size=0;
        int [] arr=new int [100];


        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f==-1) {
                f = r = 0;
                arr[r]=val;
            }
            else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }

        int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        int peek(){
            return arr[f];
        }

        void display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueArray q=new queueArray();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();


    }
}
