package edu.wctc.speakers.service;

import edu.wctc.speakers.entity.Sale;

import java.util.List;

public interface SaleService {
    void saveSale(Sale sighting);

    List<Sale> getSaleForSpeaker(int speakerId);

    Object getSalesForSpeaker(int speakerId);
}
