import java.util.Scanner;

public class Duke {
    //Function spacer takes input string and converts it tabbed format
    // Next, print with the appropriate lines and indentation
    protected static void spacer(String input) {
        String separator = "    ____________________________________________________________";
        String converted = "    " + input;
        System.out.println(separator);
        System.out.println(converted);
        System.out.println(separator + "\n");

    }

    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        String start = "Hello! I'm Duke\n    What can I do for you?";
        String end = "Bye. Hope to see you again soon!";

        //Print my welcome message
        spacer(start);

        Scanner myInputReader = new Scanner(System.in);
        String userInput = myInputReader.nextLine();


        while (!userInput.equalsIgnoreCase("bye")) {
            spacer(userInput);
            userInput = myInputReader.nextLine();
            }
        //Print my ending message
        spacer(end);

    }

    }

