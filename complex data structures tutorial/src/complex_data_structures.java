import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;


public class complex_data_structures {
	public static String[] vehicles =  {
		"ambulance", "helicopter", "lifeboat"
	};
	
	public static String[][] drivers =  {
		{"bryan", "young buck", "50"},
		{"sarah", "mary j", "wiz", "julie"},
		{"ainsley", "robin", "aubrey"}
	};
	
	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<>();
		
		for(int i = 0; i < vehicles.length; i++)
		{
			String vehicle = vehicles[i];
			String[] driversList = drivers[i];
			
			Set<String> driverSet = new LinkedHashSet<String>();
			
			for(String driver : driversList)
			{
				driverSet.add(driver);
			}
			
			personnel.put(vehicle, driverSet);
		}
		{//brackets to scope driversList variable so can use again later
			//example usage
			Set<String> driversList = personnel.get("helicopter");
			
			for(String driver: driversList)
			{
				System.out.println(driver);
			}
		}
		//iterate through whole thing
		for(String vehicle: personnel.keySet())
		{
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driversList = personnel.get(vehicle);
			
			for(String driver: driversList)
			{
				System.out.print(driver);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}
	
	
	
}
