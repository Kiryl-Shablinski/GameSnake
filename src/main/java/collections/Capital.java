package collections;

public class Capital {
    private String name;

    public Capital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Capital{" +
                "name='" + name + '\'' +
                '}';
    }
}
