package rentcompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    public static final String NAME_TO_QUANTITY_SEPARATOR = " : ";
    public static final String LITER_UNIT = "리터";
    public static final String NEWLINE = "\n";

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
        return car.getName()
                + NAME_TO_QUANTITY_SEPARATOR
                + (int) car.getChargeQuantity()
                + LITER_UNIT
                + NEWLINE;
    }
}
