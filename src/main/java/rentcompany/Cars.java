package rentcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    public static final String NAME_TO_QUANTITY_SEPARATOR = " : ";
    public static final String LITER_UNIT = "리터";
    public static final String NEWLINE = System.lineSeparator();

    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }

    public String calculateChargeQuantity() {
        return cars.stream()
                .map(this::createResultString)
                .collect(Collectors.joining());
    }

    private String createResultString(Car car) {
        return formatResult(car.getName(), getChargeQuantityAsInt(car));
    }

    private String formatResult(String carName, int chargeQuantity) {
        return carName
                + NAME_TO_QUANTITY_SEPARATOR
                + chargeQuantity
                + LITER_UNIT
                + NEWLINE;
    }

    private int getChargeQuantityAsInt(Car car) {
        return (int) car.getChargeQuantity();
    }
}
