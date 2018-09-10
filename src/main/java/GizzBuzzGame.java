public class GizzBuzzGame {
    public String shout(String input) {

        int num = Integer.parseInt(input);

        String result = "";
        if (num % 3 == 0) {
            result += "Fizz";
        }

        if (num % 5 == 0) {
            result += "Buzz";
        }


        return result.isEmpty() ? input : result;
    }
}
