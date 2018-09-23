
package lab7;

/**
 *
 * @author Pedro
 */
public abstract class BuildFactory {
    
        abstract Bundle createBundle (String item);
        
        public Bundle createBundle(String item);
        
        public Bundle orderCarBuild(String type){
            Bundle car = createBundle(type);
            System.out.println("## Making a " + car.getName() + " ##");
            car.prep();
            car.packages();
            car.lineBreak();
            return car;            
        }
    
}
