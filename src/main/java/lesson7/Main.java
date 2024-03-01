package lesson7;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogManager().getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {
        double result = Calculator.calculate(2, 3, Calculator.Type.SUMMARY);
        LOGGER.info("result: " + result);

//        try {
            result = Calculator.calculate(22, 3, null);
            System.out.println("result: " + result);
//        }
//        catch (Exception err) {
//            System.out.println("Something bad has happened");
//        }

        result = Calculator.calculate(244, 3, Calculator.Type.SUBTRACTION);
        LOGGER.info ("result: " + result);

        result = Calculator.calculate(24, 5, Calculator.Type.DIVISION);
        LOGGER.info("result: " + result);
    }
}
