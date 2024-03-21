# Time Service

Time Service предоставляет возможность получить текущее время сервера с точностью до секунды и указанием таймзоны.
Используется:
* Spring Boot 3.2.3;
* Java 21;
* Gralde 8.6

# Реализован Spring MVC

Проект предполагает простое api, которое не нуждается асинхронных запросах и масштабируемости, которые лучше 
реализованы в WebFlux.

# Использование

Представлен один эндпоинт

```http request
GET /api/v1.0/time
```

Пример ответа:

```json
{
  "date": "22-03-2024 02:12:41",
  "timeZone": "GMT+03:00"
}
```

## Комментарий

Ответ возвращается объектом Dto, который содержит 2 поля. 
При необходимости поля можно увеличить, например, добавить отдельные поля для года, месяца, дня и так далее.