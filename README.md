# thoughtworks Assignment

Problem 1:

To run the search flows use the below testng suit file
https://github.com/jagan080/thoughtworks/blob/master/src/test/resources/Suits/SearchTest.xml


Problem 2 : 

Postive Scenarios

1. When none of the date range does not overlaps --Expected Programme execution successfully--> P0 test case [Crtical]
2. When atleast two date range overlaps -----Expected Programme execution successfully------> p0 test case [Critical]

Negative Scenarios

1. When the date range is not in the expected format ----Expected Proper error message-------> p1 test case [Important]
2. In the date range, date2 is smaller than date1 -----Expected Proper error message-----> p1 test case [Important]
2. Instead of date datatype, different datatype like String or int passed ------Expected Proper error message-----> p1 test case [Important]


Logic used for pragramming :

If end date in the date range is greater than any of the start date in the date range then those both date range overlaps
The logic that I have used has time complexity o(n^2), but the same can be achieved in o(nlogn) time complexity using interval trees.

Please Find test cases in the below txt file
https://github.com/jagan080/thoughtworks/blob/master/src/test/resources/Poblem2.txt

Please find below the working programme for problem statement 2
https://github.com/jagan080/thoughtworks/blob/master/src/test/java/com/selenium/tests/OverlappingDateRanges.java
