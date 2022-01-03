package pattern.generative.factory.example.factory;

import pattern.generative.factory.example.buttons.Button;
import pattern.generative.factory.example.buttons.HtmlButton;
import pattern.generative.factory.example.factory.Dialog;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
