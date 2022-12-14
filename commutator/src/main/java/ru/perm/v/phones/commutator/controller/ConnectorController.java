package ru.perm.v.phones.commutator.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.perm.v.phones.dto.PhoneStatus;

@RestController
@RequestMapping("/commutator")
@Slf4j
public class ConnectorController {
    /**
     * Простая проверка контроллера жив/нет
     *
     * @return OK
     */
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
    public PhoneStatus startCall(@RequestParam("phoneA") String phoneA, @RequestParam("phoneB") String phoneB) {
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
        log.info("End call {} to {}", phoneA, phoneB);
        return 0;
    }
}
