package task2;

public class HDD {
  String name;
  double volume;
  String type;
  public HDD() {
  }
  public HDD(String name, double volume, String type) {
    this.name = name;
    this.volume = volume;
    this.type = type;
  }
  public String informationHDD() {
    if (name == null && volume == 0.0 && type == null) {
      return "HDD information: Lack of information";
    }
    return "HDD name: " + this.name + "; volume: " + this.volume + "; type: " + this.type;
  }
}
