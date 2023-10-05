
# Документация к REST API для вычисления частоты символов

Этот REST API предназначен для вычисления частоты встречи символов в заданной строке и возвращения результата, отсортированного по убыванию количества вхождений символов.

## Запуск приложения

Для запуска приложения выполните следующие шаги:

1. Убедитесь, что у вас установлены Java 8+ и Spring Boot 2+.
2. Склонируйте репозиторий с кодом приложения.

   git clone https://github.com/SalomeCarter/T1.git

3. Перейдите в каталог с проектом.

   cd T1

4. Соберите и запустите приложение.

   ./mvnw spring-boot:run

Приложение будет доступно по адресу `http://localhost:8080`.

## Формат запроса

Для вычисления частоты символов в строке отправьте GET-запрос на следующий адрес:

http://localhost:8080/api/calculate-frequency?input={your-input-string}


Где `{your-input-string}` - строка, для которой нужно вычислить частоту символов.

## Формат ответа

Ответ на запрос будет в формате JSON и будет содержать список символов и их частоту в убывающем порядке. Пример ответа:

 [
    {"character": "a", "frequency": 5},
    {"character": "c", "frequency": 4},
    {"character": "b", "frequency": 1}
]

## Примеры запросов

### Пример 1: Вычисление частоты символов в строке "aaaaabcccc"

Запрос:

GET http://localhost:8080/api/calculate-frequency?input=aaaaabcccc

Ответ:
 [
    {"character": "a", "frequency": 5},
    {"character": "c", "frequency": 4},
    {"character": "b", "frequency": 1}
]

### Пример 2: Вычисление частоты символов в пустой строке

Запрос:

GET http://localhost:8080/api/calculate-frequency?input=

Ответ:
 []

### Пример 3: Вычисление частоты символов в строке с null

Запрос:

GET http://localhost:8080/api/calculate-frequency

Ответ:
 []




