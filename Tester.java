public class Tester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    SuperArray cap = new SuperArray(23);
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
    System.out.println(words);
    System.out.println(words.contains("kani"));
    System.out.println(words.isEmpty());
    // words.clear();
    System.out.println(words.isEmpty());
    System.out.println(words.get(0));
    System.out.println(cap.get(22));
    System.out.println(words.size());
    words.add(0, "Test");
    words.add(1, "fill1");
    System.out.println(words);
    System.out.println(words.remove(2));
    System.out.println(words.remove(2));
    System.out.println(words);
    System.out.println(words.indexOf("Test"));
    System.out.println(words.indexOf("fill17"));
    System.out.println(words.indexOf("nothing"));
    String[] test = words.toArray();
    for (int i = 0; i < test.length; i++) {
      System.out.print(test[i] + " ");
    }
    for (int i = 0; i < 23; i++) {
      if (i % 2 != 0) cap.add("odd");
      else cap.add("even");
    }
    System.out.println();
    System.out.println(cap.indexOf("odd"));
    System.out.println(cap.lastIndexOf("odd"));
    System.out.println(cap.indexOf("even"));
    System.out.println(cap.lastIndexOf("even"));
    SuperArray check = new SuperArray();
    SuperArray copy = new SuperArray();
    check.add("Same"); copy.add("Same");
    System.out.println(check.equals(copy));
    check.add("different");
    System.out.println(check.equals(copy));
    copy.add("different");
    System.out.println(check.equals(copy));
  }
}
