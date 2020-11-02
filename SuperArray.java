public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    data[size] = element;
    size++;
    if (data[size - 1].equals(element)) {
      return true;
    }
    return false;
  }

  public String get(int index) {
    return data[index];
  }
}
