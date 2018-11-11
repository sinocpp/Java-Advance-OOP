package sino.unit.location;

public class Location {
    private Distance x, y;

    public Location(Distance x, Distance y) {
        this.x = x;
        this.y = y;
    }

    public Distance getX() {
        return x;
    }

    public Distance getY() {
        return y;
    }
}
