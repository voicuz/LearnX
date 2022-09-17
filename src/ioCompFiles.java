/*  Try This 10-1

    Compare two files.

    To use this program, specify the names
    of the files to be compared on the command line.

    java ioCompFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

class ioCompFiles {
    public static void main(String[] args) {
        int i=0, j=0, count = 0;

        // First make sure that both files have been specified.
//        if(args.length != 2) {
//            System.out.println("Usage: ioCompFile f1 f2");
//            return;
//        }

        try(var f1 = new FileInputStream("a.txt");
        var f2 = new FileInputStream("b.txt")) {

            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if(i != 13) count++;
                if(i != j) break;
            } while ((i != -1) && (j != -1));

            if(i != j)
                System.out.println("Files differ at position " + count);
            else
                System.out.println("Files are the same.");

        } catch (IOException exc) {
            System.out.println("Reading error.");
        }
    }
}

/*

// Compare files that ignores the case of letters.

import java.io.*;

class ioCompFiles {
    public static void main(String[] args) {
        int i=0, j=0, count = 0;
        char c1, c2;

        // First make sure that both files have been specified.
//        if(args.length != 2) {
//            System.out.println("Usage: ioCompFile f1 f2");
//            return;
//        }

        try(var f1 = new FileInputStream("a.txt");
            var f2 = new FileInputStream("b.txt")) {

            // Check the contents of each file.
            do {
                c1 = Character.toLowerCase((char) f1.read());
                c2 = Character.toLowerCase((char) f2.read());
                count++;
                if(c1 != c2) break;
            } while ((c1 != 65535) && (c2 != 65535));

            if(c1 != c2)
                System.out.println("Files differ at position " + count);
            else
                System.out.println("Files are the same.");

        } catch (IOException exc) {
            System.out.println("Reading error.");
        }
    }
}
*/