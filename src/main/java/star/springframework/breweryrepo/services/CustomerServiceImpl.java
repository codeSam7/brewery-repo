package star.springframework.breweryrepo.services;

import org.springframework.stereotype.Service;
import star.springframework.breweryrepo.web.model.CustomerDto;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Rama Randhi")
                .build();
    }
}
