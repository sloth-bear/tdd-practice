package calculator;

import java.util.Arrays;

public class StringParser {

  public static int[] parse(final String number) {
    return Arrays.stream(number.split(","))
        .map(StringParser::correctEmptyString)
        .mapToInt(Integer::parseInt)
        .toArray();
  }

  private static String correctEmptyString(String str) {
    return str.length() == 0 ? "0" : str;
  }

}
