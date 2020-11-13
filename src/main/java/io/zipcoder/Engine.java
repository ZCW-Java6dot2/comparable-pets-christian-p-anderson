package io.zipcoder;

import java.util.*;

public class Engine {

    private int totalPets = 0;
    private String petName = "";
    private ArrayList<Pet> petInfo = new ArrayList<>();

    public void runEngine() {
        // create scanner for inputs
        Scanner scanner = new Scanner(System.in);

        // get the number of pets
        System.out.print("Welcome to the pet show!\n" + "How many pets do you have?\n");

        totalPets = scanner.nextInt();

        if (totalPets > 0) {

            for (int i = 0; i < totalPets; i++) {

                System.out.print("What kind of pet do you have?\n\n");

                System.out.print(" 1: Dog\n 2: Cat\n 3: Quokka\n Please make a selection: \n");
                int petType = scanner.nextInt();


                switch(petType) {
                    case 1:
                        System.out.print("What's your dog's name?\n");
                        petName = scanner.next();
                        scanner.nextLine();
                        Dog dog = new Dog(petName);
                        this.petInfo.add(dog);
                        break;

                    case 2:
                        System.out.print("What's your cat's name?\n");
                        petName = scanner.next();
                        scanner.nextLine();
                        Cat cat = new Cat(petName);
                        this.petInfo.add(cat);
                        break;

                    case 3:
                        System.out.print("What's your quokka's name?\n");
                        petName = scanner.next();
                        scanner.nextLine();
                        Quokka quokka = new Quokka(petName);
                        this.petInfo.add(quokka);
                        break;

                    default:
                        System.out.print("Sorry, we aren't tracking that kind of pet. Please select again \n");
                        break;
                }

            }


        }
        for (Pet pet : this.petInfo) {
            System.out.println(pet.getName() + " says " + pet.speak());


        }

        // this calls comparable compareTo that overrides sort
        Collections.sort(petInfo);
        for (Pet obj : petInfo) {
            System.out.println("Pet " + obj.getName() + " " + obj.speak());
        }

        // this calls comparator that sorts by object and then object field name

        Collections.sort(petInfo, Pet.petTypeComparator);
        for (Pet obj : petInfo) {
            System.out.println("I am a " + obj.getClass().getSimpleName());
        }

    }

}

