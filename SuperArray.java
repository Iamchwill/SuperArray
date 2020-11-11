public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int capacity) {
    if (capacity < 0) {
      throw new IllegalArgumentException(
      "Negative Capactiy: " + capacity + " cannot be the capacity.");
    }
    else {
      data = new String[capacity];
      size = 0;
    }
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
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    else return data[index];
  }

  public String set(int index, String element) {
    if (index >= size || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    else {
      String out = data[index];
      data[index] = element;
      return out;
    }
  }

  private void resize() {
    String[] temp = data;
    data = new String[data.length * 2 + 1];
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
    }
    size = 0;
}

  public String toString() {
    if (size == 0) return "[]";
    String out = "[";
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

    public void add(int index, String element) {
      if (index > size || index < 0) {
        throw new IndexOutOfBoundsException();
      }
      else {
        if (size == data.length) resize();
        String[] replace = new String[data.length];
        int replaceDex = 0;
        for (int count = 0; count < size + 1; count++) {
          if (replaceDex == index) {
            replace[replaceDex] = element;
            replaceDex++;
          }
          replace[replaceDex] = data[count];
          replaceDex++;
        }
        data = replace;
        size++;
      }
    }

    public String remove(int index) {
      if (index >= size || index < 0) {
        throw new IndexOutOfBoundsException();
      }
      else {
      size--;
      String out = data[index];
      for (int i = index; i < size; i++) {
        data[i] = data[i + 1];
      }
      return out;
    }
  }

    public int indexOf(String s) {
      for (int i = 0; i < size; i++) {
        if (data[i].equals(s)) return i;
      }
      return -1;
    }

    public String[] toArray() {
      String[] safe = new String[size];
      for (int i = 0; i < size; i++) {
        safe[i] = data[i];
      }
      return safe;
    }

    public int lastIndexOf(String value) {
      for (int i = size - 1; i >= 0; i--) {
        if (data[i].equals(value)) return i;
      }
    return -1;
  }

    public boolean equals(SuperArray other) {
      if (size != other.size()) return false;
      for (int i = 0; i < size; i++) {
        if (!data[i].equals(other.get(i))) return false;
      }
      return true;
    }
  }
