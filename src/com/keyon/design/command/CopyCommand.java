package com.keyon.design.command;

public class CopyCommand extends Command {

    public CopyCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        application.setClipboard(editor.getSelection());
        return false;
    }
}
