SOLID->
	S- Single Responsibility of Principle
	O- Open/ Closed Principle
	L- Liskov Substitution Principle
	I- Interface Segmented Principle
	D- Dependency Inversion Principle

Advantages of SOLID Principle
- Help us to write better code
	- Avoid Duplicate code
	- Easy to maintain
	- Easy to understand
	- Flexible software
	- Reduce Complexity

Single Responsibility Principle:
- **A class should have only 1 reason to change**
- We need to create a separate class for each feature

Open/Closed Principle
- **Open for Extension but closed for Modification**
- Don't modify the existing classes instead of that we can create a new class and extend it with existing class so we can use of features and also add a new features.

Liskov Substitution Principle
- **If Class B is subtype of Class A, then we should be able to replace the object of A with B without breaking of the program.**
- We need to add more features in subclass instead of reducing the feature.
- Subclass should extend the capabilities of parent class rather than narrow it down.

Interface Segmented Principle
- **Interface should be such, that client should not implement unnecessary functions they do not need.**
- Interface should be like this it does not contain a unnecessary functions.
- Divide interface in small parts according to need.

Dependency Inversion Principle
- **Class should depend on Interface rather than Concrete classes.**
	- Don't use a concrete classes instead of that use Interfaces. 