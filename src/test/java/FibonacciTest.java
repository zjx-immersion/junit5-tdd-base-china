import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {
    // input 1
    // input 2
    // input >=3
    // limit <= 50


    @Test
    void should_get_1_when_execute_with_input_1() {
        // given
        int input = 1;
        FibonacciExcutor fibonacciExcutor = new FibonacciExcutor();
        // when
        long fibNumber = fibonacciExcutor.run(input);

        // then
        assertThat(fibNumber).isEqualTo(1);
    }

    @Test
    void should_get_1_when_execute_with_input_2() {
        // given
        int input = 2;
        FibonacciExcutor fibonacciExcutor = new FibonacciExcutor();
        // when
        long fibNumber = fibonacciExcutor.run(input);

        // then
        assertThat(fibNumber).isEqualTo(1);
    }

    @ParameterizedTest()
    @MethodSource("get_test_fibonacci_data")
    void should_get_2_when_execute_with_input_3(int input, long output) {
        // given
        FibonacciExcutor fibonacciExcutor = new FibonacciExcutor();
        // when
        long fibNumber = fibonacciExcutor.run(input);

        // then
        assertThat(fibNumber).isEqualTo(output);
    }

    static Stream<Arguments> get_test_fibonacci_data() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(50, 12586269025L)
        );
    }




}
