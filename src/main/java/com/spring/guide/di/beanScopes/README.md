# Guide to DI

Bean Scope 

Default scope is singleton

Spring container contains only one instance of the bean by default

It is cached in memory

All request for the bean will return a SHARED reference to the same bean

Prototype Scope : new object for each request

Can add custom code during bean initialization and can also add custom code during bean destruction

1. Init : method configuration : @PostConstruct 

Code will execute after constructor and after injection of dependencies

2. Destroy : method configuration : @Predestroy

Code will execute before bean is destroyed




