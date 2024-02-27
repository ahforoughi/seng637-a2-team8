**SENG 637 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:      |     |
| -------------- | --- |
|Student Names |     |
|Amir Allahveran                 |  30216696   |
|Sephr Ganji                |   30223725  |
|Zahra Arabi Narei         |  30191990   |
|Sara Montajab          |  30221523   |
|Amirhossein Foroughi          |  30228075   |


# 1 Introduction

During this assignment, we explored how to automate unit testing using JUnit within the Eclipse IDE. We developed unit tests for ten functions across two classes from the JFreeChart library, specifically targeting the DataUtilities and Range classes.

We focused on testing methods from the DataUtilities and Range classes and employed the following libraries for our testing purposes:
1. JUnit for Java testing
2. JMock for mocking dependencies

Following the laboratory instructions, we set up the IDE and installed the required libraries. We then began by examining modified JavaDocs provided in the artifact files to understand the expected behavior of the functions. Next, we drafted test scenarios on paper to ensure comprehensive coverage of all possible test cases. Finally, we implemented these scenarios in our test classes, translating our paper-based plans into executable tests.

# 2 Detailed description of unit test strategy

To evaluate the various functions of the two classes, we employed black-box testing strategies for designing test cases.

For all methods related to ranges, we utilized the equivalence class partitioning technique to categorize similar values for lower and upper bounds in the sample ranges. Most of the values encompassed a mix of positive and negative numbers. Detailed descriptions of the test cases for each function are provided below:

## 2.1. Class Range
- rangeGetUpperBoundValueMethodTest() 

- rangeGetLowerBoundMethodTest() 

- rangeGetLengthMethodTest() 

- rangeContainsMethodTest() 

- rangeTest() 


## 2.2. Class **DataUtilities**
- calculateColumnTotal() 

- equal() 

- calculateRowTotal() 

- reateNumberArray() 

- createNumberArray2D() 

- getCumulativePercentages() 

# 3 Test cases developed

## 3.1 Class DataUtilities:


###  3.1.1 DataUtilities.createNumberArray2D
- **createNumberArrayWithThreeNumbers()**
    - This test case employs a for loop to traverse the **numArrayData** array, which is presumed to contain three numbers. During each loop iteration, the test case invokes the **createNumberArray** method, passing the first element of **numArrayData** as a parameter. It then checks whether the resulting array of numbers matches the expected value stored in **numArrayData**. The purpose of this test case is to ascertain whether the **createNumberArray** method successfully generates an array of numbers that aligns with the anticipated values in **numArrayData**. If the outcome array diverges from the expected values, the test case will fail, and the message "Number array was not created." will be displayed.

### 3.1.2 DataUtilities.calculateColumnTotal
- **calculateColumnTotal_ValidColAndPosData_SumOfValues()** 
    - This test case verifies the **calculateColumnTotal** method when the input data contains positive values like (7.5, 2.5). It checks if the method correctly calculates the sum of values in a specified column.

- **calculateColumnTotal_ValidColAndNegData_SumOfValues()**
    - This test case checks the **calculateColumnTotal** method when the input data contains negative values like (-7.5, -2.5). It ensures that the method accurately calculates the sum of values in a specified column.

- **calculateColumnTotal_ValidColAndNegAndPosData_SumOfValues()**
    - This test case tests the **calculateColumnTotal** method when the input data contains both negative and positive values like (-7.5, 2.5). It verifies if the method correctly calculates the sum of values in a specified column.

- **calculateColumnTotal_ValidColAndZeroData_SumOfValues()**
    - This test case evaluates the **calculateColumnTotal** method when the input data contains zero values. It checks if the method accurately calculates the sum of values in a specified column, which should be zero in this case.

- **calculateRowTotal_ValidColAndPosData_SumOfValues()**
    - This test case tests the **calculateRowTotal** method when the input data contains positive values like (7.5, 2.5). It takes a mock Values2D object as input and focuses specifically on row 1, checking if the method correctly calculates the sum of values in that row.

- **calculateRowTotal_ValidColAndNegData_SumOfValues()**
    - This test case evaluates the **calculateRowTotal** method when the input data contains negative values like (-6, -2.5, -4). It takes a mock Values2D object as input and focuses specifically on row 1, ensuring that the method accurately calculates the sum of values in that row.

