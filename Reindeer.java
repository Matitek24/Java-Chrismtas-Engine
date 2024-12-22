package subfolder;

public class Reindeer {
    String name;
    boolean health;

    public Reindeer(String name, boolean health) {
        this.name = name;
        this.health = health;
    }

    public Reindeer(String name) {
        this.name = name;
        this.health = true;
    }
    public String getName() {
        return name;
    }

    public boolean isHealth() {
        return health;
    }

    @Override
    public String toString() {
        return " Reindeer [name=" + name + ", health=" + health + "]";
    }
}
