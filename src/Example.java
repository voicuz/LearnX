/*

public class Example {
    public static void main (String [] args) {
        System.out.println("Java drives the Web.");
    }
}



    //This demonstrates a variable



public class Example {
    public static void main (String[] args){
        int myVar1, myVar2;

        myVar1 = 1024; // this assigns 1024 ti myVar1

        System.out.println("myVar contains: " + myVar1);

        myVar2 = myVar1 / 2;

        System.out.print("myVar2 contains myVar1 / 2: ");
        System.out.println(myVar2);

    }
}


    //This program illustrates the difference between int and double

public class Example{
    public static void main(String[] args){
        int v; //This declares and integer variable
        double x; //This declares a floating-point variable

        v = 10; //Assign v value of 10
        x = 10.0; //Assign x value of 10.0

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);
        System.out.println(); // print a blank line

        // now divide both by 4
        v = v / 4;
        x = x / 4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);

    }

}




public class Example{
    public static void main(String[] args){

        //Try this 1-1 | This program converts gallons to liters

        double gallons; // holds the number of gallons
        double liters; // holds the conversion to liters

        gallons = 10; // we start with 10
        liters = gallons * 3.7854; // convert to liters

        System.out.println(gallons + " gallons is " + liters + " liters.");

    }
}



public class Example{
    public static void main(String[] args){

        // Demonstrate the if statement

        int a, b, c;

        a = 2;
        b = 3;

        if(a < b) System.out.println("a is less than b");

        // this won't display anything
        if(a == b) System.out.println("you won't see this.");

        System.out.println();

        c = a - b; // c contains -1

        System.out.println("c contains " + c);
        if(c < 0) System.out.println("c is negative");
        if(c >= 0) System.out.println("c is non-negative");

        System.out.println();

        c = b - a; // c contains 1

        System.out.println("c contains " + c);
        if(c < 0) System.out.println("c is negative");
        if(c >= 0) System.out.println("c is non-negative");

    }
}


public class Example{
    public static void main(String[] args){

        // Demonstrate the for loop

        int count;

        for(count = 5; count < 5; count++)
            System.out.println("This is count: " + count);

        System.out.println("Done.");


    }
}



public class Example {
    public static void main (String[] args) {

        // Demonstrate a bloc of code

        double i, j, d;

        i = 5;
        j = 10;

        // the target of this if is a block
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
            }
        }
    }



public class Example {
    public static void main(String[] args) {

        // Try this 1-2 | This program displays a conversion table of gallons to liters.

        double gallons, liters;
        int counter;

        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallon(s) is " + liters + " liter(s).");

            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0; // reset the line counter;
            }
        }
    }
}




public class Example {
    public static void main(String[] args) {

        // Chapter 1 self test.
        // Calculator to compute your effective weight on the moon.

        double earthKg, moonKg;

        earthKg = 69;
        moonKg = earthKg * 0.17;

        System.out.println("Your earth weight in kg of " + earthKg + " on moon is " + moonKg);

    }
}


public class Example {
    public static void main(String[] args) {

        // Chapter 1 self test | This program displays a conversion table of inches to meters.

        double inch, meter;
        int counter;

        counter = 0;
        for(inch = 1; inch <= 144; inch++) {
            meter = inch / 39.73; // convert to meters
            System.out.println(inch + " inch(s) is " + meter + " meter(s).");

            counter++;
            if(counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter;
            }
        }
    }
}


public class Example {
    public static void main(String[] args) {

        //Compute the number of cubic inches in 1 cubic mile.

        long ci, im;

        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");


    }
}



public class Example {
    public static void main(String[] args) {

        // Use the Pythagorean theorem to find the length of the hypotenuse given the length of two opposing sides.

        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);

    }
}


public class Example {
    public static void main(String[] args) {

        // Character variables can be handled like integer.

        char ch = 'X';
        System.out.println("ch contains " + ch);

        ch++;
        System.out.println("ch is now " + ch);

        ch = 90;
        System.out.println("ch is now " + ch);

    }
}



public class Example {
    public static void main(String[] args) {

        // Demonstrate boolean values.

        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement.
        if(b) System.out.println("This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        // Outcome of a relational operator is a boolean.
        System.out.println("10 > 9 is " + (10 > 9));
    }

}


public class Example {
    public static void main(String[] args) {

        // Try this 2-1
        // Compute the distance to a lighting strike whose sound takes 7.2 seconds to reach you.

        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lighting is " + dist + " feet away.");

    }

}



public class Example {
    public static void main(String[] args) {

        // Demonstrate escape sequence in strings.

        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");

    }
}


// Demonstrate dynamic intersection.

public class Example {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // dynamically initialize volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);

    }
}


// Demonstrate block scope.
public class Example {
    public static void main(String[] args) {
        int x; // known to all code within main.

        x = 10;
        if (x == 10) { // start new scope

            int y = 20; // known only to this block

            // x and y both known here

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error. y not known here

        // x is still known here
        System.out.println("x is " + x);
    }
}


// Demonstrate lifetime of a variable.
public class Example {
    public static void main(String[] args) {
        int x;
        for(x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is " + y); // this always prints -1
            y = 100;
            System.out.println("y is now " + y);
        }
    }
}

 */

// This program attempts to declare a variable in a inner scope with the same name as one defined in an outer scope.
// *** This program will not compile. ***

