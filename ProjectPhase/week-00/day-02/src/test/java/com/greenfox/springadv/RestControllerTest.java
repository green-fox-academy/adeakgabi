package com.greenfox.springadv;

import com.greenfox.springadv.controller.MyRestController;
import com.greenfox.springadv.service.ApiTodoService;
import com.greenfox.springadv.service.UserService;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@WebMvcTest(MyRestController.class)
public class RestControllerTest {

    @MockBean
    private ApiTodoService apiTodoService;
    @MockBean
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    @Test
    public void registerWithNullUsername_returnsErrorMessage() throws Exception {
        mockMvc.perform(post("/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"userName\": null, \"password\": \"12345\"}"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.message")
                        .value("Please provide a username"));

    }
}
