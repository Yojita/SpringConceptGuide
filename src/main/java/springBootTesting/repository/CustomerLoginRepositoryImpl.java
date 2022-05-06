package springBootTesting.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import springBootTesting.dto.CustomerLoginDTO;

@Repository(value = "customerLoginRepository")
public class CustomerLoginRepositoryImpl implements CustomerLoginRepository {

	@Override
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName) {

		Map<String, String> customerCredentials = new HashMap<>();
		customerCredentials.put("robin", "robin123");
		customerCredentials.put("harry", "harry123");
		customerCredentials.put("marry", "marry123");
		customerCredentials.put("garry", "garry123");

		CustomerLoginDTO customerLogin = new CustomerLoginDTO();
		customerLogin.setLoginName(loginName);
		customerLogin.setPassword(customerCredentials.get(loginName));
		return customerLogin;
	}

}