/*
public class Example {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count++) {
            System.out.println("This count is " + count);

            int count; // illegal.
            for(count = 0; count < 2; count++)
                System.out.println("This program is in error.");
        }
    }
}



// Demonstrate the % (modulus) operator.

public class Example {
    public static void main(String[] args) {
        int iResult, iRem, x, y, z;
        double dResult, dRem;


        iResult = 10 / 3;
        iRem = 10 % 3;

        dResult = 10.0 / 3.0;
        dRem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10 / 3 is " + iResult + " " + iRem);
        System.out.println("Result and remainder of 10.0 / 3.0 is " + dResult + " " + dRem);

        x = 10;
        y = x++;
        z = x;

        System.out.println(x);
        System.out.println(y);

    }
}


// Demonstrate the relational and logical operators.

public class Example {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
}

// Demonstrate the short circuit operators.

public class Example {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // now, set d to zero.

        // Since d is zero, the second operand is not evaluated.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);


        // Now, try same thing without short-circuit operator.
        //   This will cause a divide-by-zero error.

        // if(d != 0 & (n % d) == 0)
        //    System.out.println(d + " is a factor of " + n);
    }
}



// Side effects can be important.

public class Example {
    public static void main(String[] args) {
        int i;

        i = 0;

        // Here i is still incremented even though the if statement fails.
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // displays 1.

        // In this case i is not incremented because the short-circuit operator skips the increment.
        if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statement executed: " + i); // still 1.


    }
}


// Demonstrate automatic conversion from long to double.

public class Example {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
}



// This program will not compile.
public class Example {
    public static void main(String[] args) {
        long L;
        double D;

        D = 0;
        L = D;

        System.out.println("L and D: " + L + " " + D);
    }
}


// Demonstrate casting.
public class Example {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int.
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; // No loss of info here. Byte can hold the value 100.
        System.out.println("Integer value of b: " + b);

        i = 130;
        b = (byte) i; // Information loss this time. A byte cannot hold value of 257.
        System.out.println("Integer value of b: " + b);

        b = 88; // ASCII code for X.
        ch = (char) b; // Cast between incompatible types.
        System.out.println("Byte value of ch: " + ch);

    }
}


// Try this 2-2: a truth table for the logical operators.
public class Example {
    public static void main(String[] args) {

        int p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + ((p*-p)+1));

        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + ((p*-p)+1));

        p = 0; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + ((p*-p)+1));

        p = 0; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + ((p*-p)+1));

    }
}


// A promotion surprise!

public class Example {
    public static void main(String[] args) {
        byte b1;
        int i;
        char ch1 = 'a', ch2 = 'b';

        b1 = 10;
        i = b1 * b1; // OK, no cast needed.

        b1 = 10;
        b1 = (byte) (b1 * b1); // cast needed;

        System.out.println("i and b: " + i + " " + b1);

        ch1 = (char) (ch1 + ch2);
        System.out.println(ch1);

        i = ch1 + ch2;
        System.out.println(i);
    }
}

 */

// Using a cast.

