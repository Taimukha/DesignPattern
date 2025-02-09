public class CelestialBody {
    private String name;
    private double coordinateX;
    private double coordinateY;

    public CelestialBody(String name, double x, double y) {
        this.name = name;
        this.coordinateX = x;
        this.coordinateY = y;
    }

    public double distanceTo(CelestialBody other) {
        return Math.sqrt(Math.pow(this.coordinateX - other.coordinateX, 2) +
                Math.pow(this.coordinateY - other.coordinateY, 2));
    }

    public String getName() {
        return name;
    }
}