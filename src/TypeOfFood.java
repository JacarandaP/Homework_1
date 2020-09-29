/**
 * Created by Jacaranda Perez
 * Date: 2020-09-29
 * Project: Homework_1
 */

public enum TypeOfFood {

    CAT("cat food"), DOG("dog food"), SNAKE("pallets");

    private final String food;

    TypeOfFood(String food){
        this.food = food;
    }

    public String getFood(){
        return food;
    }
}
