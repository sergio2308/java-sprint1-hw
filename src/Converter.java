public class Converter {

    private static double stepLenght = 0.00075;
    private static int caloriesPerStep = 50;
    private static int cCal = 1000;


    public static double stepsConverter (int stepsAmount) {
        return stepsAmount * stepLenght;
    }

    public static double caloriesConverter (int stepsAmount) {
        return (stepsAmount * caloriesPerStep) / cCal;
    }
}
