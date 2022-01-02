package pattern.generative.builder.example.builders;

import pattern.generative.builder.example.cars.CarType;
import pattern.generative.builder.example.components.Engine;
import pattern.generative.builder.example.components.GPSNavigator;
import pattern.generative.builder.example.components.Transmission;
import pattern.generative.builder.example.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
