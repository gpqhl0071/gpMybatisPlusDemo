package com.gp.gpmybatisplusdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author gao peng
 * @date 2019/11/27 16:45
 */
@SpringBootTest
public class SampleTest {
  @Autowired
  private UserMapper userMapper;

  @Test
  public void testSelect() {
    System.out.println(("----- selectAll method test ------"));
    List<User> userList = userMapper.selectList(null);
//    Assert.assertEquals(5, userList.size());
    userList.forEach(System.out::println);
  }

}
