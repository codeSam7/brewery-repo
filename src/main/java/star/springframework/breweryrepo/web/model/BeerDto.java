package star.springframework.breweryrepo.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by Rama
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;

    private Long upc;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private BeerStyleEnum beerStyle;

    private BigDecimal price;
    private Integer quantityOnHand;


}