### **3.1.3 DataUtilities.getCumulativePercentages** 
- **getCumulativePercentageWithThreeKeysFirstNum()**
    - This test case utilizes a **KeyedValue** mock object with keys: 0, 1, 2, and values: 1, -2.5, 11. The **getCumulativePercentages** method calculates a cumulative percentage value for each key. In this test case, we focus on the cumulative percentage value for the first key, which should be equal to 1 / (1 + (-2.5) + 11) = 0.10526...

- **getCumulativePercentageWithThreeKeysSecondNum()**
    - This test case employs a **KeyedValue** mock object with keys: 0, 1, 2, and values: 1, -2.5, 11. The **getCumulativePercentages** method calculates a cumulative percentage value for each key. In this test case, we examine the cumulative percentage value for the second key, which should be equal to (1 + (-2.5)) / (1 + (-2.5) + 11) = -0.1578...

- **getCumulativePercentageWithThreeKeysThirdNum()**
    - This test case utilizes a **KeyedValue** mock object with keys: 0, 1, 2, and values: 1, -2.5, 11. The **getCumulativePercentages** method calculates a cumulative percentage value for each key. In this test case, we focus on the cumulative percentage value for the last key, which should be equal to (1 + (-2.5) + 11) / (1 + (-2.5) + 11) = 1




### 3.1.4 DataUtilities.createNumberArray 
- **createNumberArrayWithThreeNumbers()**
    - This test case uses a **for** loop to iterate over the **numArrayData** array, which is expected to contain three numbers. During each iteration, the test case invokes the **createNumberArray** method with the first element of **numArrayData** as a parameter and checks whether the returned array of numbers matches the expected value stored in **numArrayData**. The test case aims to verify that the **createNumberArray** method correctly creates an array of numbers that corresponds to the expected values in **numArrayData**. If the returned array does not match the expected values, the test case will fail, and the message "Number array was not created." will be displayed.

## 3.2. Class Range: 
### 3.2.1 range.getCentralValue 
- **testGetCentralValue_PositiveRange_ReturnsCorrectValue()** 
    - This test case verifies that the **getCentralValue()** method correctly returns the central value of a positive range. The Range object is created with a lower bound of 1.0 and an upper bound of 10.0, and the expected central value is 5.5. The test checks if the method returns this expected value with no tolerance for error.

- **testGetCentralValue_NegativeRange_ReturnsCorrectValue()** 
    - This test case checks if the **getCentralValue()** method correctly returns the central value for a range that consists of negative numbers. A Range object is created with a lower bound of -10.0 and an upper bound of -1.0, and the expected central value is -5.5. The test asserts that the method returns this expected value with no tolerance for error.

- **testGetCentralValue_ZeroRange_ReturnsCorrectValue()** 
    - This test case verifies that the **getCentralValue()** method correctly returns the central value of a range with zero length. A Range object is created with both lower and upper bounds equal to 0.0, and the expected central value is 0.0. The test checks if the method returns this expected value with no tolerance for error.

- **testGetCentralValue_InfiniteRange_ReturnsCorrectValue()** 
    - This test case checks if the **getCentralValue()** method correctly returns the central value for a range with an infinite upper bound. A Range object is created with a lower bound of 1.0 and an upper bound of positive infinity, and the expected central value is positive infinity. The test asserts that the method returns this expected value with no tolerance for error.

- **testGetCentralValue_InfiniteReversedRange_ReturnsCorrectValue()** 
    - This test case verifies that the **getCentralValue()** method correctly returns the central value for a range with a negative infinite lower bound. A Range object is created with a lower bound of negative infinity and an upper bound of 1.0, and the expected central value is negative infinity. The test checks if the method returns this expected value with no tolerance for error.

### 3.2.2 Range.contains 
- **testContains_PositiveRange_ReturnsCorrectValue()** 
    - This test case checks if the **contains()** method correctly identifies that a positive value is within a positive range. The test will pass if the method returns **true** for a value that is within the range.

- **testContains_PositiveRange_ReturnsFalseForValueLessThanMin()** 
    - This test case verifies that the **contains()** method correctly returns **false** for a value that is less than the minimum value of a positive range. The test will pass if the method correctly identifies that the value is not within the range.

- **testContains_PositiveRange_ReturnsFalseForValueGreaterThanMax()** 
    - This test case checks if the **contains()** method correctly returns **false** for a value that is greater than the maximum value of a positive range. The test will pass if the method correctly identifies that the value is not within the range.

