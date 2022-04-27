
@tasks
Feature: Selenium test task2, task3
#  Background:
#    Given Home page 'https://www.luxoft-training.ru/' is opened



  @tasks2
  Scenario Outline: verify buttons on timetable page
    //Given "home page" page is opened
    When User go to Timetable page
    Then Page contains button "<Button>"
    Examples:
      | Button              |
      | Расписание          |
      | Бесплатные семинары |
      | On-line курсы       |

  @tasks3
  Scenario Outline: verify city on Contacts page
    //Given "home page" page is opened
    When user go to Contacts page
    Then page contains city "<City>"
    Examples:
      | City            |
      # positive
      | Москва          |
      | Санкт-Петербург |
      | Омск            |
      # negaive
      | Екатеринбург    |
