package com.keyon.design.command;

public class CutCommand extends Command {

    public CutCommand(Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    boolean execute() {
        if (editor.getSelectionWidth() <= 0) {
            return false;
        }
        saveBackup();
        String selectedText = editor.getSelection();
        editor.replaceSelection("");
        application.setClipboard(selectedText);
        return true;
    }
}
