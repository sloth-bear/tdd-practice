package calculator;

public class NumberParserFactory {

  public static NumberParser getParser(String str) {
    if (isEmpty(str)) {
      return new EmptyNumberParser();
    }
    return isMultiple(str) ? new MultipleNumberParser(str) : new SingleNumberParser(str);
  }

  private static boolean isEmpty(final String str) {
    return str.length() == 0;
  }


  private static boolean isMultiple(final String str) {
    return str.contains(",");
  }

}