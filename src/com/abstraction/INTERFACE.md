---
### 📁 **Package Declaration**
```java
package com.abstraction;
// Organizes your interface into a package.
// Useful for avoiding naming conflicts and managing files in large projects.
```

---

### 🔷 **Interface Declaration**
```java
public interface Interface1 {
// 'interface' defines a blueprint that other classes agree to follow.
// Interfaces can contain abstract methods (without body) and since Java 8, can also have default and static methods.
```

---

### 🔸 **Variables in Interfaces**
```java
	int variable = 1; 
// All variables in interfaces are implicitly:
// - public
// - static
// - final
// This means:
// 1. It's a constant (can't change)
// 2. Belongs to the interface itself, not objects
// 3. Accessible globally if imported
//
// Note: You don't have to write `public static final`, Java adds it automatically.
```

---

### 🔒 **Private Method in Interface**
```java
	private void privMeth() { }
// Since Java 9, interfaces can have private methods.
// These are **helper methods** used only within the interface (e.g., inside default/static methods).
// Cannot be accessed or overridden outside.
```

---

### 🔧 **Abstract Methods in Interface**
```java
	abstract void abstractMeth();
	void MethSignature();
// Both are abstract methods – they have no body.
// In interfaces, methods are abstract by default (even if 'abstract' is not written).
// All implementing classes must provide definitions for them.
```

---

### ❌ **Invalid Method (Commented Out)**
```java
//	void Concretemeth() {
//		System.out.println("HI");
//	} 
// This is not allowed in interfaces (unless it's a default or static method).
// Regular methods with body are illegal unless marked 'default' or 'static' (since Java 8).
```

---

### ✅ **Default Method in Interface**
```java
	default void DefaultMeth() {
		System.out.println("Default Method");
	}
// Since Java 8, interfaces can have 'default' methods (with a body).
// These are used to provide a **default implementation** that a class can use or override.
// Helps avoid breaking existing code when adding new methods to an interface.
```

---

### ✅ **Static Method in Interface**
```java
	static void StaticMeth() {
		System.out.println("Static Method ");
	}
// Also added in Java 8.
// Static methods belong to the interface itself — not the class that implements it.
// Called using Interface1.StaticMeth(), not via objects or implementations.
```

---

### 📘 **Summary: Interface Method Types (Modern Java)**
| Method Type   | Keyword   | Body Allowed? | Overridable? | Since Java |
|---------------|-----------|----------------|--------------|-------------|
| Abstract      | (implicit or `abstract`) | ❌ No         | ✅ Yes       | All versions |
| Default       | `default` | ✅ Yes         | ✅ Yes       | Java 8     |
| Static        | `static`  | ✅ Yes         | ❌ No        | Java 8     |
| Private       | `private` | ✅ Yes         | ❌ No        | Java 9     |

---

### ⚠️ Key Differences vs Abstract Classes
```java
// Interfaces (older versions):
// - Could not have any implementation (all methods were abstract).
// - All variables are public static final (constants).
//
// Interfaces (Java 8+):
// - Can have default and static methods with bodies.
// - Can use private methods (Java 9+) internally.
// - Still can't have constructors or instance variables (non-static fields).
```

---