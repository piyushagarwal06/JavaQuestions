package Queue;
import java.util.Stack;
public class stackImplementationOfQueue {

        private Stack<Integer> input;
        private Stack<Integer> output;


        public stackImplementationOfQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }


        public void push(int x) {
            input.push(x);
        }


        public int pop() {
            if (empty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            peek();
            return output.pop();
        }


        public int peek() {
            if (empty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }


        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }


        public void display() {
            peek();

            System.out.print("Queue: ");
            for (int i = output.size() - 1; i >= 0; i--) {
                System.out.print(output.get(i) + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            stackImplementationOfQueue q = new stackImplementationOfQueue();

            q.push(10);
            q.push(20);
            q.push(30);

            q.display();

            System.out.println("Front element: " + q.peek());


            System.out.println("Removed: " + q.pop());

            q.display();


            q.push(40);
            q.display();

            System.out.println("Removed: " + q.pop());
            System.out.println("Front element: " + q.peek());

            q.display();

            System.out.println("Is empty? " + q.empty());
        }
    }

