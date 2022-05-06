package springBootTesting;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import springBootTesting.dto.CustomerLoginDTO;
import springBootTesting.exception.SpringBootTestingException;
import springBootTesting.service.CustomerLoginService;

@SpringBootTest
public class DemoSpringBootCoreApplicationTests {
	@Autowired
	CustomerLoginService customerLoginService;

	@Test
	public void authenticateCustomerTestValidCredentials() throws SpringBootTestingException {
		CustomerLoginDTO customer = new CustomerLoginDTO();
		customer.setLoginName("garry");
		customer.setPassword("garry123");
		String result = customerLoginService.authenticateCustomer(customer);
		Assertions.assertEquals("SUCCESS", result);
	}

	@Test
	public void authenticateCustomerTestINValidCredentials() throws SpringBootTestingException {
		CustomerLoginDTO customer = new CustomerLoginDTO();
		customer.setLoginName("garry");
		customer.setPassword("garry12");
		SpringBootTestingException exception = assertThrows(SpringBootTestingException.class,
				() -> customerLoginService.authenticateCustomer(customer));
		Assertions.assertEquals("Service.WRONG_CREDENTIALS", exception.getMessage());
	}
}
