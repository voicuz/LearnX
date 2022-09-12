/*

// Demonstrate exception handling.
class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // Generate an index-out-bound exception.
            nums[0] = 10;
            System.out.println("this won't be displayed.");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bound.");
        }
        System.out.println("After catch statement.");
    }
}



// An exception can be generated by one method and caught by another.
class ExcTest {
    // Generate an exception.
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        // Generate an index-out-bound exception.
        nums[7] = 10;
        System.out.println("this won't be displayed.");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bound.");
        }
        System.out.println("After catch statement.");
    }
}




class NotHandled {
    public static void main(String[] args) {
        int[] nums = new int[4];


            nums[7] = 10;
            System.out.println("this won't be displayed.");
    }
}



class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // Generate an index-out-bound exception.
            nums[7] = 10;
            System.out.println("this won't be displayed.");
        }

        // Can't catch an array boundary error with an ArithmeticException.
        catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Index out-of-bound.");
            System.out.println(exc);
        }
        System.out.println("After catch statement.");
    }
}

 */

/*
// Handle error gracefully and continue.
class ExcDemo3 {
    public static void main(String[] args) {
        int[] numer = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", numer[i], denom[i], numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.printf("%d / %d - can't divide by zero\n", numer[i], denom[i]);
            }
        }
    }
}



// Use multiple catch statements.
class ExcDemo4 {
    public static void main(String[] args) {
        // Here numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", numer[i], denom[i], numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                // catch the exception
                System.out.printf("%d / %d - can't divide by zero.\n", numer[i], denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.printf("No matching element found.\n");
            }
        }
    }
}


// Subclasses have to precede superclasses in catch statements
class ExcDemo5 {
    public static void main(String[] args) {
        // Here numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", numer[i], denom[i], numer[i] / denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.printf("No matching element found.\n");
            }
            catch (Throwable exc) {
                // catch the exception
                System.out.printf("Some exception occurred.\n");
            }
        }
    }
}

// Use a nested try block.
class NestTrys {
    public static void main(String[] args) {
        // Here numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        try {  // outer try
            for (int i = 0; i < numer.length; i++) {
                try {  // nested try
                    System.out.printf("%d / %d is %d\n", numer[i], denom[i], numer[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    // catch the exception
                    System.out.printf("%d / %d - can't divide by zero.\n", numer[i], denom[i]);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.printf("No matching element found.\n");
            System.out.println("Fatal error - program terminated.");
        }
    }
}



// Manually throw an exception.
class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        }

        catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught.");
//            System.out.println(exc);
        }
        System.out.println("After try/catch block.");
    }
}

 */

/*
// Rethrow an exception.
class Rethrow {
    public static void getException() {
        // Here numer is longer than denom.
        int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                System.out.printf("%d / %d is %d\n", numer[i], denom[i], numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                // catch the exception
                System.out.printf("%d / %d - can't divide by zero.\n", numer[i], denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.printf("No matching element found.\n");
                throw exc;  // rethrow the exception.
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.getException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // recatch exception
            System.out.println("Fatal error, program terminated.");
        }
    }
}



// Using the Throwable methods.

class ExcTest {
    static void genException() {
        int[] nums = new int[4];

        System.out.println("Before exception is generated.");

        // Generate an index-out-bound exception.
        nums[7] = 10;
        System.out.println("this won't be displayed.");
    }
}

class UseThrowableMethods {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}


// Use finally.
class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what;  // generate divide-by-zero error.
                    break;
                case 1:
                    nums[4] = 4;  // generate array index error.
                    break;
                case 2:
                    return;  // return from try block.
            }
        }

        catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Can't divide by zero.");
            return;  // return from catch.
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("No matching element found.");
        }
        finally {
            System.out.println("Leaving try.");
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}



// Use throws.
class ThrowsDemo {
    public static char prompt(String str)
        throws java.io.IOException {

        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter a letter");
        }
        catch (java.io.IOException exc) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }

        System.out.println("You pressed " + ch);
    }
}



// Use the multi-catch feature.
class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] chars = {'A', 'B', 'C'};

        for(int i=0; i<3; i++) {
            try {
                if(i==0)
                    result = a / b;  // generate an arithmetic exception;
                else
                    chars[5] = 'X';  // generate an ArrayIndexOutOfBoundsException;
            }
            // This catch clause catches both exceptions.
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }

        System.out.println("After multi-catch.");
    }
}



// Use a custom exception.

// Create an exception.
class NonIntResultException extends Exception {
    int n, d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {

        // Here numer contains some odd values.
        int[] numer = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] denom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++) {
            try {
                if((numer[i]%2) != 0)
                    throw new
                            NonIntResultException(numer[i], denom[i]);

                System.out.printf("%d / %d is %d\n", numer[i], denom[i], numer[i] / denom[i]);
            }
            catch (ArithmeticException exc) {
                // catch the exception
                System.out.printf("%d / %d - can't divide by zero.\n", numer[i], denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.printf("No matching element found.\n");
            }
            catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}

 */
