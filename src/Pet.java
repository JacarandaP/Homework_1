/**
 * Created by Jacaranda Perez
 * Date: 2020-09-29
 * Project: Homework_1
 */

public abstract class Pet implements FoodCalculator {

    private String petName;
    private int petWeight;

    public Pet() {
    }

    public Pet(String petName) {
        this.petName = petName;
        this.petWeight = petWeight;
    }

    public String setPetName(String s) {
        this.petName = petName;
        return petName;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetWeight() {
        return petWeight;
    }

    public abstract TypeOfFood getTypeOfFood();

}
