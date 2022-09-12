package InputOutput;
/*
// Read an array of bytes from keyboard.

import java.io.*;

class ReadBytes {
    public static void main(String[] args)
        throws IOException {
         byte[] data = new byte[10];

        System.out.println("Enter some characters.");
        System.in.read(data);
        System.out.print("You entered: ");
        for(int i=0; i < data.length; i++)
            System.out.print((char) data[i]);
    }
}



// Demonstrate Syste.out.write().
class WriteDemo {
    public static void main(String[] args) {
        int b;

        b = 'X';
        System.out.write(b);
        System.out.write('\n');
    }
}