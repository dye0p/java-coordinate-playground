package rentcompany;

public abstract class AbstractCar implements Car {

    private final double tripDistance;
    private final double distancePerLiter;

    protected AbstractCar(double tripDistance, double distancePerLiter) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = distancePerLiter;
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance / distancePerLiter;
    }
}
