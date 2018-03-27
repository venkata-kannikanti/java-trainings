package basics;

public class Weather {

	public static void main(String[] args) {
		int temparature=45;
		String sunCondition = "Overcast";
		
		if (temparature > 80) {
			System.out.println("Wheather is Hot");
		}
		else if ((temparature <= 60) && (sunCondition == "Sunny")){
			System.out.println("Wheather is cool And Sunny");
		}
		else if ((temparature > 50) || (sunCondition == "Overcast")){
			System.out.println("Wheather is cool And OverCast");
		}
		else {
			System.out.println("Wheather is OK");
		}
			
	}

}
