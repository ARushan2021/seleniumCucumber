@all
@severity=blocked
Feature: НоваяКомандировка
  @Командировка
  Scenario:
    And Старица авторизации: вводим логин "Sekretar Kompanii" и пароль "testing"
    And Открываем страницу заявки новой командировки
    And Заполняем поля командировки, в том числе: город прибытия "Sankt-Peterburg", дата выбытия "06.03.2023", дата прибытия "05.04.2023"
    And Проверяем поля, в том числе: город прибытия "Sankt-Peterburg", дата выбытия "06.03.2023", дата прибытия "05.04.2023"