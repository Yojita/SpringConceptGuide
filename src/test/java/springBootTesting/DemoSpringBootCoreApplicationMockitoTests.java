package springBootTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import springBootTesting.dto.CustomerLoginDTO;
import springBootTesting.exception.SpringBootTestingException;
import springBootTesting.repository.CustomerLoginRepository;
import springBootTesting.service.CustomerLoginService;
import springBootTesting.service.CustomerLoginServiceImpl;

@SpringBootTest
public class DemoSpringBootCoreApplicationMockitoTests {

	@Mock
	CustomerLoginRepository customerLoginRepository;

	@InjectMocks
	CustomerLoginService customerLoginService = new CustomerLoginServiceImpl();

	@Test
	public void authenticateCustomerTestValidCredentials() throws SpringBootTestingException {
		CustomerLoginDTO customer = new CustomerLoginDTO();
		customer.setLoginName("garry");
		customer.setPassword("garry123");
		Mockito.when(customerLoginRepository.getCustomerLoginByLoginName("garry")).thenReturn(customer);
		String actual = customerLoginService.authenticateCustomer(customer);
		Assertions.assertEquals("SUCCESS", actual);
	}

	@Test
	public void authenticateCustomerTestInvalidCredentials() throws SpringBootTestingException {
		CustomerLoginDTO customer = new CustomerLoginDTO();
		customer.setLoginName("garry");
		customer.setPassword("garry12");

		CustomerLoginDTO fromRepository = new CustomerLoginDTO();
		fromRepository.setLoginName("garry");
		fromRepository.setPassword("garry123");

		Mockito.when(customerLoginRepository.getCustomerLoginByLoginName("garry")).thenReturn(fromRepository);
		SpringBootTestingException exception = Assertions.assertThrows(SpringBootTestingException.class,
				() -> customerLoginService.authenticateCustomer(customer));
		Assertions.assertEquals("Service.WRONG_CREDENTIALS", exception.getMessage());
	}
}
