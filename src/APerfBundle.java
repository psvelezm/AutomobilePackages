
package lab7;

/**
 *
 * @author Pedro
 */
public class APerfBundle extends Bundle {
    
    public APerfBundle(){
        
                name = "Asian Performance Bundle";
                packName = "Performance Package";
                
                // Standard luxury pacage
                standardPackage.add("Standard Seats...");
                standardPackage.add("Standard Rims...");
                standardPackage.add("Standard Paint...\n");
                
                // Basic inforomation on vehicle
                bundles.add("Make/Model: Acura Integra");
                bundles.add("Body: Coupe");
                bundles.add("Gas Mileage: MPG City 22 | Hwy 28");
                
                // Additions to standard package
		bundles.add("VTEC Motor");
                bundles.add("5-Speed manual transmission");
                bundles.add("Front and rear stability bar");
                bundles.add("All-Wheel Steering");
                bundles.add("Anti-lock Breaks");
        
        
        
        
        
    }
    
}
