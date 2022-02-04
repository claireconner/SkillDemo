import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    //this test doesn't work because 20 doesnt equal 4*4
   public void multTest(){
       assertEquals(20, SkillDemo.multiply(4,4));
   }
}
