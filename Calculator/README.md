# Calculator Package

The Calculator package provides a simple implementation of basic arithmetic operations. It includes four classes: `Add`, `Sub`, `Mul`, and `Div`, each designed to perform a specific mathematical operation.

## Classes

### 1. Add
- **Method**: `sol(int a, int b)`
- **Description**: Returns the sum of two integers `a` and `b`.

### 2. Sub
- **Method**: `sol(int a, int b)`
- **Description**: Returns the difference of two integers `a` and `b` (i.e., `a - b`).

### 3. Mul
- **Method**: `sol(int a, int b)`
- **Description**: Returns the product of two integers `a` and `b`.

### 4. Div
- **Method**: `sol(int a, int b)`
- **Description**: Returns the quotient of two integers `a` and `b` (i.e., `a / b`). This method includes a check to avoid division by zero.

## Usage

To use the Calculator package, create an instance of the desired class and call the `sol` method with the required parameters. For example:

```java
Add addition = new Add();
int result = addition.sol(5, 3); // result will be 8
```

This package is designed for educational purposes and can be extended to include more complex mathematical operations as needed.