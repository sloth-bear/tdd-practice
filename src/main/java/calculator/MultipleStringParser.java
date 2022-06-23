package calculator;

import java.util.Arrays;

public class MultipleStringParser implements StringParser {

  private final String number;

  public MultipleStringParser(final String number) {
    this.number = number;
  }

  public int[] parse() {
    return Arrays.stream(this.number.split(","))
        .mapToInt(Integer::parseInt)
        .toArray();
  }

}