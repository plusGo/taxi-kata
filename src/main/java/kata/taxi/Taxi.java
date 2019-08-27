package kata.taxi;

public class Taxi {
    public double calculate(final int distance, final int waitTime) {
        if (distance > 8) {
            return (distance - 8) * 1.2 + calculate(8, waitTime);
        }
        if (distance > 2) {
            return  (distance - 2) * 0.8 + calculate(2, waitTime);
        }
        return 6 + 0.25 * waitTime;
    }
}
