package MavenBasicTestNG;

import org.testng.annotations.Test;

public class AppiumTest {

    @Test
    public void nativeApp(){
        System.out.println("AndroidApp");

    }
    @Test
    public void iosApp(){
        System.out.println("IosApp");
    }
}
