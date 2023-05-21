package com.keyon.design.command;

public abstract class Command {

    protected Application application;
    protected Editor editor;
    protected String backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    /**
     * 备份编辑器状态
     */
    public void saveBackup() {
        this.backup = this.editor.getText();
    }

    /**
     * 恢复编辑器状态
     */
    public void undo() {
        this.editor.setText(this.backup);
    }

    /**
     * 执行命令，返回执行命令是否更改了编辑器状态
     * @return
     */
    abstract boolean execute();
}
