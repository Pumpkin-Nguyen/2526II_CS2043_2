public class MacFactory implements UIFactory {
    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public MacCheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
