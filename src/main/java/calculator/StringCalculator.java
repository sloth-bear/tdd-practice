package calculator;

import java.util.Arrays;

public class StringCalculator {

  public int add(String str) {
    return Arrays.stream(StringParser.parse(str))
        .sum();
  }

}
