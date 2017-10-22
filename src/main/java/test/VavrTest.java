package test;

import java.util.Optional;

import io.vavr.collection.List;
import io.vavr.control.Option;

import static io.vavr.API.List;
import static io.vavr.API.None;
import static io.vavr.API.Some;

public class VavrTest {

  final List<String> names = List("A", "B");

  final Optional<String> optional = Optional.empty();

  final Option<String> option = None();

  public static void main(String[] args) {
    List<String> names = List("A", "B");
    names.append("C");
    List<String> otherNames = names.append("C");
    System.out.println(names);
    System.out.println(otherNames);

    foo(names);

    List<String> longNames = names.filter(name -> name.length() > 5);

    Option<String> opt = Some("test");
  }

  static int foo(List<String> names) {
    names.append("C");
    return names.size();
  }
}
