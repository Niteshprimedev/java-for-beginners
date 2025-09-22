# Java Primitive Data Types 📘

Java provides **8 primitive data types** that are the most basic building blocks of data manipulation.  
They are not objects and hold their values directly in memory for fast access.

---

## 🔹 List of Primitive Types

### `byte`

- Size: **8 bits**
- Range: **-128 to 127**
- Example:
  ```java
  byte smallNumber = 100;
  System.out.println(smallNumber); // 100
  ```

## `short`

- Size: **16 bits**
- Range: **-32,768 to 32,767**
- Example:
  ```java
  short mediumNumber = 20000;
  System.out.println(mediumNumber); // 20000
  ```

## `int`

- Size: **32 bits**
- Range: **-2,147,483,648 to 2,147,483,647**
- Example:
  ```java
  int myAge = 30;
  System.out.println(myAge); // 30
  ```

## `long`

- Size: **64 bits**
- Range: **-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807**
- Example:
  ```java
  long highestIncome = 2000000000;
  System.out.println(highestIncome); // 2000000000
  ```

## `float`

- Size: **32 bits**
- Range Approx: **±3.40282347E+38F (7 decimal digits precision)**
- Example:
  ```java
  long pi = 3.14f;
  System.out.println(pi); // 3.14
  ```

## `double`

- Size: **64 bits**
- Range Approx: **±1.79769313486231570E+308 (15 decimal digits precision)**
- Example:
  ```java
  long height = 1.74;
  System.out.println(height); // 1.74
  ```

### `char`

- Size: **16 bits**
- Range: **0 to 65,535 (unsigned)**
- Example:
  ```java
  char myFavLetter = 'S';
  System.out.println(myFavLetter); // S
  ```

### `boolean`

- Size: **1 bit**
- Value: **true or false**
- Example:
  ```java
  boolean isHired = true;
  System.out.println(isHired); // true
  ```

## Summary:

- byte, short, int, long → integer numbers (differ in size and range).
- float, double → floating-point (decimal) numbers (differ in precision).
- char → single character (Unicode).
- boolean → logical values (true / false).

_These primitive types form the foundation of Java variables and memory efficiency._
