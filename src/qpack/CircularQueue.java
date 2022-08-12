package qpack;

// A circular queue.
public class CircularQueue implements ICharQ {
    private char[] q;  // this array holds the queue.
    private int putloc, getloc;  // the put and get indices.

    // Construct an empty queue given it's size.
    public CircularQueue(int size) {
        q = new char[size+1];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue.
    public void put(char ch) {
        // Queue is full if either putloc is one less then getloc, or if putloc is at the end of the array a getloc is at the beginning.
        if(putloc+1==getloc | ((putloc==q.length-1) & (getloc==0))) {
            System.out.println(" - Queue is full.");
            return;
        }

        q[putloc++] = ch;
        if(putloc==q.length) putloc = 0;  // loop back
    }

    // Get a character from the queue.
    public char get() {
        if (putloc == getloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }

        char ch =  q[getloc++];
        if(getloc==q.length) getloc = 0;  // loop back
        return ch;
    }
}
