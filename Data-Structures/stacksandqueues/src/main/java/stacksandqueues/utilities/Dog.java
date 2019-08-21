package stacksandqueues.utilities;

public class Dog implements Animal {
    String name;
    String breed;
    String color;
    String size;

    public Dog(String name, String breed, String color, String size) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getColor() {
        return this.color;
    }

    public String getSize() {
        return this.size;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String makeNoise() {
        if ( this.size.equals("small") ) {
            return "yip";
        } else if ( this.size.equals("medium") ) {
            return "arf";
        } else if ( this.size.equals("large") ) {
            return "woof";
        } else {
            return "bark";
        }
    }

    public String toString() {
        return String.format("%s, a %s %s %s dog", this.name, this.size, this.color, this.breed);
    }
}
