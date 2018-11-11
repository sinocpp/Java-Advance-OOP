package sino.game.enemies;

import sino.game.Enemy;
import sino.unit.location.Location;
import sino.unit.location.Speed;

public class Wolf extends Enemy {
    private String colour;

    public Wolf(Location location, String imageSprite, Speed speed) {
        super(location, imageSprite, speed);
    }


    @Override
    public Speed getSpeed() {
        return super.getSpeed();
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
