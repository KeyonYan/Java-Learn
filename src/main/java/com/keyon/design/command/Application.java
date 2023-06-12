package com.keyon.design.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Application {

    private String clipboard;
    private Editor editor;
    private CommandHistory history;

    public void createUI() {
        this.editor = new Editor();
        this.history = new CommandHistory();
    }

    public void executeCommand(Command c) {
        if (c.execute()) {
            history.push(c);
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createUI();
        application.editor.setText("123456789");
        application.editor.setSelectedPos(new Editor.Pair<>(3,6));
        System.out.println("editor text: " + application.getEditor().getText());

        application.executeCommand(new CopyCommand(application, application.getEditor()));
        System.out.println("clipboard: " + application.getClipboard()); // clipboard: 456

        application.editor.setSelectedPos(new Editor.Pair<>(9,9));
        application.executeCommand(new PasteCommand(application, application.getEditor()));
        System.out.println("editor text: " + application.getEditor().getText()); // editor text: 123456789456
        application.history.iteratorHistory(); // [

        application.executeCommand(new UndoCommand(application, application.getEditor()));
        System.out.println("editor text: " + application.getEditor().getText()); // editor text: 123456789
        application.history.iteratorHistory(); // [

        application.editor.setSelectedPos(new Editor.Pair<>(3,6));
        application.executeCommand(new CutCommand(application, application.getEditor()));
        System.out.println("clipboard: " + application.getClipboard()); // clipboard: 456
        System.out.println("editor text: " + application.getEditor().getText()); // editor text: 123789
        application.history.iteratorHistory(); // [ CutCommand

    }
}
