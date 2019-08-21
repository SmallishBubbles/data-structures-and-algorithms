package stacksandqueues.utilities;

public class Cat implements Animal {
    String name;
    String breed;
    String color;

    public Cat(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
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

    public void setName(String newName) {
        this.name = newName;
    }

    public String makeNoise() {
        return "meow";
    }

    public String toString() {
        return String.format("%s, a %s %s cat", this.name, this.color, this.breed);
    }
}
