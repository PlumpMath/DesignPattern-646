package Command.undoDemo;

public interface AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
