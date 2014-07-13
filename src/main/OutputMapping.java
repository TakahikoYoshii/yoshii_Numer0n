package main;

public class OutputMapping {

	public String getResultStatement(String eatBiteNumber) {
		String[] eatBite =eatBiteNumber.split(":");
		return getEatStatement(eatBite[0]) + getBiteStatement(eatBite[1]);
	}

	private String getBiteStatement(String biteNumber) {
		if(biteNumber.equals("0")){
			return "";
		}
		return biteNumber + "Bite";
	}

	private String getEatStatement(String eatNumber) {
		if(eatNumber.equals("0")){
			return "";
		}
		return eatNumber + "Eat";
	}

}
