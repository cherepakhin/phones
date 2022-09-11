package ru.perm.v.phones.commutator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.perm.v.phones.dto.PhoneStatus;

@RestController
@RequestMapping("/commutator")
public class ConnectorController {
    @GetMapping("")
    public String test() {
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
        PhoneStatus phoneStatus = PhoneStatus.CONNECTED;
        return phoneStatus;
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
        return 0;
    }
}
