/*  This version of the ShowFile program uses a try-with-resources
    statement to automatically close a file when it is no longer needed.
 */

import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;

        // First, confirm that a filename has been specified.
//        if(args.length != 1) {
//            System.out.println("Usage: ShowFile filename");
//            return;
//        }

        // The following code uses try-with-resources to open a file and then automatically close it when the try block is left.
//        try(var fin = new FileInputStream(args[0])) {
        try(var fin = new BufferedReader(new FileReader("test.txt"))) {
            // var as alternative to FileInputStream fin = new FileInputStream(args[0])

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
