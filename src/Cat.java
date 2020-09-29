/**
 * Created by Jacaranda Perez
 * Date: 2020-09-29
 * Project: Homework_1
 */

public class Cat extends Pet implements FoodCalculator {
    private final TypeOfFood typeOfFood;
    private int amountOfFood;
    private int weight;

    public Cat(String petName, int weight) {
        super(petName);
        this.weight = weight;
        typeOfFood = TypeOfFood.CAT;

    }

    @Override
    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public int calculateAmountFood() {
        amountOfFood = weight * 1000 / 150;
        return amountOfFood;
    }
}

