
@task2
Feature: Selenium test task2

  Scenario: verify buttons on timetable page
    Given "home page" page is opened
    When user go to "timetable" page
    Then page contains button
      | Расписание          |
      | Бесплатные семинары |
      | On-line курсы       |


