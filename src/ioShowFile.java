/*  Display a text file. Version 1.

    To use this program, specify the name
    of the file that you want to see.
    For example, to see a file called TEST.TXT,
    use the following command line.

    java ShowFile TEST.TXT
 */

/*
import java.io.*;

class ioShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // First make sure that a file has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // read bytes until EOF is encountered
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file.");
        }

        try {
            fin.close();
        } catch (IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}


 */

/*  Display a text file. Version 2, with finally block.

    To use this program, specify the name
    of the file that you want to see.
    For example, to see a file called TEST.TXT,
    use the following command line.

    java ShowFile TEST.TXT
 */

/*
import java.io.*;

class ioShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // First make sure that a file has been specified.
//        if(args.length != 1) {
//            System.out.println("Usage: ShowFile File");
//            return;
//        }

        try {
            fin = new FileInputStream("t.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // read bytes until EOF is encountered
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file.");
        } finally {
            // Close file on the way out of the try block.
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}


 */



/*  Display a text file. Version 3, with a single try block.

    This variation wraps the code that opens and
    accesses the file within a single try block.
    The file is closed by the finally block.

    java ShowFile TEST.TXT
 */

/*

import java.io.*;

class ioShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // First make sure that a file has been specified.
//        if(args.length != 1) {
//            System.out.println("Usage: ShowFile File");
//            return;
//        }

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.

        try {
            fin = new FileInputStream("t.txt"); // args[0]

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            // Close file in all cases.
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}


 */


/*  Display a text file. Version 4, with try-with-resources.

    This version of the ioShowFile program uses a try-with-resources
    statement to automatically close a file when it is no longer needed.

    java ioShowFile TEST.TXT
 */


import java.io.*;

class ioShowFile {
    public static void main(String[] args) {
        int i;

        // First make sure that a file has been specified.
//        if(args.length != 1) {
//            System.out.println("Usage: ShowFile File");
//            return;
//        }

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.

        try (var fin = new FileInputStream("t.txt")) {

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
