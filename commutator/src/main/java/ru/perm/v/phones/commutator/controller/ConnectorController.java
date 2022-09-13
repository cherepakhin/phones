package ru.perm.v.phones.commutator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.v.phones.dto.PhoneStatus;

import static java.lang.String.format;

@RestController
@RequestMapping("/commutator")
@Slf4j
public class ConnectorController {
    @GetMapping("")
    public String test() {
        log.info("test");
        return "OK";
    }

    /**
     * Начало разговора
     *
     * @param phoneA номер телефона звонящего
     * @param phoneB вызываемый номер телефона
     * @return Возможные значения: нет денег у phoneA, phoneB занят, один из телефонов выключен, соединено
     */
    @GetMapping("/start-call")
    public PhoneStatus startCall(String phoneA, String phoneB) {
        log.info("Start call {} to {}", phoneA, phoneB);
        return PhoneStatus.CONNECTED;
    }

    /**
     * Завершение разговора
     *
     * @param phoneA номер телефона звонящего
     * @param phoneB вызванный номер телефона
     * @return время звонка в секундах
     */
    @PostMapping("/end-call")
    public Integer endCall(String phoneA, String phoneB) {
        log.info("End call :phoneA to :phoneB");
        return 0;
    }
}
