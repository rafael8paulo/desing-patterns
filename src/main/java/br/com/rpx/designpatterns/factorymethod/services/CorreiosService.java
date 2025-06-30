package br.com.rpx.designpatterns.factorymethod.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CorreiosService implements FreightService {
    @Override
    public void calculateShipping(String originZip, String destinationZip, double weight) {
        log.info("Calculando frete via Correios...");
    }
}
