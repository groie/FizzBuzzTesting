package fizzbuzz;

/**
 * Created by gro on 16/03/15.
 */
public class FizzBuzzImpl implements FizzBuzz {

    @Override
    public String fizzify(Integer number) {
        StringBuilder sb = new StringBuilder();
        boolean by3 = dividesBy(number, 3);
        boolean by5 = dividesBy(number, 5);
        if (by3) {
            sb.append("Fizz");
        }
        if (by5) {
            sb.append("Buzz");
        }
        if (!by3 && !by5 ) {
            sb.append(number);
        }
        return sb.toString();
    }

    private static boolean dividesBy(Integer num, Integer divider) {
        return num%divider == 0;
    }
}
