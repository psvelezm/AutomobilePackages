package lab7;

/**
 *
 * @author Pedro
 */
public class NAPerfBundle extends Bundle{
    
        public NAPerfBundle() {
		name = "North American Performance Bundle";
                packName = "Performance Package";
                
                // Standard luxury pacage
                standardPackage.add("Standard Seats...");
                standardPackage.add("Standard Rims...");
                standardPackage.add("Standard Paint...\n");
                
                // Basic inforomation on vehicle
                bundles.add("Make/Model: Ford Mustang");
                bundles.add("Body: Coupe");
                bundles.add("Gas Mileage: MPG City 18 | Hwy 24");
                
                // Additions to standard package
		bundles.add("4 Wheel Drivetrain");
                bundles.add("Shelby performance package");
                bundles.add("Shelby performance trim");
                bundles.add("Curtain side air bags");
                bundles.add("Duel Exhaust");
	}
    
}
