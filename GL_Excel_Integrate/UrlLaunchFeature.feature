Feature: Visit career guide page in uat.shriramcity.in
	
  Scenario Outline: Visit uat.shriramcity.in
    Given  user applies gold loan
    When   user enter details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And    User finally apply loan "<SheetName>" and rownumber <RowNumber>
    Then   Page takes to otp verification "<SheetName>" and rownumber <RowNumber>
    Examples:
      | SheetName   | RowNumber |
      | Sheet1      | 0         |


