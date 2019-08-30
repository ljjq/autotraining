import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationTest {
    @Test
    public void testConcat(){
        String a= "I love";
        String b= " test automation";
        String result=a + b;
        Assert.assertEquals(result,"I love test automation");
    }
}
