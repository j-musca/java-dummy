package myjava.dummy.integration;


import com.google.common.collect.Lists;
import myjava.dummy.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalcIntegrationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloWorld() {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello World!");
    }

    @Test
    public void testCalcWithTwoNumbers() {
        Result result = this.restTemplate.getForObject("/calc/sum?numbers={numbers}", Result.class, new Object[]{Lists.newArrayList(2,3).toArray()});
        assertThat(result.getValue()).isEqualTo(5);
    }

}
