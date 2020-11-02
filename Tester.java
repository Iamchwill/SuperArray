public class Tester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    System.out.println(words.add("kani"));
    System.out.println(words.size());
    System.out.println(words.add("uni"));
    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.get(1));
    System.out.println(words.set(1, "ebi"));
    for (int i = words.size(); i < 23; i++) {
      words.add("fill" + i);
    }
    System.out.println(words.size());
    System.out.println(words.get(0));
    System.out.println(words.get(1));
    System.out.println(words.get(3));
    System.out.println(words.get(20));
    System.out.println(words.get(words.size() - 1));
  }
}
