package star.springframework.breweryrepo.services;

import org.springframework.stereotype.Service;
import star.springframework.breweryrepo.web.model.BeerDto;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("BlueMoon")
                .beerStyle("Belgium Ale")
                .build();

    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    public void updateBeer(UUID beerId, BeerDto beerDto){


    }
}
