package Command.undoDemo;

public class ConcreteCommand implements AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