- **testContains_NegativeRange_ReturnsCorrectValue()** 
    - This test case verifies that the **contains()** method correctly identifies that a negative value is within a negative range. The test will pass if the method returns **true** for a value that is within the range.

- **testContains_NegativeRange_ReturnsFalseForValueLessThanMin()** 
    - This test case checks if the **contains()** method correctly returns **false** for a value that is less than the minimum value of a negative range. The test will pass if the method correctly identifies that the value is not within the range.

- **testContains_NegativeRange_ReturnsFalseForValueGreaterThanMax()** 
    - This test case verifies that the **contains()** method correctly returns **false** for a value that is greater than the maximum value of a negative range. The test will pass if the method correctly identifies that the value is not within the range.

- **testContains_ZeroRange_ReturnsCorrectValue()** 
    - This test case checks if the **contains()** method correctly identifies that a value of zero is within a range with both lower and upper bounds equal to zero. The test will pass if the method returns **true** for a value of zero.

- **testContains_ZeroRange_ReturnsFalseForNonZeroValue()** 
    - This test case verifies that the **contains()** method correctly returns **false** for any non-zero value when the range has both lower and upper bounds equal to zero. The test will pass if the method correctly identifies that a non-zero value is not within the range.

### 3.2.3 range.getLowerBound 
- **testGetLowerBound_PositiveRange_ReturnsCorrectLowerBound()** 
    - This test case verifies that the **getLowerBound()** method correctly returns the lower bound of a positive range. A **Range** object is created with a lower bound of 1.0 and an upper bound of 10.0. The test checks if the method returns 1.0 and passes if the result matches the expected value exactly.

- **testGetLowerBound_NegativeRange_ReturnsCorrectLowerBound()** 
    - This test case checks if the **getLowerBound()** method correctly returns the lower bound of a negative range. A **Range** object is created with a lower bound of -10.0 and an upper bound of -1.0. The test verifies that the method returns -10.0 and passes if the result is exactly as expected.

- **testGetLowerBound_ZeroRange_ReturnsCorrectLowerBound()** 
    - This test case verifies that the **getLowerBound()** method correctly returns the lower bound of a range where both lower and upper bounds are zero. A **Range** object is created with both bounds set to 0.0. The test checks if the method returns 0.0 and passes if the result is exactly as expected.

- **testGetLowerBound_InfiniteRange_ReturnsCorrectLowerBound()** 
    - This test case checks if the **getLowerBound()** method correctly returns the lower bound of a range with an infinite lower bound. A **Range** object is created with a lower bound of **Double.NEGATIVE_INFINITY** and an upper bound of 10.0. The test verifies that the method returns **Double.NEGATIVE_INFINITY** and passes if the result is exactly as expected.

- **testGetLowerBound_InfiniteReversedRange_ReturnsCorrectLowerBound()** 
    - This test case verifies that the **getLowerBound()** method correctly returns the lower bound of a range with an infinite upper bound. A **Range** object is created with a lower bound of 10.0 and an upper bound of **Double.POSITIVE_INFINITY**. The test checks if the method returns 10.0 and passes if the result is exactly as expected.

### 3.2.4 range.getLength()
- **testGetLength_PositiveRange_ReturnsCorrectLength()** 
    - This test case verifies that the **getLength()** method correctly calculates the length of a positive range. A **Range** object is created with a lower bound of 1.0 and an upper bound of 10.0. The test checks if the method returns 9.0, which is the difference between the upper and lower bounds, and passes if the result matches exactly.

- **testGetLength_NegativeRange_ReturnsCorrectLength()** 
    - This test case checks if the **getLength()** method correctly calculates the length of a negative range. A **Range** object is created with a lower bound of -10.0 and an upper bound of -1.0. The test verifies that the method returns 9.0, which is the difference between the upper and lower bounds, and passes if the result is exactly as expected.

- **testGetLength_ZeroRange_ReturnsCorrectLength()** 
    - This test case verifies that the **getLength()** method correctly calculates the length of a range where both lower and upper bounds are zero. A **Range** object is created with both bounds set to 0.0. The test checks if the method returns 0.0 and passes if the result is exactly as expected.

- **testGetLength_InfiniteRange_ReturnsCorrectLength()** 
    - This test case checks if the **getLength()** method correctly calculates the length of a range with an infinite upper bound. A **Range** object is created with a lower bound of 1.0 and an upper bound of **Double.POSITIVE_INFINITY**. The test verifies that the method returns **Double.POSITIVE_INFINITY** and passes if the result is exactly as expected.