/*
public class Example {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions: " + (double) i / 3);
            System.out.println();
        }
    }
}


// Self test 2. Program that finds all prime numbers between 2 and 100.
// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
public class Example {
    public static void main(String[] args) {
        int i1, i2, result;
        int count = 0;

        System.out.println("List of prime numbers:");
        for(i1 = 2; i1 < 100; i1++) {
            for (i2 = 2; i2 < 100; i2++) {
                result = i1 % i2;
                if (result == 0.0) count++;
            }
            if (count < 2) System.out.print(i1 + " ");
            count = 0;
        }
    }
}

// Self test 2. Author version.
// Find prime numbers between 2 and 100.
public class Example {
    public static void main(String[] args) {
        int i, j, result;
        boolean isPrime;

        for(i = 2; i < 100; i++) {
            isPrime = true;

            // see if the number is evenly divisible.
            for(j = 2; j <= i/j; j++) {
                // if it is, then it's not prime.
                result = i % j;
                if (result == 0) isPrime = false;
            }
            if(isPrime)
                System.out.println(i + " is prime.");
        }
    }
}



// Read a character from the keyboard.

public class Example {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch;

            System.out.println("Press a key followed by ENTER: ");

            ch = (char) System.in.read(); // get a char.

            System.out.println("Your key is: " + ch);
        }
}


// Guess the letter game.
public class Example {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it? ");

        ch = (char) System.in.read(); // read a char from the keyboard.

        if(ch == answer) System.out.println("*** Right ***");
    }
}


// Guess the letter game, 2nd version
public class Example {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it? ");

        ch = (char) System.in.read(); // read a char from the keyboard.

        if(ch == answer) System.out.println("*** Right ***");
         else System.out.println("-- Wrong --");
    }
}


// Guess the letter game, 3nd version
public class Example {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.println("Can you guess it? ");

        ch = (char) System.in.read(); // read a char from the keyboard.

        if(ch == answer) System.out.println("*** Right ***");
        else {
            System.out.print("Your answer is ");
            // a nested if.
            if(ch < answer) System.out.println("too low.");
             else System.out.println("too high.");
        }
    }
}


// Demonstrate an if-else-if ladder.
public class Example {
    public static void main(String[] args) {
        int x;

        for(x=0; x<6; x++) {
            if(x==1)
                System.out.println("x is one.");
            else if(x==2)
                System.out.println("x is two.");
            else if(x==3)
                System.out.println("x is three.");
            else if(x==4)
                System.out.println("x is four.");
            else System.out.println("x is not between 1 and 4.");
        }
    }
}


// Demonstrate the switch.
public class Example {
    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                case 4:
                    System.out.println("i is four.");
                    break;
                default:
                    System.out.println("i is five or more.");
            }
    }
}


// Demonstrate the switch. Case two.
public class Example {
    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("i is 0, 1, 2, or 3.");
                    break;
                case 4:
                    System.out.println("i is four.");
                    break;
                default:
                    System.out.println("i is five or more.");
            }
    }
}


// Demonstrate the switch. Case three.
public class Example {
    public static void main(String[] args) {
        char ch1 = 'A', ch2 = 'A';


            switch(ch1) {
                case 'A':
                    System.out.println("This A is part of outer switch.");
                    switch (ch2) {
                        case 'A':
                            System.out.println("This A is part of inner switch.");
                            break;
                    }
                    break;
                    }
            }
    }


// Try this 3-1. A simple help system.
public class Example {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Choose one: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The traditional switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant");
                System.out.println("   statement sequence");
                System.out.println("   break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found.");
        }
    }
}


// Show square roots of 1 to 99 and the rounding error.
public class Example {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of : " + num + " is " + sroot);

            // compute rounding error.
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);;
            System.out.println();
        }
    }
}


// A negatively running loo
public class Example {
    public static void main(String[] args) {
        int x;

        for(x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}

// Use commas in a for statement.
public class Example {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j = 10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}


// Loop until an S is typed.
public class Example {
    public static void main(String[] args)
        throws java.io.IOException {

        int i;
        char ch = 'a', ch2 = 'b';

        System.out.println("Pres S to stop.");

        for(i = 0; ch != 'S'; i++){
            System.out.print("Pass #" + i + ": ");
            ch = (char) System.in.read();
            ch2 = (char) System.in.read();
        }
    }
}


// Parts of for can be empty.
public class Example {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10;){
            System.out.println("Pass #" + i);
            i++; // increment loop control var.
        }
    }
}


// Move more out of the control loop.
public class Example {
    public static void main(String[] args) {
        int i;

        i = 0;
        for(; i < 10;){
            System.out.println("Pass #" + i);
            i++; // increment loop control var.
        }
    }
}


// The body of a loop can be empty.
public class Example {
    public static void main(String[] args) {
        int i, sum = 0;

        // Sum the numbers through 5.
        for(i = 1; i <= 5; sum += i++) ;

        System.out.println("Sum is " + sum);
    }
}


// Declare loop control variable inside the for.
public class Example {
    public static void main(String[] args) {
        int sum = 0, fact = 1;

        // compute the factorial of numbers through 5.
        for(int i = 1; i <= 5; i++) {
            sum += i; // i is known through the loop.
            fact *= i;
        }

        // but, i is not known here.

        System.out.println("Sum is " + sum);
        System.out.println("Factorial is " + fact);
        //System.out.println(i);

    }
}

// Demonstrate the while loop.
public class Example {
    public static void main(String[] args) {
        char ch;

        // print the alphabet using a while loop.
        ch = 'a';
        while(ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}


// Compute integer powers of 2.
public class Example {
    public static void main(String[] args) {
        int e, result;

        for(int i=0; i < 10; i++){
            result = 1;
            e = i;
            while(e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 to the " + i + " power is " + result);
        }
    }
}


// Demonstrate the do-while loop.
public class Example {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;
        do {
            System.out.println("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // get a char.
        } while(ch != 'q');
    }
}

// Guess the letter game, 4th version.
public class Example {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, ignore, answer = 'K';

        System.out.println("I'm thinking of a letter between A an Z.");
        System.out.print("Can you guess it?\n");

        do {
            // read characters.
            ch = (char) System.in.read();

            // discard any other characters in the input buffer.
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');

            if(ch == answer) System.out.println("*** Right ***");
            else {
                System.out.print("...no, you're ");
                if(ch < answer) System.out.println(" too low");
                else System.out.println("to high");
                System.out.println("Try again.\n");
            }
        } while(answer != ch);
    }
}


// Try this 3-2 A simple help system. Version 2.
public class Example {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        do {
            System.out.println("Help on:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while(choice < '1' | choice > '5');


        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The traditional switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant");
                System.out.println("   statement sequence");
                System.out.println("   break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while(condition);");
                break;
        }
    }
}


// Using break to exit a loop.
public class Example {
    public static void main(String[] args) {
        int num;

        num = 100;

        // loop while i-squared is  less than num.
        for(int i=0; i < num; i++) {
            if(i*i >= num) break; // terminate loop if i*i >= 100.
            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}

// Read input until a q is received.
public class Example {
    public static void main(String[] args)
     throws java.io.IOException {

        char ch;

        for( ; ; ) {
            ch = (char) System.in.read(); // get char.
            if(ch == 'q') break;
        }
        System.out.println("Your pressed q.");
    }
}


// Using break with nested loop.
public class Example {
    public static void main(String[] args) {
        for(int i=0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.print("    Inner loop count: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break; // terminate the loop if t is 10.
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loop is complete.");
    }
}

// Using break with label.
public class Example {
    public static void main(String[] args) {
        int i;

        for(i=1; i<4; i++) {
            one: {
            two:   {
            three:   {
                    System.out.println("\ni is " + i);
                    if(i==1) break one;
                    if(i==2) break two;
                    if(i==3) break three;

                    // this is never reached.
                    System.out.println("won't print");
                     }
                  System.out.println("After block three.");
                   }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
        System.out.println("After block for.");
    }
}

// Another example of using break with label.
public class Example {
    public static void main(String[] args) {

        done:
            for(int i=0; i < 10; i++) {
                for(int j=0; j < 10; j++) {
                    for(int k=0; k < 10; k++){
                        System.out.println(k + " ");
                        if(k == 5) break done; // jump to done.
                    }
                    System.out.println("After k loop."); // this won't execute.
                }
                System.out.println("After j loop."); // this won't execute.
            }
        System.out.println("After i loop.");
    }
}


// Where you put a label is important.
public class Example {
    public static void main(String[] args) {
        int x=0, y=0;

        // Here, put a label before for statement.
        stop1: for(x=0; x < 5; x++) {
            for(y=0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }

        System.out.println();

//        now put a label immediately before {
        for(x=0; x < 5; x++)
           stop2: {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop2;
                System.out.println("x and y: " + x + " " + y);
             }
           }
    }
}


// This program contains an error.
public class Example {
    public static void main(String[] args) {

        one: for(int i=0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
        }

        for(int j=0; j < 100; j++) {
            if(j == 10) break one; // wrong.
            System.out.println(j + " ");
        }
    }
}

// Use continue.
public class Example {
    public static void main(String[] args) {
        int i;

        // print even numbers between 0 and 100.
        for(i = 0; i<=100; i++) {
            if((i%2) != 0) continue; // iterate
            System.out.println(i);
        }
    }
}


// Use continue with label.
public class Example {
    public static void main(String[] args) {

        outerloop:
         for(int i=0; i < 10; i++) {
             System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
             for(int j=0; j < 10; j++) {
                 if(j == 5) continue outerloop; //continue outer loop
                 System.out.print(j);
             }
         }
    }
}

// Try this 3-3.
// The finished Java statement Help system that processes multiple requests.
public class Example {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;

        for( ; ;) {
            do {
                System.out.println("\nHelp on:");
                System.out.println(" 1. if");
                System.out.println(" 2. switch");
                System.out.println(" 3. for");
                System.out.println(" 4. while");
                System.out.println(" 5. do-while");
                System.out.println(" 6. break");
                System.out.println(" 7. continue\n");
                System.out.print("Choose one (q to quit): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if(choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if(condition) statement;");
                    System.out.println("else statement;");
                    break;
                case '2':
                    System.out.println("The traditional switch:\n");
                    System.out.println("switch(expression) {");
                    System.out.println(" case constant");
                    System.out.println("   statement sequence");
                    System.out.println("   break;");
                    System.out.println(" //...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("The for:\n");
                    System.out.println("for(init; condition; iteration)");
                    System.out.println(" statement;");
                    break;
                case '4':
                    System.out.println("The while:\n");
                    System.out.println("while(condition) statement;");
                    break;
                case '5':
                    System.out.println("The do-while:\n");
                    System.out.println("do {");
                    System.out.println(" statement;");
                    System.out.println("} while(condition);");
                    break;
                case '6':
                    System.out.println("The break:\n");
                    System.out.println("break; or break label;");
                    break;
                case '7':
                    System.out.println("The continue:\n");
                    System.out.println("continue; or continue label;");
                    break;
//                case 'q':
//                    break;
            }
        }
    }
}


// Use nested loop to find factors of numbers between 2 and 100.
public class Example {
    public static void main(String[] args) {
        int count = 0;

        for(int i=2; i <= 100; i++) {
            System.out.print("Factors of " + i + ": ");
            for(int j=2; j <= i/2; j++) {
                if ((i % j) == 0) {
                    System.out.print(j + " ");
                    count++;
                }
                if(count == 0 & j == 7) break;
            }
            count = 0;
                System.out.println();
        }
    }
}



// Self Test 3. Point 1.
public class Example{
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        int count = 0;
        System.out.print("Enter sting of characters (. to quit): ");
        do {
            ch = (char) System.in.read();
            if(ch == ' ') count++;

        } while (ch != '.');
        System.out.println();
        System.out.println("Number of spaces in string: " + count);
    }

}

// Self test 3. Point 9.
public class Example {
    public static void main(String[] args) {

        for(int i=1; i < 100; i += i) System.out.print(i + " ");
    }
}



// Self test 3. Point 10.
public class Example {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;
        int count = 0;

        System.out.println("Enter string of characters (. to quit): ");

        do {
            ch = (char) System.in.read();
            if((ch >= 'A') & (ch <= 'Z')) {
                ch+=32;
                System.out.print(ch);
                count++;
            } else if ((ch >= 'a') & (ch <= 'z')) {
                ch-=32;
                System.out.print(ch);
                count++;
            } else System.out.print(" ");

        } while (ch != '.');

        System.out.println();
        System.out.println("Number of case changes: " + count);

    }
}


class ChkNum {
    // return true if x is even
    boolean isEven(int x) {
        if((x%2) == 0) return true;
        else return false;
    }
}

class ParamDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if(e.isEven(10)) System.out.println("10 is even.");

        if(e.isEven(9)) System.out.println("9 is even.");

        if(e.isEven(8)) System.out.println("8 is even.");

    }
}


class Factor {
    boolean isFactor(int a, int b) {
        if( (b % a) == 0) return true;
        else return false;
    }
}

class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(2, 20)) System.out.println("2 is factor.");
        if(x.isFactor(3, 20)) System.out.println("This won't be displayed.");
    }
}



// A simple constructor

class MyClass {
    int x;

    MyClass() {
        x = 10;
    }
}

class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.x + " " + t2.x);
    }
}


// A parametrize constructor.

class MyClass {
    int x;

    MyClass(int i) {
        x = i;
    }
}

class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}


// The this keyword.
class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1;
        if(exp == 0) return;
        for( ; exp > 0; exp--) this.val = this.val * base;
    }

    double getVal() {
        return this.val;
    }
}

class PwrDemo {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.getVal());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.getVal());
    }
}

 */

