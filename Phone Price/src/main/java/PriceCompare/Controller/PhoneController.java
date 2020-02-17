package PriceCompare.Controller;


import PriceCompare.models.Phones;
import PriceCompare.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/phones")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Phones> getAllPhones() {
        return phoneService.findAll();
    }


}
