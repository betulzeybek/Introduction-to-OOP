public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Betül Zeybek");   // Object created from Person class
        Truck truck1 = new Truck("Mercedes", 12, person1 ,1000);   // Object created from Truck class

        Truck truck2 = new Truck(truck1);  // Creating a copy object with the copy constructor

        System.out.println("------TRUCK Informations------");
        System.out.println("Truck1: " + '\n'+ truck1 + '\n');
        System.out.println("Truck2 copy of truck1: " + '\n' + truck2 + '\n');
        System.out.println("Is truck2 equal to truck1: " +
                truck1.equals(truck2));    // Equality of objects is demonstrated by the equals method
    }
}
