import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PetHotelDemo {


        private List<Pet> allPets = new ArrayList<>();

        public void createPets() {
            Cat venus = new Cat("Venus", 5);
            Cat ove = new Cat("Ove", 3);

            Dog sixten = new Dog("Sixten", 5);
            Dog dogge = new Dog("Dogge", 10);

            Snake hypno = new Snake("Hypno", 1);


            allPets.add(venus);
            allPets.add(ove);
            allPets.add(sixten);
            allPets.add(dogge);
            allPets.add(hypno);

        }

        public Pet getPetFromUser() {

            while (true) {
                String inputName = JOptionPane.showInputDialog("Which pet is to be fed?");

                if (inputName == null)
                    System.exit(0);
                Pet foundPet = findPet(inputName);
                if (foundPet != null)
                    return foundPet;
                else
                    JOptionPane.showMessageDialog(null, "Pet not registered in the hotel. Try again");
            }

        }

        public Pet findPet(String inputName) {
            for (Pet pet : allPets) {
                if (pet.getPetName().equalsIgnoreCase(inputName))
                    return pet;
            }
            return null;
        }

        public static void main(String[] args) {

            PetHotelDemo petHotelDemo = new PetHotelDemo();
            petHotelDemo.createPets();
            Pet hostPet = petHotelDemo.getPetFromUser();
            JOptionPane.showMessageDialog(null, "Amount of food for " +
                    hostPet.getPetName() + " is " + hostPet.calculateAmountFood() + "gr of " +
                    hostPet.getTypeOfFood().getFood()); //Use of polymorphism and enums here.
        }

}
