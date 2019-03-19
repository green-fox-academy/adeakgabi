package com.greenfox.frontendexcercise;

import com.greenfox.frontendexcercise.controller.MyRestController;
import com.greenfox.frontendexcercise.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;
import java.util.HashMap;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MyRestController.class)
public class RestControllerTest {

    @MockBean
    private MyService myService;

    @Autowired
    private MockMvc mockMvc;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void doublingNumber_doublesInput() throws Exception{
        when (myService.doubleInputNum(3))
                .thenReturn(new HashMap<String, Integer>(){{
                    put("received", 3);
                    put("result", 6);
                }});
        mockMvc.perform(
                get("/doubling?input=3"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.received")
                        .value(3))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result")
                        .value(6));
    }
}
