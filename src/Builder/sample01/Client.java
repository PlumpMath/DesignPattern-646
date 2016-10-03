package Builder.sample01;


public class Client {
    public static void main(String args[]) {
        MealBuilder builder = (MealBuilder) XMLUtil.getBean();
        KFCWaiter waiter = new KFCWaiter();
        waiter.setMealBuilder(builder);
        Meal meal = waiter.construct();

        System.out.println("套餐组合:");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
