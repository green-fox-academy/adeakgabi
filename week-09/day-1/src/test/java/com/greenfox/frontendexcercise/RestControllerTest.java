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
import static org.mockito.ArgumentMatchers.*;

import java.util.HashMap;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@WebMvcTest(MyRestController.class)
public class RestControllerTest {

    @MockBean
    private MyService myService;

    @Autowired
    private MockMvc mockMvc;

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

    @Test
    public void greeter_isGreetingTheUser() throws Exception{
        when(myService.greetUser("Gabi", "student"))
                .thenReturn(new HashMap<String, String>(){{
                    put("welcome_message", "Oh, hi there Gabi, my dear student!");
                }});
        mockMvc.perform(
                get("/greeter?name=Gabi&title=student"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.['welcome_message']")
                .value("Oh, hi there Gabi, my dear student!"));

    }

    @Test
    public void appenda_returnsWord_WithAppendA() throws Exception{
        mockMvc.perform(
                get("/appenda/macsk"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.appended")
                .value("macska"));
    }

    @Test
    public void dountilSum_returnsSum() throws Exception{
        when (myService.doUntilSum((HashMap<String, Integer>)notNull()))
                .thenReturn(new HashMap<String, Integer>(){{
                    put("until", 5);
                    put("result", 15);
                }});

        mockMvc.perform(
                post("/dountil/sum")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"until\":5}"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.result")
                .value(15));
    }




}
