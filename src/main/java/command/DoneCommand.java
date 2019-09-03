package command;
import task.Task;
import task.TaskList;
import driver.Ui;

/**
 *
 */

public class DoneCommand extends Command {
    int doneIndex;
    Task done;

    /**
     *
     */

    public DoneCommand(int number) {
        doneIndex = number;
    }

    /**
     *
     */

    @Override
    public void executeCommand(TaskList reference, Ui printer) {
        this.reference = reference;
        this.printer = printer;
        done = reference.taskDone(doneIndex);
        this.passToUI(this.formatOutput());
    }

    /**
     *
     */

    public String formatOutput() {

        return textFormatter.doneFormat(done);
    }

    /**
     *
     */

    public void passToUI(String input) {

        printer.printDone(input);
    }
}

