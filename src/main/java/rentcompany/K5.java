package rentcompany;

public class K5 extends Car {
    private static final String CAR_NAME = "K5";
    public static final int DISTANCE_PER_LITER = 13;

    private final int tripDistance;
    private final int distancePerLiter;
    private final String name;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = DISTANCE_PER_LITER;
        this.name = CAR_NAME;
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return this.name;
    }
}
