package pattern.generative.abstract_factory.example.win;

import pattern.generative.abstract_factory.example.Button;
import pattern.generative.abstract_factory.example.Checkbox;
import pattern.generative.abstract_factory.example.GUIFactory;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
