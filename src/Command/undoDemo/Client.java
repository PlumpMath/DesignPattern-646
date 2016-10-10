package Command.undoDemo;

public class Client {
    public static void main(String[] args) {
        CalculateForm form = new CalculateForm();
        ConcreteCommand command = new ConcreteCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.undo();
    }
}
