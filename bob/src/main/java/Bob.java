
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Bob {

    public String hey(String phrase) {
        return Stream.of(question(phrase), silence(phrase), shouting(phrase))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .orElse("Whatever.");
    }

    private static Optional<String> question(String phrase) {
        return Optional.of(phrase)
                .filter(Pattern.compile("^.+\\?$").asPredicate())
                .filter(exists(Character::isLowerCase).or(exists(Character::isDigit)))
                .map(ignore -> "Sure.");
    }

    private static Optional<String> silence(String phrase) {
        return Optional.of(phrase)
                .filter(Pattern.compile("^\\s*$").asPredicate())
                .map(ignore -> "Fine. Be that way!");
    }

    private static Optional<String> shouting(String phrase) {
        return Optional.of(phrase)
                .filter(contains(c -> !Character.isLowerCase(c)))
                .filter(exists(Character::isAlphabetic))
                .map(ignore -> "Whoa, chill out!");
    }

    private static Predicate<String> contains(Predicate<Character> p) {
        return str -> str.chars().mapToObj(c -> (char) c).allMatch(p);
    }

    private static Predicate<String> exists(Predicate<Character> p) {
        return str -> str.chars().mapToObj(i -> (char) i ).anyMatch(p);
    }
}