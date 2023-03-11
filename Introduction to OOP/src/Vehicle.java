public class Vehicle {
    private String brand;
    private int cylinder;   // Veriables
    private Person owner;

    public Vehicle(){    //Parameterless constructor

    }

    public Vehicle(String brand, int cylinder, Person owner){    //Constructor
        this.brand = brand;
        this.cylinder = cylinder;
        this.owner = new Person(owner); 
    }

    public Vehicle(Vehicle ve){  // Copy Constructor
        brand = ve.brand;
        cylinder = ve.cylinder;
        owner = ve.owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public Person getOwner() {
        this.owner = new Person(owner);
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {  // toString method for printing
        return "Vehicle brand: " + brand + '\n' +
                "Number of cylinders of the engine: " + cylinder + '\n' +
                "Owner of the vehicle: " + owner ;
    }

    @Override
    public boolean equals(Object other){   // equals method for comparising
        if (other == null) {
            return false;
        }
        else if (this.getClass() != other.getClass()){
            return false;
        }
        else {
            Vehicle vehicle  = (Vehicle) other;
            return (this.getBrand().equals(vehicle.getBrand()))
                    && (this.getCylinder() == vehicle.getCylinder())
                    && (this.getOwner().equals(vehicle.getOwner()));
        }
    }

}
