package sino.unit;

import sino.unit.Object;
import sino.unit.location.Location;

public class StaticObject extends Object {
    private String name;

    public StaticObject(Location location, String spriteImage, String name) {
        // this is a call for constructor of class Object
        super(location, spriteImage, "");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
