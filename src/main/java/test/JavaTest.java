package test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class JavaTest {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>(asList("A", "B"));
    System.out.println(names);
    names.add("C");
    System.out.println(names);

    foo(names);

    System.out.println(names);

    List<String> longNames = names.stream()
        .filter(name -> name.length() > 5)
        .collect(toList());
  }

  static int foo(List<String> names) {
    names.add("D");
    return names.size();
  }
}
