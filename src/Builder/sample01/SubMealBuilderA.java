package Builder.sample01;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("香辣鸡排");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可口可乐");
    }
}
