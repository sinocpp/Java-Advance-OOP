package sino.unit;

import sino.unit.location.Distance;
import sino.unit.location.Location;

//
public abstract class Object {
    private Location location;
    private String sprite;

    public Object(Location location, String spriteImage) {
        this.location = location;
        this.sprite = spriteImage;
    }

    public Location getLocation() {
        return location;
    }

    public String getSprite() {
        return sprite;
    }

}
