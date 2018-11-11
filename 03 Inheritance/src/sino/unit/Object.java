package sino.unit;

import sino.unit.location.Distance;
import sino.unit.location.Location;

//
public abstract class Object {
    private Location location;
    private String sprite;
    private String name;

    public Object(Location location, String spriteImage, String name) {
        this.location = location;
        this.sprite = spriteImage;
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public String getSprite() {
        return sprite;
    }

    public String getName() {
        return name;
    }
}
