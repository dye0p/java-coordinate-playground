package rentcompany;

public class Avante extends AbstractCar {

    private static final String CAR_NAME = "Avante";
    public static final int DISTANCE_PER_LITER = 15;

    public Avante(int tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return CAR_NAME;
    }
}
