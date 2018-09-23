package lab7;

/**
 *
 * @author Pedro
 */
public class NACarFac extends BuildFactory {
    
        Bundle createBundle(String item) {
        	if (item.equals("luxuryBundle")) {
            		return new NALuxBundle();
        	} else if (item.equals("performanceBundle")) {
        	    	return new NAPerfBundle();
        	} else return null;
	}
    
}
