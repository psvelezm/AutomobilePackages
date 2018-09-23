
package lab7;

/**
 *
 * @author Pedro
 */

import java.util.ArrayList;
public class Bundle {
    
        String name;
	ArrayList bundles = new ArrayList();
        ArrayList standardPackage = new ArrayList();
        String packName;
        
	void prep() {
		//System.out.println("Preparing chassis for " + name);
		//System.out.println("Constructing the body...");
                //System.out.println("Adding paint...");
                
                System.out.println("Standard Equipment for " + packName);
                for (int i = 0; i < standardPackage.size(); i++) {
			System.out.println("   " + standardPackage.get(i));
		}
                
	}
  
	void packages() {
		//System.out.println("Installing requested packages");
                System.out.println("## " + name + " ##");
                for (int i = 0; i < 3; i++) {
                    System.out.println(bundles.get(i));
                }
                System.out.println("Additional Options:");
                for (int i = 3; i < bundles.size(); i++) {
			System.out.println("   " + bundles.get(i));
		}
	}
 
	void lineBreak() {
		System.out.println("*************************************************"
                        + "***********");
	}
   
	public String getName() {
		return name;
	}
        
    
}
