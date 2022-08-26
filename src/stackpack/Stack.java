package stackpack;

// Self Test 9, exercise 10.
// A stack class for characters.
public class Stack {
    private char[] q;  // this array holds the queue
    private int tos;  // the put and the get indices

    // Construct an empty Queue given it's size.
    Stack(int size) {
        q = new char[size]; // allocate memory for queue
        tos = 0;
    }

    // Construct a stack from stack
    Stack(Stack ob) {
        tos = ob.tos;
        q = new char[ob.q.length];

        // copy elements
        for(int i=0; i < tos; i++)
            q[i] = ob.q[i];
    }

    // Construct a stack with initial values.
    Stack(char[] a) {
        q = new char[a.length];

        for(int i=0; i < a.length; i++) {
            try {
                push(a[i]);
            }
            catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    // Put a character into the queue.
    void push(char ch) throws StackFullException {
        if(tos == q.length)
            throw new StackFullException(q.length);

        q[tos++] = ch;
    }

    // Get a character from the queue.
    char pop() throws StackEmptyException {
        if(tos == 0)
            throw new StackEmptyException();
        tos--;
        return q[tos];
    }
}