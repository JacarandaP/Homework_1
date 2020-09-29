/**
 * Created by Jacaranda Perez
 * Date: 2020-09-29
 * Project: Homework_1
 */

public class Snake extends Pet implements FoodCalculator {
    private final TypeOfFood typeOfFood;
    private final int amountOfFood = 20;
    private int weight;

    public Snake(String petName, int weight) {
        super(petName);
        this.weight = weight;
        typeOfFood = TypeOfFood.SNAKE;
    }
    @Override
    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    @Override
    public int calculateAmountFood() {
        return amountOfFood;
    }
}
