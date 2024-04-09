Feature: Navigation bar
        To see the subpages
        withour loggion in
        I can click the navigation bar links

Scenario: I can access the subpages through the navigation bar
    Given I navigate to www.freerangetester.com
    When I try to acces the free sections through the navigation bar
    Then I am redirected to the right page

