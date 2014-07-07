package main;


//動作確認用クラス

public class Main {
	public static void main(String[] args){
		if(!checkInput(args[0]) || !checkInput(args[1])){
			System.exit(0);
		}
		
		Numer0nArugolism arugolism = new Numer0nArugolism();
		String eatBiteNumber = arugolism.analyze(args[0], args[1]);
		
		OutputMapping mapping = new OutputMapping();
		String result = mapping.getResultStatement(eatBiteNumber);
		System.out.println(result);
	}

	private static boolean checkInput(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
