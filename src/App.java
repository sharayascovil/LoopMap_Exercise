import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
// import java.util.Scanner;
public class App 
{  
public static void main(String[] args, HashMap<String, Integer> hashMap) {

// {       
//     int i,n=0,s=0;
// 	double avg;
// 	{
	   
//         System.out.println("Input the 5 numbers : ");  
         
// 	}
// 		for (i=0;i<5;i++)
// 		{
// 		    Scanner in = new Scanner(System.in);
// 		    n = in.nextInt();
		    
//   		s +=n;
// 	}
// 	avg=s/5;
// 	System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);
 
// }
// }


HashMap<String, Integer> car = new HashMap<String, Integer>();
    car.put("RAV4", "Toyota");
    car.put("F150", "Ford");
    car.put("Tucson", "Hyundai");

    System.out.println(car);
    
        for (Map.Entry<String, Integer> vehicles : car.entrySet()) {
            String key = vehicles.getKey();
            Integer value = vehicles.getValue();
            System.out.println(key + ":" + value);
        }
    }
} 