package io.zipcoder;
import java.lang.Comparable;
import java.util.Comparator;


public class Pet implements Comparable<Pet> {
    public String name;

    public Pet(String name) {
        this.name = name;
    }

//    public Pet() {
//        this.name = "";
//    }

    public String speak() {
        return "";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public int compareTo(Pet otherPet) {
        int equality = this.name.compareTo(otherPet.name);

        if (equality != 0) {
            return equality;
        } else {
            return this.getName().compareTo(otherPet.getName());
        }
    }


    // implemented Comparator as an object and not the interface
    // instantiated Comparator object to override the compare method
    public static Comparator<Pet> petTypeComparator = new Comparator<Pet>() {
        @Override
        public int compare(Pet pet1, Pet pet2) {
            int equality = pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());


            if (equality != 0) {
                return equality;
            } else {
                return pet1.getName().compareTo(pet2.getName());
            }
        }

    };
}
