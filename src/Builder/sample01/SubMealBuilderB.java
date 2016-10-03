package Builder.sample01;

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("美味汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("芒果冰沙");
    }
}
