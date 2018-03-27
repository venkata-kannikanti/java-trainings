package basics;

public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New York", "Miami", "Dallas", "O'fallon"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		//Declaring Array with Size
		String[] states = new String[5];
		states[0] = "MISSOURI";
		states[1] = "ILLINOIS";
		states[2] = "New York";
		states[3] = "UTAH";
		states[4] = "MARYLAND";
		int i=0;
		// Do loop enters the loop THEN tests the condition
		System.out.println("***************EXECUTING DO LOOP**************************" );
		do {
		System.out.println("The Selected State Is :" + states[i]);
		i=i+1;
		}while (i<5);
		System.out.println("***************EXECUTING WHILE LOOP**************************" );
		
		int l=0, n = 0;
		boolean stateFound = false;
		
		while (n<5)// While Loop Enters in to the LOOP only when the TEST Condition is true
		{
			System.out.println("The Selected State Is :" + states[n]);
			n++;
		}
		
		System.out.println("***************EXECUTING WHILE LOOP WITH SPECIFIC CONDITION**************************" );
		while (!stateFound)
		{
			String state = states[l];
			System.out.println("The State Name Is :" + state);
			if (state == "New York") {
			System.out.println("The State Is Found and Its Name Is :" + state);
			stateFound = true;
			}
			l++;
		}
		System.out.println("***************END WHILE LOOP**************************" );
		System.out.println("***************EXECUTING FOR LOOP **************************" );
		for(int j=0;j<5;j++)
		{
			
			System.out.println("The State Is Found and Its Name Is :" + states[j]);
		
		}
		System.out.println("***************END FOR LOOP **************************" );
		//Defing Array and defining it later
		String[] countries;
		countries = new String[4];
		countries[0] = "UNITED STATES";
		countries[1] = "INDIA";
		countries[2] = "CANADA";
		countries[3] = "RUSSIA";
		System.out.println("The Selected Country Is :" + countries[1]);
		
	}

}
