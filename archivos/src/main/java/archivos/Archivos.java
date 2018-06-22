package archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Archivos {
  public static void main(String[] args) throws IOException {
    // Files.walk(Paths.get("/tmp"), 0);
    // Files.walk(Paths.get("/tmp"), FileVisitOption.FOLLOW_LINKS)
    // .forEach(System.out::println);
    Files.find(Paths.get("/u/agile-development-java-ee.part1.rar"), 
    Integer.MAX_VALUE, (a, b) -> {
      return a.toFile().getName().startsWith("a");
    }).forEach(System.out::println);
    System.out.println("::");
    Files.lines(Paths.get("/u/impresion.in")).forEach(System.out::println);
    System.out.println("::");
    Files.list(Paths.get("/u")).forEach(System.out::println);
    System.out.println("::");
    Files.walk(Paths.get("/u")).forEach(System.out::println);
  }
}
