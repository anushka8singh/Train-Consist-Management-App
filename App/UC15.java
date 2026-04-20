class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully to " + type + " bogie");
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed");
        }
    }
}

public class UC15 {
    public static void main(String[] args) {
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal");
    }
}
