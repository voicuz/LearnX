/*  Copy a text file.
    To use this program, specify the name
    of the source file and the destination file.
    For example, to copy a file called FIRST.TXT
    to a file called SECOND.TXT, use this
    command line.

    java ioCopyFile FIRST.TXT SECOND.TXT
 */
/*

import java.io.*;

class ioCopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

//        // First, make sure that both files has been specified.
//        if(args.length != 2) {
//            System.out.println("Usage: ioCopyFile from to");
//            return;
//        }

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream("t.txt");  // args[0]
            fout = new FileOutputStream("b.txt"); // args[1]

            do {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while (i != -1);

            System.out.println("Copy complete.");

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Input File.");
            }
            try {
                if(fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Output File.");
            }
        }
    }
}


 */

/*  Copy a text file. Version 2 with try-with-resources.

    A version of ioCopyFile that uses try-with-resources.
    It demonstrates two resources (in this case files) being
    managed by a single try statement.

    java ioCopyFile FIRST.TXT SECOND.TXT
 */

import java.io.*;

class ioCopyFile {
    public static void main(String[] args) throws IOException {
        int i;

//        // First, make sure that both files has been specified.
//        if(args.length != 2) {
//            System.out.println("Usage: ioCopyFile from to");
//            return;
//        }

        // Copy a File.
        try(var fin = new FileInputStream("t.txt");
            var fout = new FileOutputStream("b.txt")) {
            do {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while (i != -1);

            System.out.println("Copy complete.");

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
