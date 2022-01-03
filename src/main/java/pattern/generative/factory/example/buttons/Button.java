package pattern.generative.factory.example.buttons;

/**
 * Общий интерфейс для всех продуктов.
 */
public interface Button {
    void render();
    void onClick();
}