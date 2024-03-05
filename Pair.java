// package homework.homework4;

class Pair<T, U> {
  T first;
  U second;

  Pair(T a, U b) {
    first = a;
    second = b;
  }

  T getFirst() {
    return first;
  }

  U getSecond() {
    return second;
  }

  void setFirst(T first) {
    this.first = first;
  }

  void setSecond(U second) {
    this.second = second;
  }
}