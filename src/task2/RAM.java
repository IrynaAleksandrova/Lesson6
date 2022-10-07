package task2;

public class RAM {
  String name;
  double volume;
  public RAM() {
  }
  public RAM(String name, int volume) {
    this.name = name;
    this.volume = volume;
  }
  public String informationRAM() {
    if (name == null && volume == 0.0) {
      return "RAM information: Lack of information";
    }
    return "RAM name: " + this.name + "; volume: " + this.volume;
  }
}
