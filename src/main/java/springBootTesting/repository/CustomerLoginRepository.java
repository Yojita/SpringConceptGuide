package springBootTesting.repository;

import springBootTesting.dto.CustomerLoginDTO;

public interface CustomerLoginRepository {
	public CustomerLoginDTO getCustomerLoginByLoginName(String loginName);
}
