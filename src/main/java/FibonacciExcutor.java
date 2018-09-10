public class FibonacciExcutor {
    public long run(int input) {
        long output = 1;

        if (input >= 3) {
            long firstNum = 1;
            long secondNum = 1;
            long tmpNum;

            for (int i = 3; i <= input; i++) {
                tmpNum = firstNum;
                firstNum = secondNum;
                secondNum = tmpNum + secondNum;
            }

            output = secondNum;
        }

        return output;
    }
}
