// Display all command-line information.
public class CLDemo {
    public static void main(String[] args) {
        System.out.printf("There are %s command-line arguments.\n", args.length);

        System.out.println("They are: ");
        for(int i=0; i < args.length; i++) System.out.printf("arg[%s]: %s ", i, args[i]);

    }
}

