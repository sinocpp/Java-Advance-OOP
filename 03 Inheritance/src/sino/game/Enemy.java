package sino.game;

import sino.unit.DynamicObject;
import sino.unit.location.Location;
import sino.unit.location.Speed;

public class Enemy extends DynamicObject {
    private String name = "";
    private Integer strength = 0;
    private double health = 0;


    public Enemy(Location location, String imageSprite, Speed speed) {
        super(location, imageSprite, speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Speed getSpeed() {
        return super.getSpeed();
    }

    public double getHealth() {
        return health;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

}
