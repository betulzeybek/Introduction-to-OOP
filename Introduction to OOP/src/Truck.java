public class Truck extends Vehicle {   // extends for inheritance 
    private double capacity;   //Veriable

    public Truck (){    //Parameterless constructor
        super();
    }

    public Truck (String brand, int cylinder, Person owner, double capacity){  //Constructor
        super(brand, cylinder, owner);
        this.capacity = capacity;
    }

    public Truck (Truck other){   // Copy Constructor
        super(other);
        capacity = other.capacity;

    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString(){    // toString method for print
        return super.toString() + '\n' + "Load capacity of the truck: " + capacity;
    }

    @Override
    public boolean equals(Object other){  // equals method for copy and compare
        if (other == null) {
            return false;
        }
        else if (this.getClass() != other.getClass()){
            return false;
        }
        else {
            Truck truck = (Truck) other;
            return (this.getBrand().equals(truck.getBrand()))
                    && (this.getCylinder() == truck.getCylinder())
                    && (this.getOwner().equals(truck.getOwner()))
                    && (this.getCapacity() == truck.getCapacity());
        }
    }
}
