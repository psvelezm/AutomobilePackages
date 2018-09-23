package lab7;

/**
 *
 * @author Pedro
 */
public class ALuxBundle extends Bundle {
    
        public ALuxBundle(){
            
                name = "Asian Luxury Bundle";
                packName = "Luxury Package";
                
                // Standard luxury pacage
                standardPackage.add("Hand Stiched Leather Seats...");
                standardPackage.add("Standard 18 inch Alloy Rims...");
                standardPackage.add("Standard Paint...\n");
                
                // Basic inforomation on vehicle
                bundles.add("Make/Model: Acura Legend");
                bundles.add("Body: Sedan");
                bundles.add("Gas Mileage: MPG City 20 | Hwy 26");
                
		// Additions to standard package
                bundles.add("Auto Dimming Light");
                bundles.add("Electric Moon Roof");
                bundles.add("6-Disc CD Changer");
                bundles.add("Heated Seats");
                bundles.add("Power Locks and Doors");        
            
        }
    
}
