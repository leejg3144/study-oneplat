package com.springboot.study.controller;

import com.springboot.study.service.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/***********
 * Servlet Container Type( Case. 간단히 컨트롤러만 테스트 하고자 할 )
 ***********/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest3 {

    @Autowired
    TestRestTemplate testRestTemplate;

    @MockBean
    SampleService sampleService;

    @Test
    public void hello() throws Exception {
        when(sampleService.getName()).thenReturn("Mr.Lee");

        String result = testRestTemplate.getForObject("/hello", String.class);
        assertThat(result).isEqualTo("My name is Mr.Lee");
    }
}