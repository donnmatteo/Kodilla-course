package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SellService sellService;
    private SendOperations sendOperations;

    public ProductOrderService(final InformationService informationService, final SellService sellService,
                               final SendOperations sendOperations) {
        this.informationService = informationService;
        this.sellService = sellService;
        this.sendOperations = sendOperations;
    }

    public SellDto process()
}
