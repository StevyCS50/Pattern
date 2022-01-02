package pattern.generative.abstract_factory.example.mac;

import pattern.generative.abstract_factory.example.Button;
import pattern.generative.abstract_factory.example.Checkbox;
import pattern.generative.abstract_factory.example.GUIFactory;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
