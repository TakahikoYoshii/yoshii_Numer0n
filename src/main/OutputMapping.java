package main;

public class OutputMapping {

  public String getResultStatement(String eatBiteNumber) {
    String[] eatBite = eatBiteNumber.split(":");
    return getEatStatement(eatBite[0]) + getBiteStatement(eatBite[1]);
  }

  private String getBiteStatement(String biteNumber) {
    return (biteNumber.equals("0") ? "" : biteNumber + "Bite");
  }

  private String getEatStatement(String eatNumber) {
    return (eatNumber.equals("0") ? "" : eatNumber + "Eat");
  }
}
