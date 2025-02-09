



class Drone {
    private String id;
    private String status;
    private double cargoCapacity;
    private double currentCargoWeight;

    public Drone(String id, double cargoCapacity) {
        this.id = id;
        this.status = "IDLE";
        this.cargoCapacity = cargoCapacity;
        this.currentCargoWeight = 0;
    }

    public boolean loadCargo(double weight) {
        if (currentCargoWeight + weight <= cargoCapacity) {
            currentCargoWeight += weight;
            return true;
        }
        return false;
    }

    public void unloadCargo() {
        currentCargoWeight = 0;
        status = "IDLE";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getCurrentCargoWeight() {
        return currentCargoWeight;
    }
}
