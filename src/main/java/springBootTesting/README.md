# Writing test cases using Mockito

Unit testing should be independent of all other dependencies. This problem can be solved if somehow you can mock the behavior of dependencies. This means that you don't need to have an actual object of dependency rather, you can have a mock object which only returns the data required for testing.This is where mocking framework come into play.

# Creating and using mock objects with Mockito : 

1. @Mock : This annotation creates mock object of annotated field. (dummy object)

@Mock
CustomerLoginRepository customerLoginRepository;

2. @InjectMocks : This annotation creates object of annotated field and inject mocked dependencies.

@InjectMocks
CustomerLoginService customerLoginService = new CustomerLoginServiceImpl();

# Configuring behavior of mocked objects :

To add behavior of mocked object, Mockito provides various methods.

when() : Its a static method defined in org.mockito.Mockito class. It specifies the value returned when a method of mocked object is called.
 
Mockito.when(customerRepository.getCustomerByCustomerId(1002)).thenReturn(null);


Sometimes behavior need to be defined in the range of values or beforehand unknown values. For this you can configure mocked methods using matcher methods as follows : 

Mockito.when(customerRepository.getCustomerByCustomerId(anyInt()).thenReturn(null);

anyBoolean() : returns any boolean value

anyInt() : returns any int value

anyFloat() : returns any float value

anyDouble() : returns any double value

anyLong() : returns any long value

any() : returns any object

* The private and static methods cannot be mocked

* Do not use matcher methods as values returned by a method. For return value use exact values

* If a method has multiple arguments then you must provide all arguments either by matchers or by exact values

* The matcher methods cannot be used outside of verification or stubbing.

