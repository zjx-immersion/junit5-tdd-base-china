import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    // input 1 return 1
    // input 4 return 4
    // 3 * n  : Fizz
    // 5 * n  : Buzz
    // 3 * 5 : FizzBuzz
    // 1 - 100: 集成测试


    @Test
    void should_get_1_when_shouting_1() {
        //given
        String input = "1";
        GizzBuzzGame gizzBuzzGame = new GizzBuzzGame();
        //when
        String output = gizzBuzzGame.shout(input);
        //then
        assertThat(output).isEqualTo("1");
    }

    @Test
    void should_get_2_when_shouting_2() {
        //given
        String input = "4";
        GizzBuzzGame gizzBuzzGame = new GizzBuzzGame();
        //when
        String output = gizzBuzzGame.shout(input);
        //then
        assertThat(output).isEqualTo("4");
    }

    @Test
    void should_get_Fizz_when_shouting_3_or_times_of_3() {
        //given
        String input = "9";
        GizzBuzzGame gizzBuzzGame = new GizzBuzzGame();
        //when
        String output = gizzBuzzGame.shout(input);
        //then
        assertThat(output).isEqualTo("Fizz");
    }

    @Test
    void should_get_Buzz_when_shouting_5_or_times_of_5() {
        //given
        String input = "25";
        GizzBuzzGame gizzBuzzGame = new GizzBuzzGame();
        //when
        String output = gizzBuzzGame.shout(input);
        //then
        assertThat(output).isEqualTo("Buzz");
    }

    @Test
    void should_get_FizzBuzz_when_shouting_3_mutiple_5_times() {
        //given
        String input = "15";
        GizzBuzzGame gizzBuzzGame = new GizzBuzzGame();
        //when
        String output = gizzBuzzGame.shout(input);
        //then
        assertThat(output).isEqualTo("FizzBuzz");
    }
}
