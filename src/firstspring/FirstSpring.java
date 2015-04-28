
package firstspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author nagnello
 */
public class FirstSpring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        
        Owner owner = (Owner)ctx.getBean("owner");
        
        Animal pet = owner.getPet();
        
        System.out.println(owner.getName());
        pet.speak();
    }
    
}
