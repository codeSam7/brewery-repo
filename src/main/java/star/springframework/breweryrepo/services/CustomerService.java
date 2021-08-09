package star.springframework.breweryrepo.services;

import star.springframework.breweryrepo.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
