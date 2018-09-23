
package lab7;

/**
 *
 * @author Pedro
 */
public class CarTester {

   
    public static void main(String[] args) {
        BuildFactory naFactory = new NACarFac();
        BuildFactory europeFactory = new EUCarFac();
        BuildFactory asiaFactory = new AsiaCarFac();
        
        //North American Luxury Car
                System.out.println("================================= North American Builds =================================");
		Bundle car = naFactory.orderCarBuild("luxuryBundle");
                System.out.println("");
                
                //North American Performance Car
		car = naFactory.orderCarBuild("performanceBundle");
		System.out.println("");
                
                System.out.println("================================= European Builds =================================");
                
                //European Luxury Car
		car = europeFactory.orderCarBuild("luxuryBundle");
		System.out.println("");
                
                //European Performance Car
		car = europeFactory.orderCarBuild("performanceBundle");
		System.out.println("");
                
                System.out.println("================================= Asia Builds =================================");
                //Asian Luxury Car
                car = asiaFactory.orderCarBuild("luxuryBundle");
		System.out.println("");

                //Asian Performance Car
		car = asiaFactory.orderCarBuild("performanceBundle");
		System.out.println("");
        
        
    }
    
}
