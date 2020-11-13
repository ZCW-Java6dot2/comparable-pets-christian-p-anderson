package io.zipcoder;

public class Pet {
    public String name;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this.name = "";
    }

    public String speak() {
        return "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
