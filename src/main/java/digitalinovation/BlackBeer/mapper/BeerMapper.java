package digitalinovation.BlackBeer.mapper;

import digitalinovation.BlackBeer.dto.BeerDTO;
import digitalinovation.BlackBeer.entity.Beer;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
