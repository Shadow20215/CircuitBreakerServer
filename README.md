# CircuitBreakerServer
# Практическая работа № 4 - Вариативное задание 
Выбран вариант 4.1 ***Circuit Breaker*** - ***Server***

Данный проект является сервером для клиента: https://github.com/Shadow20215/CircuitBreakerClient

Сервер принимает данные пользователя для добавления в базу данных.  
Каждый 3 и 4 запрос сервер возвращает статус код ***503 - Service Unavailable («сервис недоступен»)***.

***Сервер является управляющим в связке с клиентом.  
Для запуска нужен Docker и файл .env!***

***Для запуска проекта необходимо:***   
1. Добавить файл .env в корень этого проекта
2. Собрать Jar файл в этом проекте
3. Собрать Jar файл в проекте с клиентом
4. Ввести команду "docker-compose up --build" в терменале сервера
5. URL адрес для тестирования: 127.0.0.1:8080/client/addUser?name=name&surname=surname&age=1

***Выполнил*** Ивлев Н.С б1-ИФСТ-32
