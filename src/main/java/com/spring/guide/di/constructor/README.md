# Guide to DI

DI(dependency injection) is a design pattern which gives instances to the object which requires it.

dependency is an approach to get resource(instance of A class) directly by new keyword
A obj = new AImpl(); 

problems with this approach is 
Tight coupling which makes code tightly coupled. If resource get changed we need to perform a lot of modification in the code.

There are three ways of dependency injection in Spring framework 
1. Constructor Injection
2. Setter Injection
3. Field Injection

@Autowired annotation 
If one bean class is dependent on other bean class then dependency should be explicitely defined.But spring IOC container inject the dependency into dependent classes without defining, is called as autowiring.

