package ru.perm.v.phones.commutator.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ru.perm.v.phones.dto.PhoneStatus;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ConnectorController.class)
class ConnectorControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private final String COMMUTATOR = "/commutator";
    private final String START_CALL = COMMUTATOR + "/start-call";
    private final String END_CALL = COMMUTATOR + "/end-call";

    @Test
    void isLive() throws Exception {
        this.mockMvc.perform(get(COMMUTATOR)
                        .contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));
    }

    @Test
    void startCall_IsConnect() throws Exception {
        String phoneA="A";
        String phoneB="B";
        this.mockMvc.perform(get(START_CALL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("phoneA", phoneA)
                        .param("phoneB", phoneB)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("\""+PhoneStatus.CONNECTED+"\""));
    }

    @Test
    void endCall() throws Exception {
        String phoneA="A";
        String phoneB="B";
        this.mockMvc.perform(post(END_CALL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .param("phoneA", phoneA)
                        .param("phoneB", phoneB)
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("0"));
    }
}