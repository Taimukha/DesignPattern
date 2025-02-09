public class mainn {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 0, 0);
        SpaceStation iss = new SpaceStation("ISS", 100, 200);

        LightDrone drone1 = new LightDrone("LD-001");
        HeavyDrone drone2 = new HeavyDrone("HD-001");

        Cargo cargo = new Cargo(3git0, "Medical Supplies");
        DeliveryTask task = new DeliveryTask(earth, iss, cargo);

        if (task.assignDrone(drone1)) {
            System.out.println("Дрон успешно.");
        } else {
            System.out.println("не удалось дрон.");
        }

        task.completeDelivery();
    }
}
