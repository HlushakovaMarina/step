package L20_03_2025.ElevatorModel;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(3);

        elevator.enter("Иван");
        elevator.enter("Мария");
        elevator.enter("Андрей");
        elevator.enter("Ольга");

        elevator.peekNextToExit();
        elevator.exit();
        elevator.exit();
        System.out.println(elevator.getCurrentPassengers() + " человек(а) осталось в лифте.");
        elevator.exit();
        elevator.exit();
    }
}
