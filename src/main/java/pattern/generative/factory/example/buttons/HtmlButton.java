package pattern.generative.factory.example.buttons;

import pattern.generative.factory.example.buttons.Button;

/**
 * Реализация HTML кнопок.
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}