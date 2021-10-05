package edu.wctc.speakers.service;

import edu.wctc.speakers.entity.Sale;
import edu.wctc.speakers.repo.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicSaleService implements SaleService {

    @Autowired
    public BasicSaleService(SaleRepository sr) {
    }


    @Override
    public void saveSale(Sale sighting) {

    }

    @Override
    public List<Sale> getSaleForSpeaker(int speakerId) {
        return null;
    }

    @Override
    public Object getSalesForSpeaker(int speakerId) {
        return null;
    }
}
