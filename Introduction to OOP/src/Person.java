public class Person {
    private String name; // Veriable

    public Person (){         //Parameterless constructor
       this.name = null;
    }

    public Person(String name){   //Constructor
        this.name = name;
    }

    public Person(Person p){  //Copy Constructor
        this.name = p.name;
    }

    public String getName() {   
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){  // toString method for printing
        return name ;
    }

    @Override
    public boolean equals(Object other) {  // equals method for comparising
        if (other == null) {
            return false;
        }
        else if (this.getClass() != other.getClass()){
            return false;
        }
        else {
            Person person = (Person) other;
            return (this.getName().equals(person.getName()));
        }
    }
}

