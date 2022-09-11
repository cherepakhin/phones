package ru.perm.v.phones.commutator.service;

import ru.perm.v.phones.dto.PhoneStatus;

public interface ConnectorService {
    PhoneStatus getStatus();
}
