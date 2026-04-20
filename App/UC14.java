class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }
}

public class UC14 {
    public static void main(String[] args) {
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Bogie: " + b1.name + " | Capacity: " + b1.capacity);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Bogie: " + b2.name + " | Capacity: " + b2.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}