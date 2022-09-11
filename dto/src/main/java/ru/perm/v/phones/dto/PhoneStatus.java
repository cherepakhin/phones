package ru.perm.v.phones.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
public enum PhoneStatus implements Serializable {
    CONNECTED(0),
    NOT_FOUND(1),
    BUSY(2),
    NO_MONEY(3)
    ;

    @Getter
    private int code;

}
