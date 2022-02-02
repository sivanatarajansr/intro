Feature: validating adactin hotel application
Scenario Outline: validating orderid generation   
Given user is on adactin login page on chrome browser
When user enter "<username>" and "<password>"
And click login button  
When user enter  "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrenPerRoom>" 
And click search button
When user select hotel
And click continue button
When user enter "<firstName>","<lastName>","<address>","<cardNo>","<cardType>","<selectMonth>","<selectYear>","<ccv>"
And click booknow
Then order no is generated
	
	Examples:
	|username|password|location|hotels|roomType|noOfRooms|checkInDate|checkOutDate|adultsPerRoom|childrenPerRoom|firstName|lastName|address|cardNo|cardType|selectMonth|selectYear|ccv|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
	|sivanatarajan|123456|Melbourne|Hotel Sunshine|Standard|2 - Two|05/02/2022|06/02/2022|2 - Two|2 - Two|aswin|kumar|poiuytrewq|9887766554433221|VISA|October|2022|223|
				