package driver;

import exception.DukeException;
import exception.incompleteInputException;
import command.Command;
import command.ListCommand;
import command.DoneCommand;
import command.DeleteCommand;
import command.AddCommand;

/**
 *
 */

public class Parser {

    /**
     *
     */

    public Command parse(String userInput) throws DukeException, incompleteInputException {
                 if (userInput.equalsIgnoreCase("list")) {
                    return new ListCommand();
                } else if (userInput.contains("done")) {
                    String[] numTasks = userInput.split(" ");
                    String numberAsString = numTasks[1];
                    int number = Integer.parseInt(numberAsString);
                    return new DoneCommand(number-1);
                } else if (userInput.contains("delete")) {
                    String[] numTasks = userInput.split(" ");
                    String numberAsString = numTasks[1];
                    int number = Integer.parseInt(numberAsString);
                    return new DeleteCommand(number-1);
                } else {
                     if((userInput.contains("todo")&&(userInput.length()>5))||
                             (userInput.contains("deadline")&&(userInput.length()>9)&&userInput.contains("/")) ||
                             (userInput.contains("event")&&(userInput.length()>6)&&userInput.contains("/"))) {
                            return new AddCommand(userInput);
                     } else if(userInput.contains("todo")) {
                         throw new incompleteInputException("\u2639 OOPS!!! The description of a todo cannot be empty.");
                     } else if(userInput.contains("deadline")&&(!(userInput.contains("/")))) {
                         throw new incompleteInputException("\u2639 OOPS!!! The description of a deadline cannot be empty.");
                     } else if (userInput.contains("event")&&(!(userInput.contains("/")))) {
                         throw new incompleteInputException("\u2639 OOPS!!! The description of an event cannot be empty.");
                     } else {
                         throw new DukeException();
                     }

        }
    }
}

