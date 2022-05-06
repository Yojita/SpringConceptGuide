package springBootTesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootTesting.dto.CustomerLoginDTO;
import springBootTesting.exception.SpringBootTestingException;
import springBootTesting.repository.CustomerLoginRepository;

@Service(value = "customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;

	@Override
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws SpringBootTestingException {
		String toRet = null;
		CustomerLoginDTO customerLoginFromRepository = customerLoginRepository
				.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toRet = "SUCCESS";
		} else {
			throw new SpringBootTestingException("Service.WRONG_CREDENTIALS");
		}
		return toRet;
	}

}
