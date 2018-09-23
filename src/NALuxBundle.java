package lab7;

/**
 *
 * @author Pedro
 */
public class NALuxBundle extends Bundle{
    
        public NALuxBundle() { 
		name = "North American Luxury Bundle";
                packName = "Luxury Package";
                
                // Standard luxury pacage
                standardPackage.add("Hand Stiched Leather Seats...");
                standardPackage.add("Standard 18 inch Alloy Rims...");
                standardPackage.add("Standard Paint...\n");
		 
                // Basic inforomation on vehicle
                bundles.add("Make/Model: Lincoln MKZ");
                bundles.add("Body: Sedan");
                bundles.add("Gas Mileage: MPG City 42 | Hwy 35");
                
                // Additions to standard package
		bundles.add("XM Satelite Radio");
                bundles.add("Bose Audio");
                bundles.add("Automatic Cruise Control");
                bundles.add("Heated Front and Rear Seats");
                bundles.add("Heated Mirrors");
	}
    
}
