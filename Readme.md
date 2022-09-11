### Проект Phones

Мультимодульный maven проект. Содержит 3 модуля
[billing](billing/), [commutator](commutator/), [dto](dto/).

Телефоны звонят друг-другу используя модуль [commutator](commutator/).
Расчет оплаты сделан в модуле [billing](billing/).

[dto](dto/) является общим для модулей [billing](billing/) и [commutator](commutator/). Содержит модель обмена между модулями.

Перед соединением [commutator](commutator/) проверяет не занят ли абонент и баланс звонящего в [billing](billing/) .
После разговора коммутатор вносит в свою базу инф-цию о звонке и оправляеет ее в [billing](billing/) для перерасчета баланса.

#### Тестовый запуск
В файле [run.sh](run.sh)

````shell
cd commutator
mvn spring-boot:run
cd ../billin
mvn spring-boot:run
````

