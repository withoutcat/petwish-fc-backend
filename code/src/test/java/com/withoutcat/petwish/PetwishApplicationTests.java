package com.withoutcat.petwish;

import com.withoutcat.petwish.controller.HealthzController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetwishApplicationTests {
  @Test
  public void testWelcome() {
    assertEquals("这里是withoutcat的健康检查", new HealthzController().healthzCheck());
  }

}
