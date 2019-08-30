package Command.command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements ICommand {
    private Stack commands = new Stack();

    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((ICommand) it.next()).execute();
        }
    }

    public void append(ICommand cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
