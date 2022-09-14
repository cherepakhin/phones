### Модуль Commutator

Соединяет телефоны. Перед соединением проверяет занят/не занят и баланс звонящего.

Порт приложения берется из env переменной COMMUTATOR_PORT (по умолчанию 8080)

#### Запуск
````shell
mvn spring-boot:run
````

#### Тестирование

````shell
http :8180/commutator
OK

http :8180/commutator/start-call phoneA==111 phoneB==222
CONNECTED

http POST :8180/commutator/end-call phoneA==111 phoneB==222
0
````