/*

// The this keyword.
class Pwr {
    double b;
    int e;
    double val;

    Pwr(double b, int e) {
        this.b = b;
        this.e = e;

        this.val = 1;
        if(e == 0) return;
        for( ; e > 0; e--) this.val = this.val * b;
    }

    double getVal() {
        return val;
    }
}

class PwrDemo {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.getVal());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.getVal());
    }
}



// Demonstrate a one-dimensional array.
class ArrayDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for(i=0; i < 10; i++)
            sample[i] = i;

        for(i=0; i < 10;i++)
            System.out.println("This is sample[" + i + "]: " + sample[i]);


    }
}


// Find the minimum and maximum numbers in an array.
class MinMax {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];

        for(int i=0; i < 10; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        System.out.println("Min is " + min + ", max is " + max);

    }
}


// Use array initializers.
class MinMax2 {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -975, 5623, 643, -9, 287, 49};
        int min, max;

        min = max = nums[0];
        for(int i=0; i < 10; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }

        System.out.println("Min is " + min + ", max is " + max);
    }
}


// Try this 5-1. Demonstrate the bubble sort.
class BubbleSort{
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        size = 10;  // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // This is the bubble sort.
        for(a=1; a<size; a++)
            for(b=size-1; b>=a; b--) {
                if(nums[b-1] > nums[b]) {  // if out of order
                    // exchange elements
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

        // display sorted arrays
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}

// Demonstrate a two-dimensional array.
class TwoD {
    public static void main(String[] args) {
        int t, i;
        int [][] table = new int[3][4];

        for(t=0; t < 3; ++t){
            for(i=0; i < 4; ++i) {
                table [t][i] = (t*4)+i+1;
                System.out.print(table[t][i] + " ");
                if(t != 2) System.out.print(" ");
            }
            System.out.println();
        }
    }
}


// Manually allocate differing sizes second dimension
class Ragged {
    public static void main(String[] args) {
        int[][] riders = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int i, j;

        // fabricate some fake data
        for(i=0; i<5; i++)
            for(j=0; j<10; j++)
                riders[i][j] = i + j + 10;
        for(i=5; i<7; i++)
            for(j=0; j<2; j++)
                riders[i][j] = i + j + 10;

        System.out.println("Riders per trip during the week:");
        for(i=0; i<5; i++) {
            for (j = 0; j < 10; j++)
            System.out.print(" " + riders[i][j]);
            System.out.println();
        }

        System.out.println("Riders per trip during the weekend:");
        for(i=5; i<7; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(" " + riders[i][j]);
            System.out.println();
        }
    }
}


// Initialize a two-dimensional array
class Squares {
    public static void main(String[] args) {
        int a, b, c;
        int[][] sqrs = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100}
        };
        int i, j;

        for(i=0; i<10; i++) {
            for (j = 0; j < 2; j++)
                System.out.print(" " + sqrs[i][j]);
            System.out.println();
        }
    }
}



// Assigning array reference variables.
class AssignARef {
    public static void main(String[] args) {
        int i;

        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for(i=0; i < 10; i++)
            nums1[i] = i;

        for(i=0; i < 10; i++)
            nums2[i] = -i;

        System.out.print("Here is nums1 ");
        for(i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Here is nums2 ");
        for(i=0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1;

        // Here is nums2 after assignment.
        System.out.print("Here is nums2 after assignment ");
        for(i=0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();


        // now operate on nums1 array through nums2
        nums2[3] = 99;

        System.out.print("Here is nums1 after change through nums2 ");
        for(i=0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

    }
}

// Use the length array member.
class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = {1, 2, 3};
        int[][] table = { //a variable-length table
                {1, 2, 3},
                {4, 5},
                {6, 7, 8}
        };

        System.out.println("length of list is " + list.length);
        System.out.println("length of nums is " + nums.length);
        System.out.println("length of table is " + table.length);
        System.out.println("length of table[0] is " + table[0].length);
        System.out.println("length of table[1] is " + table[1].length);
        System.out.println("length of table[2] is " + table[2].length);
        System.out.println();

        // use length to initiate a list
        for(int i=0; i < list.length; i++)
            list[i] = i * i;

        System.out.print("Here is list ");
        // now use length to display list
        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

    }
}



// Use length variable to help copy an array.
class ACopy {
    public static void main(String[] args) {
        int i;
        int[] nums1 = new int[10];
        int[] nums2 = new int[3];

        for(i=0; i < nums1.length; i++)
            nums1[i] = i;

        // copy nums1 to nums2
        if(nums2.length >= nums1.length)
            for(i=0; i < nums1.length; i++)
                nums2[i] = nums1[i];

        for(i=0; i< nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}


// Use for-each style for loop.

class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Use for each style for loop to display and sum the values.
        for(int x : nums) {
            System.out.println("Values is: " + x);
            sum += x;
//            if(x == 5) break; // stop the loop when 5 is obtained.
        }
        System.out.println("Summation is: " + sum);
    }
}


// Use for-each loop is essentially read only.

class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Use for each style for loop to display and sum the values.
        for(int x : nums) {
            System.out.print(x + " ");
            x = x * 5; // no effect on nums
            x = x * 2;
        }
        System.out.println();
        for (int x : nums) System.out.print(x + " ");
    }
}


// Using for-each style for on a two-dimensional array.
class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // give nums some values
        for(int i=0; i < 3; i++)
            for(int j=0; j < 5; j++)
                nums[i][j] = (i+1) * (j+1);

        // Use for-each for loop to display and sum the values.
        for(int[] x : nums) {
            for(int y : x) {
                System.out.println("Values is " + y);
                sum += y;
            }
        }
        System.out.println("Summation is " + sum);
    }
}




// Some string operations.
class StrOps {
    public static void main(String[] args) {
        String str1 = "When it comes to Web programming, Java is #1.";
        String str2 = str1;
        String str3 = "Java strings are powerful.";
        int result, idx;
        char ch;

        System.out.println("Length of str1 is " + str1.length());

        // display str1 one character at the time
        System.out.println(str1);
        System.out.println();
        for (int i=0; i < str1.length(); i++)
            System.out.print(str1.charAt(i) + " ");
        System.out.println("\n");

        if(str1.equals(str2)) System.out.println("str1 equals str2");
        else System.out.println("str1 does not equal str2");

        if(str1.equals(str3)) System.out.println("str1 equals str3");
        else System.out.println("str1 does not equal str3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("str1 and str3 are equal " + result);
        if(result < 0)
            System.out.println("str1 is less then str3 " + result);
        else
            System.out.println("str1 is greater then str3 " + result);
    }
}



class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Use for each style for loop to display and sum the values.
        for(int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println();
        for (int x : nums) System.out.printf("%s %s", x, x);


    }
}


// Demonstrate string arrays.
class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"This", "is", "a", "test."};

        System.out.println("Original array: ");
        for (String s: strs)
            System.out.print(s + " ");
        System.out.println("\n");

        // change a string
        strs[1] = "was";
        strs[3] = "test, too.";

        System.out.println("Modified array: ");
        for(String s : strs)
            System.out.print(s + " ");
        System.out.println();

    }
}


// Use substring();
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        // construct a substring
        String substr = orgstr.substring(5, 18);

        System.out.printf("orgstr: %s", orgstr);
        System.out.println();
        System.out.printf("substr: %s", substr);
    }
}



// Use a string to control a switch statement.
class StringSwitch {
    public static void main(String[] args) {

        String command = "cancel";

        switch (command) {
            case "connect":
                System.out.println("Connecting.");
                break;
            case "cancel" :
                System.out.println("Canceling.");
                break;
            case "disconnect" :
                System.out.println("Disconnecting.");
                break;
            default:
                System.out.println("Command error.");
                break;
        }
    }
}


// A simple demonstration of local variable type inference.
class VarDemo {
    public static void main(String[] args) {
        var MyArray = new int[3];

        // Use type inference to declare the type of variable named avg. In this case, double is inferred.
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);

        // In the following context, var is not a predefined identifier. It is simply a user-defined variable name.
        var var = 1;
        System.out.println("Value of var: " + var);

        // Interesting, in the following sequence, var is uses as both the type of declaration and as a variable name in the initializer.
        var k = -var;
        System.out.println("Value of k: " + k);

    }
}


// Local variable type inference with a user-defined class type.
class MyClass {
    private int i;

    MyClass(int k) {i = k;}

    int geti() {return i;}
    void seti(int k) { if(k>=0) i = k;}
}

class VarDemo2 {
    public static void main(String[] args) {
        var mc = new MyClass(10);  // Notice the use of var here.

        System.out.println("Value of i in mc is: " + mc.geti());
        mc.seti(19);
        System.out.println("Value of i in mc is now: " + mc.geti());
    }
}

// Use type inference in a for loop.
class VarDemo3 {
    public static void main(String[] args) {

        // Use type inference with the loop control variable.
        System.out.print("Values of x: ");
        for(var x=2.5; x < 100; x = x * 2)
            System.out.print(x + " ");

        System.out.println();

        // Use type inference with the iteration variable.
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print("Values in nums array: ");
        for(var x: nums)
            System.out.print(x + " ");

        System.out.println();
    }
}


// Uppercase letters.
class UpCase {
    public static void main(String[] args) {
        char ch;

        for(int i=0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            // This statement turns off the 6th bit.
            ch = (char) ((int) ch & 65503); // ch is now uppercase

            System.out.print(ch + " ");

//            var l = (char) 65503;
//            var x = (int) ch;
//            System.out.print(l + " ");

        }
    }
}


// Display the bits within byte.
class ShowBits {
    public static void main(String[] args) {
        int t, count = 0;
        int val;

        val = 32;
        for(t=32768; t > 0; t = t/2) {
            if((val & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
            count++;
            if(count == 4) {
                System.out.print(" ");
                count = 0;
            }
        }
    }
}

// Lower case letters.
class LowCase {
    public static void main(String[] args) {
        char ch;

        for(int i=0; i<10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // This statement turns the 6th bit.
            ch = (char) ((int) ch | 32); // ch is now lowercase

            System.out.print(ch + " ");
        }
    }
}

// Use XOR to encode and decode a message.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.printf("Original message: %s\n", msg);

        // encode message
        for(int i=0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.printf("Encoded message: %s\n", encmsg);

        // decode message
        for(int i=0; i < msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.printf("Decoded message: %s\n", decmsg);
    }
}


// Demonstrate the bitwise NOT.
class NotDemo {
    public static void main(String[] args) {
        byte b = -1;

        for(int t=128; t>0; t = t/2) {
            if((b & t) != 0) System.out.printf("1 ");
            else System.out.printf("0 ");
        }
        System.out.println();

        // reverse all bits
        b = (byte) ~b;

        for(int t=128; t > 0; t = t/2) {
            if((b&t) != 0) System.out.printf("1 ");
            else System.out.printf("0 ");
        }
    }
}

// Demonstrate the shift << and >> operators.
class ShiftDemo {
    public static void main(String[] args) {
        int val = 1;

        for(int i=0; i < 8; i++) {
            for(int t=128; t > 0; t = t/2) {
                if((val&t) != 0) System.out.printf("1 ");
                else System.out.printf("0 ");
            }
            System.out.println();
            val = val << 1;  // left shift
        }
        System.out.println("\n");

        val = 123;
        for(int i=0; i < 8; i++) {
            for(int t = 128; t > 0; t = t/2) {
                if((val & t) != 0) System.out.printf("1 ");
                else System.out.printf("0 ");
            }
            System.out.println();
            val = val >> 1;  // right shift
        }

        System.out.println();

        val = 8;
        System.out.println(val);

        val = val >>> 2;
        System.out.println(val);
    }
}


// Prevent a division by zero using the ? operator.
class NoZeroDev {
    public static void main(String[] args) {
        int result;

        for(int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;
            if(i != 0)
                System.out.printf("100 / %s is %s\n", i, result);

        }
    }
}

// Prevent a division by zero using ? operator. Version 2.
class NoZeroDev2 {
    public static void main(String[] args) {
        int result;
        int x = -5, y = 0;

        for(int i = - 5; i < 6; i++)
            if(i != 0 ? true : false)
                System.out.printf("100 / %s is %s\n", i, 100 / i);

        y = x < 0 ? 10 : 20;
        System.out.println();
        System.out.println(y);

    }
}


// Public vs private access.
class MyClass {
    private int alpha;  // private access;
    public int beta;  // public access;
    int gamma;  // default access;

    // Methods to access alpha. It's OK for a member of a class to access a private member of the same class.
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        // Access to alpha is allowed only through it's accessor methods.
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // You cannot access alpha like this:
//        ob.alpha = 10;  // wrong, alpha is private

        // These are ok because beta and gamma are public.
        ob.beta = 88;
        ob.gamma = 99;
    }
}

// Objects can be passed to methods.
class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true of ob defines the same block.
    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Return true if ob has the same volume.
    boolean sameVolume (Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }
}

// Primitive types are passed by value.
class Test {
    // This method causes no changes to the arguments used in the call.
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.printf("a and b before call: %s %s\n", a, b);

        ob.noChange(a, b);

        System.out.printf("a and b after call: %s %s\n", a, b);
    }
}


// Objects are passed through their reference.
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    // Pass an object. Now, ob.a and ob.b in object used in the call will be changed.
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class PassObRej {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.printf("ob.a and ob.b before call: %s %s\n", ob.a, ob.b);

        ob.change(ob);

        System.out.printf("ob.a and ob.b after call: %s %s", ob.a, ob.b);
    }
}


// Return a string object.
class ErrorMsg {
    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    // Return the error message.
    String getErrorMsg(int i) {
        if(i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}

class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(4));
    }
}


// Return a programmer-defined object.
class Err {
    String msg;  // error message
    int severity;  // code indicating severity of error

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String[] msgs = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int[] howBad = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}

class ErrInfo {
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " severity: " + e.severity);

        e = err.getErrorInfo(5);
        System.out.println(e.msg + " severity: " + e.severity);
    }
}


// Demonstrate method overloading.
class OverLoad {
    void ovlDemo() {
        System.out.println("No parameters");
    }

    // Overload ovlDemo for one integer parameter.
    void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    int ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    // Overload ovlDemo for two integer parameters.
    int ovlDemo(int a, int b) {
        System.out.printf("Two parameters %s %s\n", a, b);
        return a + b;
    }

    // Overload for ovlDemo method for double parameters.
    double ovlDemo(double a, double b) {
        System.out.printf("Two double parameters %s %s\n", a, b);
        return a + b;
    }
}


class OverloadDemo {
    public static void main(String[] args) {
        OverLoad ob = new OverLoad();
        int resI;
        double resD;

        // call all versions of ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4,6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}


// Automatic type conversion can effect the overloaded method resolution.
class Overload2 {
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i);  // calls ob.f(int)
        ob.f(d);  // calls ob.f(double);

        ob.f(b);  // calls ob.f(int) - type conversion
        ob.f(s);  // calls ob.f(int) - type conversion
        ob.f(f);  // calls ob.f(double) - type conversion
    }
}

// Add f(byte).
class Overload2 {
    void f(byte x) {
        System.out.println("Inside f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(doube): " + x);
    }
}

class TypeConv {
    public static void main(String[] args) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ob.f(i);
        ob.f(d);

        ob.f(b);  // call ob.f(byte)  - now, no type conversion

        ob.f(s);
        ob.f(f);
    }
}



// Demonstrate an overloading constructor.
class MyClass {
    int x;

    MyClass() {
        System.out.println("Inside MyClass().");
        x = 0;
    }

    MyClass(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    MyClass(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }

    MyClass(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.33);
        MyClass t4 = new MyClass(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}


// Initialize one object with another.
class Summation {
    int sum;

    // Construct from an int.
    Summation(int num) {
        sum = 0;
        for(int i=1; i <=num; i++)
            sum += i;
    }

    // Construct from another object.
    Summation(Summation ob) {
        sum = ob.sum;
    }
}

class SumDemo {
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}

// A simple example of recursion.
class Factorial {
    // This is a recursive function.
    int factR(int n) {
        int result;
        if(n==1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    // This is an iterative equivalent.
    int factI(int n) {
        int t, result;

        result = 1;
        for(t=1; t<=n; t++)
            result *= t;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorial using recursive method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorial using iterative method.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}


// Use a static variable.
class StaticDemo {
    int x;  // a normal instance variable
    static int y;  // a static variable

    // Return the sum of the instance variable x
    // and the static variable y.
    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        // Each object has its own copy of an instance variable.
        ob1.x = 10;
        ob2.x = 20;
        System.out.println("Of course, ob1.x and ob2.x are independent.");
        System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x);
        System.out.println(ob1.sum());
        System.out.println(ob2.sum());
        System.out.println();

        // Each object shares one copy of the static variable.
        System.out.println("The static variable y is shared.");
        StaticDemo.y = 19;
        System.out.println("Set StaticDemo.y to 19.");

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100");

        System.out.println("ob1.sum: " + ob1.sum());
        System.out.println("ob2.sum: " + ob2.sum());
        System.out.println();
    }
}

// Use a static method.
class StaticMeth {
    static int val = 1024;  // a static variable

    // a static method
    static int vlaDiv2() {
        return val/2;
    }
}

class SDemo2 {
    public static void main(String[] args) {

        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.vlaDiv2());

        StaticMeth.val = 4;
        System.out.println("val is " + StaticMeth.val);
        System.out.println("StaticMeth.valDiv2(): " + StaticMeth.vlaDiv2());
    }
}



// Won't compile
class StaticError {
    int denom = 3;  // a normal instance variable
    static int val = 1024;  // a static variable

    // Error! Can't access a non-static variable from within a static method.
    static int valDivDenom() {
        return val/denom;  // won't compile
    }
}



// Use a static block
class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
        System.out.println("Still inside static block");
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class SDemo3 {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside constructor");

        System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + StaticBlock.rootOf3);
    }
}


// Use a inner class.
class Outer {
    int[] nums;

    Outer(int[] n) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();
        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    // This is a inner class.
    class Inner {
        int min() {
            int m = nums[0];

            for(int i=1; i < nums.length; i++)
                if(nums[i] < m) m = nums[i];

            return m;
        }
        int max() {
            int m = nums[0];

            for(int i=1; i < nums.length; i++)
                if(nums[i] > m) m = nums[i];

            return m;
        }

        int avg() {
            int a = 0;

            for(int i=0; i < nums.length; i++)
                a += nums[i];

            return a/ nums.length;
        }
    }
}

class NestedClassDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outOb = new Outer(x);

        outOb.analyze();
    }
}


// Demonstrate variable-length arguments.
class VarArgs {

    // vaTest() uses a varargs.
    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {

        // Notice how vaTest can be called with a variable number of arguments.
        vaTest(10);      // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest();            // no args
    }
}


// Use varargs with standard arguments.
class VarArgs2 {

    // Here, msg is normal parameter and v is a varargs parameter.
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {

        // Notice how vaTest can be called with a variable number of arguments.
        vaTest("One varargs ",10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}


// Varargs and overloading.
class VarArgs3 {

    static void vaTest(int ... v) {
        System.out.println("vaTest(int ..): Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ...): Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }



    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest("Testing: ", 10, 20);
        vaTest(true, false, false);
    }
}


// Varargs, overloading and ambiguity.
// This class contains an error and will not compile.
class VarArgs4 {

    // Use an int varargs parameter.
    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    // Use a boolean vararg parameter.
    static void vaTest(boolean ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); // OK

        vaTest();  // Error: Ambiguous.
    }

}



class VarArgs4 {

    // Use an int varargs parameter.
    static void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    // Use a boolean vararg parameter.
    static void vaTest(int n, int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);  // OK

        vaTest();  // Error: Ambiguous.
    }

}


// Redesign of queue class for characters.
class Queue {
    private char[] q;  // this array holds the queue
    private int putloc, getloc;  // the put and the get indices

    // Construct an empty Queue given it's size.
    Queue(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = 0;
        getloc = q.length-1;
    }

    // Put a character into the queue.
    void push(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Get a character from the queue.
    char pop() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc--];
    }
}

// Self Test 6, exercise 3.
class Stack {
    private char[] q;  // this array holds the queue
    private int putloc, getloc;  // the put and the get indices

    // Construct an empty Queue given it's size.
    Stack(int size) {
        q = new char[size]; // allocate memory for queue
        putloc = 0;
        getloc = q.length-1;
    }

    // Put a character into the queue.
    void push(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Get a character from the queue.
    char pop() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc--];
    }
}

// Demonstrate the Queue class.
class QDemo2 {
    public static void main(String[] args) {
        // construct 10-element empty queue
        Stack q1 = new Stack(10);

        char ch;
        int i;

        // show put characters onto q1
        System.out.print("Input queue: ");
        for(i=0; i<10; i++) {
            System.out.print(ch = (char) ('A' + i));
            q1.push(ch);
//            System.out.print(ch);
        }
        System.out.println();


        // Show the queue.
        System.out.print("Contents for q1: ");
        for(i=0; i < 10; i++) {
            ch = q1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

    }
}


class VarArgs4 {

    // Use an int varargs parameter.
    static void sum(int ... v) {
        int sum = 0;
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");


        for(int i=0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
            sum += v[i];

        }
        System.out.println();
        System.out.println("Sum of arguments: " + sum);
    }


    public static void main(String[] args) {
        sum(1, 2, 3);  // OK
    }

}




class Test {
    int a;
    Test(int i) { a = i; }

    void swap(Test ob1, Test ob2) {
        int t;
        t = ob1.a;
        ob1.a = ob2.a;
        ob2.a = t;
    }

    public static void main(String[] args) {
        Test obA = new Test(3);
        Test obB = new Test(2);
        System.out.println(obA.a);
        System.out.println(obB.a);

        obA.swap(obA, obB);

        System.out.println(obA.a);
        System.out.println(obB.a);

    }
}


// Display a string backward using recursion.
class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if(idx != str.length()-1)
            backward(idx+1);

        System.out.print(str.charAt(idx));
    }
}

class BWDemo{
    public static void main(String[] args) {
        Backwards s = new Backwards("This is a test.");

        s.backward(0);
    }
}


// Recursive method that displays the contents of a string backwards.
class RecB {
    String str;
    int loc;

    RecB(String s) {
        str = s;
        loc = s.length()-1;
    }

    void Display(int idx) {
        if(idx != loc) Display(idx + 1);

        System.out.print(str.charAt(idx));
        }
}

class RBDemo {
    public static void main(String[] args) {
        RecB ob = new RecB("Second test.");

        ob.Display(0);
    }
}

// Self Test 6, exp 13.
class VarArgsT {

    // Use an int varargs parameter.
    int sum(int... v) {
        int sum = 0;
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");


        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
            sum += v[i];
        }
        System.out.println();
        return sum;
    }
}

    class VADemo {
        public static void main(String[] args) {
            VarArgsT sumIt = new VarArgsT();

            System.out.println(sumIt.sum(2, 3, 2));

        }
    }


// Class with parameter to check if a number is even. Method returns true or false.
class ChkNum {
//    int num;

    boolean isEven(int num) {
        if((num % 2) == 0) return true;
        else return false;
    }
}

class ChkNumDemo {
    public static void main(String[] args) {
        ChkNum ob = new ChkNum();

        System.out.println(ob.isEven(3));
    }
}


// Create a Vehicle, with mpg, passengers, fuelcap. Create the minivan Vehicle and calculate and show range (mpg * fuelcap).
class VehicleR {
    int passengers;
    int fuelcap;
    int mpg;

    VehicleR(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        int r;
        r = fuelcap * mpg;
        return r;
    }

    void rangeP() {
        System.out.println("Range is " + fuelcap * mpg);
    }

    double fuelNeeded(double miles) {
        return miles / mpg;
    }

}

class VehicleFactory {
    public static void main(String[] args) {
        VehicleR minivan = new VehicleR(7, 16, 21);
        VehicleR sportcar = new VehicleR(2, 9, 21);
        var range = 0;
        double miles = 252;

//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
//
//        sportcar.passengers = 2;
//        sportcar.fuelcap = 9;
//        sportcar.mpg = 12;

        range = minivan.range();
        System.out.printf("The Minivan can drive %s for a distance of %s.", minivan.passengers, range);
        System.out.println();
        minivan.rangeP();

        range = sportcar.range();
        System.out.printf("The Sportscar can drive %s for a distance of %s.", sportcar.passengers, range);
        System.out.println();
        sportcar.rangeP();

        System.out.printf("To drive %s miles the sport car needs %s gallons.", miles, sportcar.fuelNeeded(miles));
    }
}



//
class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        double b = base;
        b = b; // or this.b = b;
        e = exp;

        val = 1;
        if(exp == 0) return;
        for( ; exp > 0; exp--) val = val * b;
    }

    double getVal() {
        return this.val;
    }
}

class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7,0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.getVal());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getVal());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.getVal());
    }
}


class MyClass {
    private int[] a;

    private int alpha;
    int beta;
    int gamma;

    public MyClass(int size, int errv) {

    }

    private void setAlpha(int a) {
        alpha = a;
        int z;
        beta = a;
    }

    int getAlpha() {
        setAlpha(10);
    }

}


class Example {
    public static void main(String[] args) {
        MyClass ob = new MyClass(5, 2);

        int z;

        z = ob.a.length;

        ob.gamma = 4;
        ob.setAlpha();

        var b = new int[2];
        var a = b;

        System.out.println(args.length);

        var var = 1;
        var k = -var;
    }
}



// Compare block objects.
class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Block ob) {
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    boolean sameVolume(Block ob) {
        if(ob.volume == volume) return true;
        else return false;
    }
}

class BlockDemo {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(3, 6, 9);
        Block ob4 = new Block(9, 6, 3);

        System.out.println(ob1.sameBlock(ob2));
        System.out.println(ob1.sameBlock(ob3));
        System.out.println(ob3.sameVolume(ob4));


    }
}


class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void Change(Test mv) {
        mv.a = a + b;
        mv.b = -b;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        Test ob1 = new Test(5, 2);
        int x = 15, y = 20;
        System.out.println(ob1.a + " " + ob1.b);

        ob1.Change(ob1);
        System.out.println(ob1.a + " " + ob1.b);



    }
}


// Return a programmer-defined object.
class Err {
    String msg;
    int severity;

    Err(String m, int a) {
        msg = m;
        severity = a;
    }
}

class ErrorInfo{
    String[] msgs = {
            "Output error",
            "Input error",
            "Disk full",
            "Index out-of-bounds"
    };
    int[] howBad = {3, 3, 5, 4};

    Err getErrorInfo(int i) {
        if(i >= 0 & i < msgs.length)
            return new Err(msgs[i], howBad[i]);
        else
            return new Err("Invalid code", 0);
    }
}

class ErrInfo{
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e, e2;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " " + e.severity);

        e2 = err.getErrorInfo(19);
        System.out.println(e2.msg + " " + e2.severity);
    }
}

 */

// Initialize one object with another.
class Summation {
    int sum;

    // Construct from int.
    Summation(int num) {
        sum = 0;
        for(int i=1; i <= num; i++)
            sum += i;
    }

    // Construct from another object.
    Summation(Summation ob) {
        sum = ob.sum * 2;
    }
}

class SumDemo {
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println(s1.sum);
        System.out.println(s2.sum);
    }
}