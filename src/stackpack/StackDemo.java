package stackpack;

// Demonstrate the Stack class.
class StackDemo {
    public static void main(String[] args) {
        // construct 10-element empty queue
        Stack q1 = new Stack(10);

        char[] name = {'A', 'B', 'C'};
        Stack q3 = new Stack(name);

        char ch;
        int i;

        // show put characters onto q1
        System.out.println("Input queue: ");
        try {
            for (i = 0; i < 15; i++) {
                ch = (char) ('A' + i);
                q1.push(ch);
                System.out.print(ch);
            System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        System.out.println();


        Stack q2 = new Stack(q1);

        // Show the queue.
        System.out.println("Contents for q3: ");
        try {
            for (i = 0; i < 15; i++) {
                ch = q3.pop();
                System.out.println(ch);
            }
            System.out.println("\n");
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}