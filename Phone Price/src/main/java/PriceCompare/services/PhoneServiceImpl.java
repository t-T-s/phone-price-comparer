package PriceCompare.services;

import PriceCompare.models.Phones;
import PriceCompare.repositories.PhonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    private PhonesRepository PhoneRepo;


    @Override
    public List<Phones> findAll() {
        return PhoneRepo.findAll();
    }
}
