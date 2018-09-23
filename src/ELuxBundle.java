
package lab7;

/**
 *
 * @author Pedro
 */
public class ELuxBundle extends Bundle {
    
        public ELuxBundle(){
                
                name = "European Luxury Bundle";
                packName = "Luxury Package";
                
                // Standard luxury pacage
                standardPackage.add("Hand Stiched Leather Seats...");
                standardPackage.add("Standard 18 inch Alloy Rims...");
                standardPackage.add("Standard Paint...\n");
		 
                // Basic inforomation on vehicle
                bundles.add("Make/Model: Audi A6");
                bundles.add("Body: Sedan");
                bundles.add("Gas Mileage: MPG City 22 | Hwy 28");
                
                // Additions to standard package
		bundles.add("XM Satelite Radio");
                bundles.add("Head Rest TV Screens");
                bundles.add("Audi Link Infotainment System");
                bundles.add("Premium Bose Surround ");
                bundles.add("Mobile Start and Drive system");
            
                
            
            
        }
    
}
