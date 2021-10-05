package edu.wctc.speakers.controller;

import edu.wctc.speakers.entity.Sale;
import edu.wctc.speakers.service.LocationService;
import edu.wctc.speakers.service.SaleService;
import edu.wctc.speakers.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class SaleController {
    private SpeakerService SpeakerService;
    private SaleService saleService;
    private LocationService locationService;

    @Autowired
    public SaleController(SpeakerService sqs, SaleService sis, LocationService los) {
        this.SpeakerService = sqs;
        this.saleService = sis;
        this.locationService = los;
    }

    @PostMapping("/save")
    public String processSale(Model model,
                                  @Valid @ModelAttribute Sale sale,
                                  BindingResult bindingResult) {
      //  int speakerId = sale.getSaleId();

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult);
            model.addAttribute("pageTitle", "Report Sale");
            model.addAttribute("locationList", locationService.getLocationList());
           // model.addAttribute("speaker", SpeakerService.getSpeaker(speakerId));
            return "sale-form";
        }

        saleService.saveSale(sale);

        model.addAttribute("pageTitle", "Thank You!");
       // model.addAttribute("speaker", SpeakerService.getSpeaker(speakerId));
      //  model.addAttribute("saleList", saleService.getSalesForSpeaker(speakerId));

        return "confirmation";
    }



    @RequestMapping("/sales")
    public String showRecentSales(Model model,
                                      @RequestParam("id") int speakerId) {
        model.addAttribute("pageTitle", "Recent Sales");
        model.addAttribute("speaker", SpeakerService.getSpeaker(speakerId));
        model.addAttribute("saleList", saleService.getSalesForSpeaker(speakerId));
        return "sales";
    }

    @RequestMapping("/report")
    public String showSaleForm(Model model,
                                   @RequestParam("id") int speakerId) {
        model.addAttribute("pageTitle", "Report Sale");
        model.addAttribute("locationList", locationService.getLocationList());
        model.addAttribute("speaker", SpeakerService.getSpeaker(speakerId));

        Sale si = new Sale();
      //  si.setSpeakerId(speakerId);
        model.addAttribute("sale", si);

        return "sale-form";
    }

    @RequestMapping("/list")
    public String showSpeakerList(Model model) {
        model.addAttribute("pageTitle", "Pick a Speaker");
        model.addAttribute("speakerList", SpeakerService.getSpeakerList());

        return "speaker-list";
    }
}
