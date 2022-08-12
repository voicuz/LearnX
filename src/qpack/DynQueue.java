package qpack;


// A dynamic queue.
public class DynQueue implements ICharQ {
    private char[] q;  // this array holds the queue.
    private int putloc, getloc;  // the put and get indices.

    // Construct an empty queue given it's size.
    public DynQueue(int size) {
        q = new char[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        if(putloc==q.length) {
            // increase queue size
            char[] t = new char[q.length * 2];

            // copy elements into new queue
            for(int i=0; i<q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    public char get() {
        if (putloc==getloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}