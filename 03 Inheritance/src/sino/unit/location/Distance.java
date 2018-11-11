package sino.unit.location;

public class Distance {
    private double meters;

    private Distance(double meters) {
        this.meters = meters;
    }

    public static Distance fromMeters(double meters) {
        return new Distance(meters);
    }

    public static Distance fromKilometers(double kilometers) {
        return new Distance(kilometers * 1000);
    }

    public double toMeters() {
        return this.meters;
    }

    public double toKilometers() {
        return  this.meters / 1000.0f;
    }

    public void addMeters(double meters) {
        this.meters += meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public void addKilometers(double kilometers) {
        this.meters += kilometers * 1000.0;
    }
}