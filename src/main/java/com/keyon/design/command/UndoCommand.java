package com.keyon.design.command;

public class UndoCommand extends Command {

    public UndoCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        Command command = application.getHistory().pop();
        if (command != null) {
            command.undo();
        }
        return false;
    }
}
