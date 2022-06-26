/*
Try this 5-2

A queue class for characters.
Updated to be circular.


class Queue {
    char[] q; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if(putloc == q.length) {
            putloc = 0;
        }
        q[putloc++] = ch;
    }

    //  get a character from the queue
    char get() {
        if(getloc == q.length) {
            System.out.println(" - End of queue");
            getloc++;
            return (char) 0;
        }
        if(getloc < q.length) return q[getloc++];
        return (char) 0;
    }
}

// Demonstrate the queue class.
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(50);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers/letters into bigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        // retrieve and display the elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));

            smallQ.put((char) ('Z' -i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }
    }
}


// Version to store ints
class Queue {
    int[] q; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new int[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(int num) {
        if(putloc == q.length) {
            putloc = 0;
        }
        q[putloc++] = num;
    }

    //  get a character from the queue
    int get() {
        if(getloc == q.length) {
            System.out.println(" - End of queue");
            getloc++;
            return 0;
        }
        if(getloc < q.length) return q[getloc++];
        return 0;
    }
}

// Demonstrate the queue class.
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(23);
        Queue smallQ = new Queue(4);
        int i, nr;

        System.out.println("Using bigQ to store the numbers.");
        // put some numbers/letters into bigQ
        for(i=0; i < 26; i++)
            bigQ.put((0 + i));

        // retrieve and display the elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            nr = bigQ.get();
            if(nr >= 0) System.out.print(nr + " ");
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (5 - i));

            smallQ.put((5 -i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            nr = smallQ.get();

            if (nr != 0) System.out.print(nr);
        }
    }
}




// An improved queue class for characters.
class Queue {
    // these members are now private
    private char[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size];  // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a character into the queue
    void put(char ch) {
        if(putloc == q.length) {
            putloc = 0;
        }
        q[putloc++] = ch;
    }

    //  get a character from the queue
    char get() {
        if(getloc == q.length) {
            System.out.println(" - End of queue");
            getloc++;
            return (char) 0;
        }
        if(getloc < q.length) return q[getloc++];
        return (char) 0;
    }
}

// Demonstrate the queue class.
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(50);
        Queue smallQ = new Queue(4);
        char ch;
        int i;


        System.out.println("Using bigQ to store the alphabet.");
        // put some numbers/letters into bigQ
        for(i=0; i < 26; i++)
            bigQ.put((char) ('A' + i));


        // retrieve and display the elements from bigQ
        System.out.print("Contents of bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Using smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for(i=0; i < 5; i++) {
            System.out.print("Attempting to store " + (char) ('Z' - i));

            smallQ.put((char) ('Z' -i));
            System.out.println();
        }
        System.out.println();

        // more errors on smallQ
        System.out.println("Contents of smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }
    }
}

 */