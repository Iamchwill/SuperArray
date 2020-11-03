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
    if (size == data.length) resize();
    data[size] = element;
    size++;
    return (data[size - 1].equals(element));
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    data[index] = element;
    return data[index];
  }

  private void resize() {
    String[] temp = data;
    data = new String[data.length * 2];
      for (int i = 0; i < temp.length; i++) {
        data[i] = temp[i];
      }
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    for (int i = 0; i < data.length; i++) {
      data[i] = null;
    size = 0;
  }
}

  public String toString() {
    String out = "[";
    int last = 0;
    for (int j = 0; j < size - 1; j++) {
        out += data[j] + ", ";
      }
    out += data[size - 1] + "]";
    return out;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) return true;
    }
    return false;
  }
}
