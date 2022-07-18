public class Converter {

    public static double stepLenght = 0.00075;
    public static int caloriesPerStep = 50;
    public static int cCal = 1000;


    public static double stepsConverter (int stepsAmount) {
        double kilometers = stepsAmount * stepLenght;
        return kilometers;
    }

    public static double caloriesConverter (int stepsAmount) {
        double burnedCalories = (stepsAmount * caloriesPerStep) / cCal;
        return burnedCalories;
    }
}
