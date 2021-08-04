package star.springframework.breweryrepo.services;

import star.springframework.breweryrepo.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

}
