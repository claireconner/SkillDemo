import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    //this test works because 20 equals 4*5
   public void multTest(){
       assertEquals(20, SkillDemo.multiply(4,5));
   }
}
