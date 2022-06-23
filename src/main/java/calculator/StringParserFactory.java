package calculator;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringParserFactory {

  private static final Map<Predicate<String>, Function<String, StringParser>> factoryFunction = Map.of(
      StringParserFactory::isEmpty, str -> new EmptyStringParser(),
      StringParserFactory::isMultiple, MultipleStringParser::new
  );

  public static StringParser getParser(String str) {
    return factoryFunction.keySet()
        .stream()
        .filter(key -> key.test(str))
        .findFirst()
        .map(factoryFunction::get)
        .map(s -> s.apply(str))
        .orElseGet(() -> new SingleStringParser(str));
  }

  private static boolean isEmpty(final String str) {
    return str.length() == 0;
  }

  private static boolean isMultiple(final String str) {
    return str.contains(",");
  }

}