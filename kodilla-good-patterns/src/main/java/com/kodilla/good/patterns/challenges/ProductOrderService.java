package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderHandling orderHandling;

    public ProductOrderService(final InformationService informationService, final OrderService orderService,
                               final OrderHandling orderHandling) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderHandling = orderHandling;
    }

    public OrderDto process(final BuyRequest buyRequest) {
        boolean isSold = orderService.createOrder(buyRequest.getUser(), buyRequest.getGame());
        if(isSold) {
            informationService.inform(buyRequest.getUser());
            orderHandling.sendOrder(buyRequest.getUser(), buyRequest.getGame());
            return new OrderDto(buyRequest.getUser(), buyRequest.getGame(), true);
        } else {
            return new OrderDto(buyRequest.getUser(), buyRequest.getGame(), false);
        }
    }
}
