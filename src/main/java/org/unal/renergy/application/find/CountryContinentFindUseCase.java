package org.unal.renergy.application.find;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.unal.renergy.domain.repository.CountryContinentRepository;
import org.unal.renergy.domain.model.CountryContinent;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryContinentFindUseCase {

    private final CountryContinentRepository countryContinentRepository;

    public List<CountryContinent> findAll() {
        return countryContinentRepository.findAll();
    }
}
