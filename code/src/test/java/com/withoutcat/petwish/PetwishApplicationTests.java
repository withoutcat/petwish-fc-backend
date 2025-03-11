package com.withoutcat.petwish;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.withoutcat.petwish.controller.HealthzController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PetwishApplicationTests {
  @Test
  public void testWelcome() {
    assertEquals("这里是withoutcat的健康检查", new HealthzController().healthzCheck());
  }

}
