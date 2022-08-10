// A further enhanced version of Series that include two default methods that use a private method called getArray();
public interface Series {
    int getNext();  // return next number in series

    // Return an array that returns the next n elements in the series beyond the current element.
    default int[] getNextArray(int n) {
        return getArray(n);
    }

    // Return an array that returns the next n elements in the series beyond the current elements.
    default int[] skipAndGetNextArray(int skip, int n) {

        // Skip the specified number of elements.
        getArray(skip);

        return getArray(n);
    }

    // A private method that returns an array containing the next n elements.
    private int[] getArray(int n) {
        int[] vals = new int[n];

        for(int i=0; i<n; i++) vals[i] = getNext();
        return vals;
    }

    void reset();  // restart
    void setStart(int x);  // set starting value


}

// Implement series.
class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }

    public int getPrev() {
        prev = -2;
        return prev;
    }
}

class ByThrees implements Series {
    int start;
    int val;
    int prev;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;


        for(int i=0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next value is " + ob.getNext());

            ob = threeOb;
            System.out.println("Next value is " + ob.getNext());
        }

        int[] a = twoOb.getNextArray(4);

        for(int i=0; i<4; i++)
            System.out.print(a[i] + " ");

        System.out.println();
        a = twoOb.skipAndGetNextArray(4, 3);

        for(int i=0; i<3; i++)
            System.out.print(a[i] + " ");

        twoOb.getPrev();
        ob = twoOb;
//        ob.getPrev();


        /*
        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

         */
    }
}