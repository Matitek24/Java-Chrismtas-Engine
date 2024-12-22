package subfolder;

public class Gift {
    private String description;
    private int weight;

    public Gift(String description, int weight) {
        this.description = description;
        this.weight = weight;
    }

    public String getDescription() {
        return this.description;
    }
    public int getWeight() {
        return this.weight;
    }
    @Override
    public String toString() {
        return " Gift " + description + ", weight = " + weight;
    }
}
