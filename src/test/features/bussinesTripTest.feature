@all
@severity=blocked
Feature: НоваяКомандировка

  @Командировка
  Scenario Outline: НоваяКомандировка
    And Старица авторизации: вводим логин "Sekretar Kompanii", пароль "testing"
    And Открываем страницу заявки новой командировки
    And Заполняем поля командировки, в том числе: город прибытия "<ArrivalCity>", дата выбытия "<departureDate>", дата прибытия "<returnDate>"
    And Проверяем поля, в том числе: город прибытия "<ArrivalCity>", дата выбытия "<departureDate>", дата прибытия "<returnDate>"

    Examples:
      | ArrivalCity     | departureDate | returnDate |
      | Sankt-Peterburg | 06.03.2023    | 05.04.2023 |
