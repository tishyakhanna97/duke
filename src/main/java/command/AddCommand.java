package command;

import task.Task;
import task.TaskList;

/**
 *<h1> AddCommand</h1>
 * The AddCommand class
 * 1) Instructs the relevant TaskList to add a new task
 * 2) Instructs the Textformatter to return a message for the user
 *
 */

public class AddCommand extends Command {
    String addedTask;
    Task added;

    /**
     * Constructor for AddCommand Object
     * Stores new task as <param>added</param>
     *
     * @param x String new task in String formate
     */

    public AddCommand(String x) {
        addedTask = x;
    }

    /**
     * Adds new task to tasklist using addTasks and formats add String
     *
     * @param reference is the tasklist being used by the program
     * @return String the formatted output, after running through formatOutput()
     */

    @Override
    public String executeCommand(TaskList reference) {
        this.reference = reference;
        added = reference.addTasks(addedTask);
        return this.formatOutput();
    }

    /**
     * Returns the formatted command as a formatted string
     *
     *@return String formatted
     */

    public String formatOutput() {
        return TextFormatter.addFormat(added,reference.getSize());
    }

}



