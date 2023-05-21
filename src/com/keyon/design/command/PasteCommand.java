package com.keyon.design.command;

public class PasteCommand extends Command {

    public PasteCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        if (application.getClipboard() == null || application.getClipboard().isEmpty()) {
            return false;
        }
        saveBackup();
        editor.replaceSelection(application.getClipboard());
        return true;
    }
}
