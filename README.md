# TestNG Automation: Fruit Shop Cart Validation

This project demonstrates an automated test suite for a **Fruit Shop** shopping cart using **Selenium WebDriver** and **TestNG**. The focus of this assignment is on implementing test prioritization and various TestNG assertions.

## 🎯 Assignment Objectives
*   Utilize **TestNG Annotations** (`@BeforeSuite`, `@BeforeClass`, `@AfterSuite`, etc.) to manage the test lifecycle.
*   Apply **TestNG Assertions** (`Assert.assertEquals`, `Assert.assertFalse`) to verify business logic.
*   Implement **Test Prioritization** to ensure test cases execute in the required logical order.
*   Execute tests via a **TestNG XML** configuration file.

## 🛒 Shopping Cart Scenarios
The automation script validates the following business requirements:
1.  **Cart Initialization**: The cart starts with 4 items (Oranges, Banana, Apple, Strawberry).
2.  **Item Count Check (Priority 1)**: Verify the initial cart contains exactly 4 items.
3.  **Negative Validation (Priority 2)**: Ensure "Pineapple" is NOT in the cart.
4.  **Index Validation (Priority 3)**: Verify the second item (index 1) is specifically "Banana".
5.  **Update Validation (Priority 4)**: Add "Mango" and verify the total count increases to 5.

## 🚀 How to Run

### Installation & Cloning
To copy this project, run the following command in your terminal:
```bash
git clone https://github.com/SAK3Rttv/Fruit-Shop-Test.git
```

### Execution Steps
1.  Open the project in **Eclipse**.
2.  Locate the `testng.xml` file in the project root.
3.  Right-click `testng.xml`.
4.  Select **Run As > TestNG Suite**.

## 📊 Test Execution Reports
After execution, the results can be viewed in the `test-output` folder:
*   **[View Emailable Report](./reports/emailable-report.html)**
*   **[View Interactive Index Report](./reports/index.html)**

## 📁 Project Structure
*   **`src/test/java/test/FruitShopTest.java`**: The main automation class with prioritized `@Test` methods.
*   **`testng.xml`**: Suite configuration file for running the assignment.
*   **`reports/`**: Folder containing the assignment's execution evidence.

---
*Note: This project includes custom logging to display "Welcome to the fruit shop" and "Goodbye" messages at the start and end of the suite execution.*
