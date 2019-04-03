package com.greenfox.springadv;

import com.greenfox.springadv.controller.MyRestController;
import com.greenfox.springadv.service.ApiTodoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(MyRestController.class)
public class RestControllerTest {

    @MockBean
    private ApiTodoService apiTodoService;

    @Autowired
    private MockMvc mockMvc;


}
