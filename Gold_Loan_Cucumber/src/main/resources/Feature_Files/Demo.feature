Feature: Visit career guide page in uat.shriramcity.in
Scenario Outline: Visit uat.shriramcity.in
    Given  user applies gold loan
    When   user enter details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And    User finally apply loan
    Then   Page takes to otp verification
    Examples:
      | SheetName | RowNumber |
      | Demo      | 0         |
      | Demo      | 1         |
      
      
      
      
      