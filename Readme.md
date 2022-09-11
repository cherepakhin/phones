### Проект Phones

Мультимодульный maven проект

Телефоны звонят друг-другу используя модуль [commutator](commutator/).
Расчет оплаты сделан в модуле [billing](billing/).

Перед соединением [commutator](commutator/) проверяет не занят ли абонент и баланс звонящего в [billing](billing/) .
После разговора коммутатор вносит в свою базу инф-цию о звонке и оправляеет ее в [billing](billing/) для перерасчета баланса.

#### Тестовый запуск
В файле [run.sh](run.sh)</br>

````shell
cd commutator
mvn spring-boot:run
cd ../billin
mvn spring-boot:run
````

