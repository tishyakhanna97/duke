package command;

import task.Task;
import java.util.ArrayList;


/**
 * Formats all objects to the appropriate String form.
 */

public class TextFormatter {

    /**
     * Returns the arrayList of tasks as a String.
     *
     * @param input an arraylist of all the tasks
     * @return String of tasks
     */


    static String listFormat(ArrayList<Task> input) {
        String listMessageTitle = "    Here are the " + input.size() + " task(s) in your list:\n";
        StringBuilder myTasks = new StringBuilder();
        for (int i = 0; i < input.size(); i++) {
            String temp = "    " + (i + 1) + ". " + input.get(i) + "\n";
            myTasks.append(temp);
        }
        String tasks = myTasks.toString();
        System.out.println(listMessageTitle + tasks);

        return  listMessageTitle + tasks;
    }

    /**
     * Returns the deleted task and the total tasks left as a String.
     *
     * @param removed Task that has been removed
     * @param size number of remaining tasks
     * @return String of the deleted task
     */

    static String deleteFormat(Task removed, int size) {
        String removingTask = "    Noted. I've removed this task:";
        String converted = "      " + removed;
        String taskTracking = "    Now you have " + size + " tasks in the list.";
        String answer = "\n" + removingTask + "\n"
            + converted + "\n" + taskTracking + "\n" + "\n";
        System.out.println(answer);
        return answer;
    }

    /**
     * Returns the done task.
     *
     * @param done Task that has been done
     * @return String of done task
     */

    static String doneFormat(Task done) {
        String firstLine = "Nice! I've marked this task as done:\n";
        String secondLine = "      " + done;
        String answer =  firstLine + secondLine;
        String converted = "    " + answer + "\n";
        System.out.println(converted);
        return converted;
    }

    /**
     * Returns the error as a string.
     *
     * @param error Exception that has been thrown
     * @return String of error
     */

    static String errorFormat(Exception error) {
        String err = "    " + error.getMessage();
        System.out.println(err + "\n");
        return err + "\n";
    }

    /**
     * Returns the added task and the total tasks left as a String.
     *
     * @param inputTask Task that has been added
     * @param size number of remaining tasks
     * @return String of the added task
     */
    static String addFormat(Task inputTask, int size) {
        String addingTask = "    Got it. I've added this task:\n";
        String converted = "        " + inputTask.toString() + "\n";
        String taskTracking = "    Now you have " + size + " tasks in the list.\n";
        System.out.println(addingTask + converted + taskTracking);
        return  addingTask + converted + taskTracking;
    }

    /**
     * Returns the exit message as a String.
     *
     * @return String saying bye
     */

    static String byeFormat() {
        String end = "Bye. Hope to see you again soon!";
        String converted = "    " + end + "\n";
        System.out.println(converted);
        return converted;
    }

    /**
     * Returns the hello message as a String.
     *
     * @return String saying hello
     */
    static String helloFormat() {
        String start = "Hello! I'm Duke\n    What can I do for you?";
        String converted = "    " + start + "\n";
        String help = "    Type help to find out how to use DUKE\n";
        String warning = "    REMEMBER TO TYPE BYE TO QUIT. ELSE, YOUR DATA WILL NOT BE SAVED!! \n";
        System.out.println(converted);
        return  converted + help + warning;
    }

    /**
     * Returns the arrayList of matched tasks as a String of the list.
     *
     * @param input an arraylist of all the tasks that match the search String
     * @return String of searched tasks
     */

    static String searchFormat(ArrayList<Task> input) {
        String listMessageTitle = "    Here are the matching tasks in your list:\n";
        StringBuilder myTasks = new StringBuilder();
        for (int i = 0; i < input.size(); i++) {
            String temp = "    " + (i + 1) + "." + input.get(i) + "\n";
            myTasks.append(temp);
        }
        String tasks = myTasks.toString();
        System.out.println(listMessageTitle + tasks);
        if(input.size() == 0) {
            return "    NOTHING MATCHED\n";
        }
        return listMessageTitle + tasks;
    }

    /**
     * Returns an array of the statistics as a String.
     *
     * @param stats an array of the collated number of different types of tasks
     * @return String of statistics
     */
    static String statsFormat(int[] stats) {
        StringBuilder myTasks = new StringBuilder();
        myTasks.append("Total Tasks: " + stats[0] + "\n");
        myTasks.append("Total Tasks Done : " + stats[1] + "\n");
        myTasks.append("Total ToDo Tasks: " + stats[2] + "\n");
        myTasks.append("Total ToDo Tasks Done: " + stats[3] + "\n");
        myTasks.append("Total Deadline Tasks: " + stats[4] + "\n");
        myTasks.append("Total Deadline Tasks Done: " + stats[5] + "\n");
        myTasks.append("Total Event Tasks: " + stats[6] + "\n");
        myTasks.append("Total Event Tasks Done: " + stats[7] + "\n");

        String statsMessageTitle = "    Here are your statistics: \n";
        String statsString = myTasks.toString();
        System.out.println(statsMessageTitle + statsString);

        return statsMessageTitle + statsString;
    }

    /**
     * Returns String representation of refresh command.
     *
     * @return String that everything is gone
     */

    static String refreshFormat() {
        String deleteMessageTitle = "    You deleted everything... oops\n";
        String taunt = "     Hope you are feeling refreshed\n";
        System.out.println(deleteMessageTitle + taunt);
        return deleteMessageTitle + taunt;
    }

    /**
     * Returns String representation of help command.
     *
     * @return String of how to use duke
     */

    static String helpFormat() {
        StringBuilder holder = new StringBuilder();
        String helpMessageTitle = "    Wondering how to use Duke?\n";
        String helpMessageGuide = "    Look below, follow the commands and "
                + "replace the text between < and > with your input\n";
        String add = "     First, add tasks\n";
        String todo = "        add todo tasks: todo <myTask>\n";
        String event = "        add event tasks: event <myTask> /from <date1> - <date2>\n";
        String deadline = "        add deadline tasks: deadline <myTask> /by <date>\n";
        String done = "     Second, done tasks: done <index>\n";
        String delete = "     Third, delete tasks: delete <index>\n";
        String stats = "     Fourth, see stats: stats";
        String list = "     Fifth, list tasks: list\n";
        String refresh = "     Fifth, refresh tasks: refresh\n";
        String find = "     Last, find tasks: find <what you are looking for>\n";
        holder.append(helpMessageTitle);
        holder.append(helpMessageGuide);
        holder.append(add);
        holder.append(todo);
        holder.append(event);
        holder.append(deadline);
        holder.append(done);
        holder.append(delete);
        holder.append(stats);
        holder.append(list);
        holder.append(refresh);
        holder.append(find);
        return holder.toString();
    }


}


