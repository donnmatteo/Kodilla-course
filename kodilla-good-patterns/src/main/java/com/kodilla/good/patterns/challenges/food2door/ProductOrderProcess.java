package com.kodilla.good.patterns.challenges.food2door;

public class ProductOrderProcess {
    private InformationProcess informationProcess;
    private OrderProcess orderProcess;

    public ProductOrderProcess(InformationProcess informationProcess, OrderProcess orderProcess) {
        this.informationProcess = informationProcess;
        this.orderProcess = orderProcess;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderProcess.sendProduct(orderRequest.getSupplier(), orderRequest.getProduct());
        if(isOrdered) {
            informationProcess.inform(orderRequest.getSupplier());
            return new OrderDto(orderRequest.getSupplier(),orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getSupplier(), orderRequest.getProduct(), false);
        }
    }

}
