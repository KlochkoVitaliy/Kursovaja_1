import java.util.concurrent.ThreadLocalRandom;

public class EmployeeUtil {

        public static int getRandomNo(int lowerLimit, int upperLimit) {
        return ThreadLocalRandom.current().nextInt(lowerLimit, upperLimit);
    }
}
