package br.com.rpx.designpatterns.factorymethod;

import br.com.rpx.designpatterns.factorymethod.services.FreightService;

public class CheckoutController {

    public void calculateShipping(String carrier, String originZip, String destinationZip, double weight) {
        FreightService service = FreightServiceFactory.create(carrier);
        service.calculateShipping(originZip, destinationZip, weight);
    }

}
