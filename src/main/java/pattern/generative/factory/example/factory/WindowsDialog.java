package pattern.generative.factory.example.factory;

import pattern.generative.factory.example.buttons.Button;
import pattern.generative.factory.example.buttons.WindowsButton;
import pattern.generative.factory.example.factory.Dialog;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
