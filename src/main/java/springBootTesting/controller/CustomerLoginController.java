package springBootTesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import springBootTesting.dto.CustomerLoginDTO;
import springBootTesting.exception.SpringBootTestingException;
import springBootTesting.service.CustomerLoginService;

@Controller(value = "customerLoginController")
public class CustomerLoginController {
	@Autowired
	private CustomerLoginService customerLoginService;

	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws SpringBootTestingException {
		return customerLoginService.authenticateCustomer(customerLoginDTO);

	}
}
