package Model;

public class InHouse extends Part {
    private int machineId;

    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
        setId(id);
        setName(name);
        setPrice(price);
        setPrice(stock);
        setMin(min);
        setMax(max);
        setMachineId(machineId);

    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public int getMachineId() {
        return machineId;
    }

}
