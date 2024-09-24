package rentcompany;

public class Avante extends Car {
    private static final String CAR_NAME = "Avante";
    public static final int DISTANCE_PER_LITER = 15;

    private final int tripDistance;
    private final int distancePerLiter;
    private final String name;

    public Avante(int tripDistance) {
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
