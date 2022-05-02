# Guide to IOC

IOC is the approach of outsourcing the construction and management of objects.

Annotations

@Component is a general purpose annotation to mark class as spring bean

@Configuration defines configuration class. 

@componentScan used when you want component to be included from non sub packages of the class annotated with componentScan, because it scans base and sub packages.

@SpringBootApplication is the combination of SpringBootConfiguration, EnableAutoConfiguration, ComponentScan.