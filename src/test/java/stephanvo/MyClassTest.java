package stephanvo;

import org.junit.Assert;
import org.junit.Test;

public class MyClassTest {

  @Test
  public void testMyClassExists() {
    // arrange

    // act
    MyClass clazz = new MyClass();

    // assert
    Assert.assertNotNull(clazz);
  }

}
