package springBootTesting.service;

import springBootTesting.dto.CustomerLoginDTO;
import springBootTesting.exception.SpringBootTestingException;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws SpringBootTestingException;
}
