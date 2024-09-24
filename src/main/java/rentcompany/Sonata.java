package rentcompany;

public class Sonata extends AbstractCar {

    private static final String CAR_NAME = "Sonata";
    public static final int DISTANCE_PER_LITER = 10;

    public Sonata(double tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return CAR_NAME;
    }
}