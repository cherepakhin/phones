### Проект Phones

Мультимодульный maven проект. Содержит 3 модуля
[billing](billing/), [commutator](commutator/), [dto](dto/).

Телефоны звонят друг-другу используя модуль [commutator](commutator/).
Расчет оплаты сделан в модуле [billing](billing/).

[dto](dto/) является общим для модулей [billing](billing/) и [commutator](commutator/). Содержит модель обмена между модулями.

Перед соединением [commutator](commutator/) проверяет не занят ли абонент и баланс звонящего в [billing](billing/) .
После разговора коммутатор вносит в свою базу инф-цию о звонке и оправляеет ее в [billing](billing/) для перерасчета баланса.

#### Компилирование зависимостей
Пе ред запуском в проекте dto выполнить

````
mvn clean package
````

#### Тестовый запуск
В файле [run.sh](run.sh)

````shell
# Запуск
cd billing
mvn clean spring-boot:run &
cd ../commutator
mvn clean spring-boot:run &

# Проверка (жив/нет)
http :8180/commutator
Ok
````

