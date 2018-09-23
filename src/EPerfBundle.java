package lab7;

/**
 *
 * @author Pedro
 */
public class EPerfBundle extends Bundle {
    
        public EPerfBundle(){
                name = "European Performance Bundle";
                packName = "Performance Package";
                
                // Standard luxury pacage
                standardPackage.add("Standard Seats...");
                standardPackage.add("Standard Rims...");
                standardPackage.add("Standard Paint...\n");
                
                // Basic inforomation on vehicle
                bundles.add("Make/Model: BMW M3");
                bundles.add("Body: Coupe");
                bundles.add("Gas Mileage: MPG City 14 | Hwy 222");
                
                // Additions to standard package
		bundles.add("All Wheel Drive");
                bundles.add("Enhanced Sports Suspension");
                bundles.add("Automatic emergency braking");
                bundles.add("Turbo Stright 6 engine");
                bundles.add("7 speed manual transmission");
            
            
            
        }
    
}
