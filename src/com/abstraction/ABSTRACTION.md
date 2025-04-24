---

### 🔍 **Unlike interfaces, abstract classes support:**
---

#### 🔹 **1. Fields (Instance Variables)**
```java
abstract class Animal {
    int age; // This is a field (also called an instance variable)
}
```

- Abstract classes **can have variables** with values.
- You can also **initialize**, **use**, and even **inherit** these variables in subclasses.
- **Interfaces** before Java 8 couldn’t have instance variables — only `public static final` constants (basically fixed values).

---

#### 🔹 **2. Constructors**
```java
abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}
```

- Abstract classes **can have constructors**.
- Even though you can’t create objects of an abstract class directly, its constructor **runs when a subclass object is created**.
- **Interfaces cannot have constructors** at all — they’re not part of the object’s construction chain.

---

#### 🔹 **3. Access Modifiers**
```java
abstract class Animal {
    protected abstract void makeSound();  // This is allowed
}
```

- Abstract class methods and variables can have **any access modifier**:
  - `private`, `protected`, `public`, or package-private (default).
- In **interfaces**, all methods (before Java 9) are **implicitly public and abstract**.
  - Even if you forget to write `public`, Java assumes it.

---

### 📌 Quick Comparison Chart:

| Feature            | Abstract Class     | Interface                 |
|--------------------|--------------------|----------------------------|
| Can have fields?   | ✅ Yes              | ⚠️ Only `public static final` constants |
| Can have constructors? | ✅ Yes          | ❌ No                     |
| Can have access modifiers? | ✅ Yes (any) | ⚠️ Limited (mostly `public`) |
| Can have non-abstract methods? | ✅ Yes   | ✅ Since Java 8 (default & static only) |
| Multiple inheritance? | ❌ No (single only) | ✅ Yes (can implement multiple interfaces) |

---

### ✅ Example to Show Constructor Behavior:
```java
abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

// Output:
// Animal constructor called
// Dog constructor called
```
> Even though you can’t do `new Animal()`, its constructor still runs when a subclass like `Dog` is created.

---

