/*
    Try this 4-1

    Convert the help system from Try this 3-3 into a Help Class.


class Help {
    void helpOn(int what) {
        switch(what) {
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
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("\nHelp on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Choose one (q to quit): ");
    }

    boolean isValid(int choice) {
        if(choice < '1' | choice > '7' & choice != 'q') return false;
        else return true;
    }
}

public class HelpClassDemo{
    public static void main(String[] args)
        throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for(;;) {
            do {
                hlpobj.showMenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while ( !hlpobj.isValid(choice) );

            if(choice == 'q') break;

            System.out.println("\n");

            hlpobj.helpOn(choice);
        }
    }
}











/*

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
*/


// Put the Help System from Try this 3-3 in a Help class.
class Help {
    char what;

    void helpOn() {
//        what = c;
        switch (what) {
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
        }
    }

    void showMenu() {
        System.out.println("\nHelp on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Choose one (q to quit): ");
//        System.out.println("\n");
    }

    char isValid()
            throws java.io.IOException {
        char ignore;

        do {
            what = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (what < '1' | what > '7' & what != 'q');

        return what;
        }
}

class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        Help ob = new Help();
        char choose;

        do {
            ob.showMenu();
            choose = ob.isValid();
            ob.helpOn();
        } while (choose != 'q');

    }
}