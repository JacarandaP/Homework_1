/**
 * Created by Jacaranda Perez
 * Date: 2020-09-29
 * Project: Homework_1
 */

public abstract class Pet implements FoodCalculator {
    //Encapsulating example (seen in the other classes as well)
    private String petName;
    private int weight;

    public Pet() {
    }

    public Pet(String petName) {
        this.petName = petName;

    }

    public void setPetName(String petName) {
        this.petName = petName;

    }

    public String getPetName() {
        return petName;
    }


    public abstract TypeOfFood getTypeOfFood();

}
