package rentcompany;

public class K5 extends AbstractCar {

    private static final String CAR_NAME = "K5";
    public static final int DISTANCE_PER_LITER = 13;

    public K5(double tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return CAR_NAME;
    }
}
