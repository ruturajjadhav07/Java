# What is modifiers..?

*Modifiers are keywords that are used to control the visibility, access, and behavior of classes, methods, variables, and other program*

| Modifier    | Class | Package | Subclass | Outside Package |
|-------------|-------|---------|----------|-----------------|
| `public`    | ✓     | ✓       | ✓       | ✓               |
| `private`   | ✓     | X       | X        | X               |
| `protected` | ✓     | ✓       | ✓        | X               |
| `(default)` | ✓     | ✓       | X         | X               |

## public: 
*Accessible from anywhere, both within the class, from any other class, within the same package, or from any other package.*
## private: 
*Accessible only within the same class. Not accessible from outside the class, including subclasses.*
## protected: 
*Accessible within the same class, subclasses (even if they are in different packages), and within the same package.*
## default: 
*Accessible within the same package but not from outside the package. This means that if no access modifier is specified, it defaults to package-private access.*
