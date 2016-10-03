package Builder.sample01;

public class KFCWaiter {
    private MealBuilder builder;

    public void setMealBuilder(MealBuilder mb) {
        this.builder = mb;
    }

    public Meal construct() {
        builder.buildFood();
        builder.buildDrink();
        return builder.getMeal();
    }
}