- **testGetLength_InfiniteReversedRange_ReturnsCorrectLength()** 
    - This test case verifies that the **getLength()** method correctly calculates the length of a range with a negative infinite lower bound. A **Range** object is created with a lower bound of **Double.NEGATIVE_INFINITY** and an upper bound of 1.0. The test checks if the method returns **Double.POSITIVE_INFINITY** and passes if the result is exactly as expected.

### 3.2.5 range.getUpperBound 
As same as **getLowerBound** method:
- **testGetUpperBound_PositiveRange_ReturnsCorrectUpperBound()**  
- **testGetUpperBound_NegativeRange_ReturnsCorrectUpperBound()** 
- **testGetUpperBound_ZeroRange_ReturnsCorrectUpperBound()** 
- **testGetUpperBound_InfiniteRange_ReturnsCorrectUpperBound()** 
- **testGetUpperBound_InfiniteReversedRange_ReturnsCorrectUpperBound()**

# 4 How the team work/effort was divided and managed

The team work and effort were divided and managed as follows:

- The classes for the project were divided into two groups for testing purposes. This division allowed for a focused approach to testing, ensuring that each class received the necessary attention and validation.
- Two students were assigned to work on the class Range, while the other two students focused on the class DataUtilities. This distribution of tasks ensured that each class had dedicated team members working on it, allowing for a thorough examination and testing of each class's functionality.
- The team held a meeting to discuss testing strategies and how different scenarios should be tested. This collaborative approach ensured that all team members were aligned on the testing approach and that the testing covered a wide range of scenarios to ensure the robustness of the classes.

Overall, the team's work and effort were managed through a structured division of tasks, with clear responsibilities assigned to each team member, and a collaborative approach to discussing and deciding on testing strategies.
# 5 Difficulties encountered, challenges overcome, and lessons learned
- Bug Localization: The focus of our testing is on the class under test itself, rather than its dependencies. By isolating the class, we can pinpoint the method that is causing the failure. This approach enables us to identify the root of the problem and address it effectively.

- Cost of Calling External Methods: We encounter challenges when dependent methods are not callable, such as when they return values outside the expected range. This leads to Unexpected Return Values, which can disrupt our testing strategy. Additionally, these methods may not provide the precise values we need for our tests. To overcome this, we can employ mocking techniques, which allow us to simulate the behavior of these external methods in a controlled manner, facilitating a more efficient and smooth testing process.

- Lack of Interaction Testing: One significant limitation of mocking is the inability to test interactions between methods. If a mocked method is invoked incorrectly, this issue will not be captured by our tests. To ensure comprehensive coverage, we need to supplement our unit tests with additional integration testing, which can validate the interactions between different components of our system.

- Increased Development Time: Implementing mocking can significantly extend the development process. For each method that is mocked, we need to define its expected return value, which adds complexity and time to the development cycle. This additional effort is necessary to ensure that our mocks accurately represent the behavior of the real dependencies, but it can slow down the overall progress of the project.

# 6 Comments/feedback on the lab itself

The lab experience was overall positive, with a few areas for improvement:

1. **Strengths:**
   - The lab provided a practical application of software testing principles, allowing us to apply theoretical knowledge to a real-world scenario.
   - The division of the project into distinct classes (Range and DataUtilities) helped in focusing our efforts and understanding the responsibilities of each component.
   - The collaborative aspect of the lab, where we discussed testing strategies and scenarios, enhanced our teamwork skills and allowed for a more comprehensive testing approach.

2. **Areas for Improvement:**
   - Additional guidance on mocking techniques would have been beneficial, as it was a challenging aspect of the lab. More examples or a brief tutorial could help clarify the concept and its application.
   - The lab could have included more explicit instructions on how to handle edge cases and unusual scenarios in testing, as this is a critical aspect of thorough testing.


3. **Suggestions for Future Labs:**
   - Incorporating a peer review process where teams can review each other's test cases and provide feedback could enhance the learning experience and improve the quality of tests.
   - Introducing a session on test-driven development (TDD) could provide a different perspective on software testing and complement the current lab structure.
   - Adding a component on performance testing could broaden the scope of the lab and provide a more holistic understanding of software testing.

Overall, the lab was a valuable learning experience, providing both practical skills in software testing and insights into teamwork and collaboration. With some enhancements, it could offer an even more comprehensive and engaging learning opportunity.
