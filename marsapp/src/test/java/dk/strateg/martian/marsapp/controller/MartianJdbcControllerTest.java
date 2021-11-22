package dk.strateg.martian.marsapp.controller;

import dk.strateg.martian.marsapp.entity.Martian;
import dk.strateg.martian.marsapp.service.MartianJdbcService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MartianJdbcController.class)
public class MartianJdbcControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MartianJdbcService martianJdbcService;

    @Test
    void count() throws Exception {
        final var mockCount = 10L;
        Mockito.when(martianJdbcService.count()).thenReturn(mockCount);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/jdbc/count").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        assertEquals(String.valueOf(mockCount), result.getResponse().getContentAsString());
    }

    @Test
    void findById() throws Exception {
        Martian mockMartian = new Martian(1L, "Bob", "Red", 1, 1);

        Mockito.when(martianJdbcService.findById(Mockito.anyLong())).thenReturn(mockMartian);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/jdbc/martian/1").accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().is2xxSuccessful()).andReturn();

        var expectedBody = "{\"martianId\":1,\"firstName\":\"Bob\",\"lastName\":\"Red\",\"baseId\":1,\"superId\":1}";
        JSONAssert.assertEquals(expectedBody, result.getResponse().getContentAsString(), false);
    }
}
