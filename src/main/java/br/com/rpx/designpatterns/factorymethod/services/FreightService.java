package br.com.rpx.designpatterns.factorymethod.services;

public interface FreightService {
    void calculateShipping(String originZip, String destinationZip, double weight);
}
