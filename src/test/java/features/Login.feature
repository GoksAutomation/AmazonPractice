
@tag
Feature: AmazonAutomation

  @login
  Scenario Outline: Login to application
    Given Launch the url <BaseUrl> to login
    When enter <username> and <password> in the sign in page
    Then login should be successful

    Examples: 
      | BaseUrl  | username | password  |
      | https://www.amazon.in/your-account |     7899356800	 | Goks@123  |
      
