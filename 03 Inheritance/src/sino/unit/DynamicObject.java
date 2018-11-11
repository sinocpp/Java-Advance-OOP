package sino.unit;

import sino.unit.Object;
import sino.unit.location.Location;
import sino.unit.location.Speed;

public abstract class DynamicObject extends Object {
    private Speed speed;

    public DynamicObject(Location location, String imageSprite, Speed speed) {
        super(location, imageSprite, "");
        this.speed = speed;
    }

    public Speed getSpeed() {
        return speed;
    }
}
