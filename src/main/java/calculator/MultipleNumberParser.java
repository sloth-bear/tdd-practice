package calculator;

import java.util.Arrays;

public class MultipleNumberParser implements NumberParser {

  private final String number;

  public MultipleNumberParser(final String number) {
    this.number = number;
  }

  public int add() {
    return Arrays.stream(this.number.split(","))
        .mapToInt(Integer::parseInt)
        .sum();
  }
}