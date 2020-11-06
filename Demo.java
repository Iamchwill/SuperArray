public class Demo{
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i >= 0; i--) {
      if (s.indexOf(s.get(i)) != i) s.remove(i);
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) overlap.add(a.get(i));
    }
    return overlap;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    int count = 0;
    SuperArray out = new SuperArray(a.size() + b.size());
    if (a.size() > b.size()) count = a.size();
    else count = b.size();
    for (int i = 0; i < count; i++) {
      if (a.size() > i) System.out.println(out.add(a.get(i)));
      if (b.size() > i) System.out.println(out.add(b.get(i)));
    }
    System.out.println(out.size());
    return out;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    SuperArray newWords = new SuperArray();
    newWords.add("una");
    newWords.add("toro");
    newWords.add("3");
    newWords.add("uni");
    newWords.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
    System.out.println(findOverlap(words, newWords));
    System.out.println(zip(words, newWords));
    System.out.println(zip(newWords, words));
  }
}
