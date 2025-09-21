# LeetCode Java Solutions

A collection of **Java solutions** to LeetCode problems, organized by difficulty, with **JUnit tests** for each solution.

---

## 📂 Folder Structure

```
Easy/      → Solutions for Easy problems
Medium/    → Solutions for Medium problems
Hard/      → Solutions for Hard problems
tests/     → JUnit test files for each solution
lib/       → JUnit and Hamcrest libraries
```

---

## 📝 How to Run Tests Locally

1. **Compile solution and test files** (from project root):

```bash
javac -cp ".;lib/*" Easy/YourSolution.java tests/Easy/YourSolutionTest.java
```

2. **Run the JUnit tests**:

```bash
java -cp ".;lib/*" org.junit.runner.JUnitCore tests.Easy.YourSolutionTest
```

> Replace `YourSolution` and `YourSolutionTest` with the actual file/class names.

---

## 🚀 Example

For the first problem, `IntersectionOfTwoArraysII`:

**Compile:**

```bash
javac -cp ".;lib/*" Easy/IntersectionOfTwoArraysII.java tests/Easy/IntersectionOfTwoArraysIITest.java
```

**Run Test:**

```bash
java -cp ".;lib/*" org.junit.runner.JUnitCore tests.Easy.IntersectionOfTwoArraysIITest
```

All tests should pass if the solution is correct.

---

## ✨ Contributing

1. Add new solutions under the appropriate difficulty folder (`Easy/`, `Medium/`, `Hard/`).  
2. Add a matching JUnit test under `tests/` with the same package structure.  
3. Commit and push your changes to keep the repo updated.

---

## 💡 Notes

* Each solution should be self-contained with proper class and method names.  
* Tests use **JUnit 4**. Make sure `lib/junit-4.13.2.jar` and `lib/hamcrest-core-1.3.jar` are present.  
* Keep naming consistent for readability and maintainability.

---

**Happy coding!** 🚀
