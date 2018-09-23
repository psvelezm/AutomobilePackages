
package lab7;

/**
 *
 * @author Pedro
 */
public class AsiaCarFac extends BuildFactory{
    
        Bundle createBundle(String item) {
        	if (item.equals("luxuryBundle")) {
            		return new ALuxBundle();
        	} else if (item.equals("performanceBundle")) {
        	    	return new APerfBundle();
        	} else return null;
	}
    
}
