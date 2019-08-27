package kata.taxi;

public class Taxi {
    public double calculate(final int distance, final int waitTime) {
        final int LONG_DISTANCE = 8;
        if (distance > LONG_DISTANCE) {
            return (distance - LONG_DISTANCE) * 1.2 + calculate(LONG_DISTANCE, waitTime);
        }
        if (distance > 2) {
            return  (distance - 2) * 0.8 + calculate(2, waitTime);
        }
        return 6 + 0.25 * waitTime;
    }
}
