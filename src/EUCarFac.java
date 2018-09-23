package lab7;

/**
 *
 * @author Pedro
 */
public class EUCarFac extends BuildFactory{
    
        Bundle createBundle(String item) {
        	if (item.equals("luxuryBundle")) {
            		return new ELuxBundle();
        	} else if (item.equals("performanceBundle")) {
        	    	return new EPerfBundle();
        	} else return null;
	}
    
        
    
}
