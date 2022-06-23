package calculator;

import java.util.Arrays;

public class StringCalculator {

  public int add(String str) {
    return Arrays.stream(StringParserFactory.getParser(str).parse())
        .sum();
  }

}
