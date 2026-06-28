
public class vehicle {

    private String vehicleId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String driverName;
    private String driverPhone;
    private int capacity;
    private VehicleStatus status;

    // Default Constructor
    public vehicle() {
    }

    // Parameterized Constructor
    public vehicle(String vehicleId, String vehicleNumber, VehicleType vehicleType,
                   String driverName, String driverPhone,
                   int capacity, VehicleStatus status) {

        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.driverPhone = driverPhone;
        this.capacity = capacity;
        this.status = status;
    }

    // Getters and Setters

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "\nVehicle ID      : " + vehicleId +
                "\nVehicle Number  : " + vehicleNumber +
                "\nVehicle Type    : " + vehicleType +
                "\nDriver Name     : " + driverName +
                "\nDriver Phone    : " + driverPhone +
                "\nCapacity        : " + capacity +
                "\nStatus          : " + status ;
    }
}