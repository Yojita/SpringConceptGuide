# Guide to DI

Can add custom code during bean initialization
And can also add custom code during bean destruction

1. Init : method configuration : @PostConstruct 
Code will execute after constructor and after injection of dependencies

2. Destroy : method configuration : @Predestroy
Code will execute before bean is destroyed