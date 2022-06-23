package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  @Test
  public void calculateEmptyStringToDefaultValue() {
    final var parser = getCalculator();

    final var expected = parser.add("");
    assertThat(expected).isEqualTo(0);
  }

  @Test
  public void calculateSingleNumberStringToNumber() {
    final var parser = getCalculator();

    assertThat(parser.add("1")).isEqualTo(1);
    assertThat(parser.add("2")).isEqualTo(2);
  }

  @Test
  public void calculateMultipleNumberToAddedNumber() {
    final var parser = getCalculator();

    assertThat(parser.add("1,2")).isEqualTo(3);
    assertThat(parser.add("4,5")).isEqualTo(9);
  }

  private StringCalculator getCalculator() {
    return new StringCalculator();
  }

}
