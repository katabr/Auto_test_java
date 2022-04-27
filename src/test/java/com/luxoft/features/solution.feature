
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
  Scenario Outline: (Capture) verify city on Contacts page
    //Given "home page" page is opened
    When user go to Contacts page
    Then page contains <City>
    Examples:
      | City            |
      # positive
      | Москва          |
      | Санкт-Петербург |
      | Омск            |
    Then page does not contain <City>

      # negaive
      | Екатеринбург    |


  @tasks4
  Scenario: find course on Catalog page
  //Given "home page" page is opened
    When user goes to Catalog page
    And  user requests SQA-050
    Then page contains CourseLink
