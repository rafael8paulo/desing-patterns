package br.com.rpx.designpatterns.factorymethod;

import br.com.rpx.designpatterns.factorymethod.services.CorreiosService;
import br.com.rpx.designpatterns.factorymethod.services.FreightService;
import br.com.rpx.designpatterns.factorymethod.services.JadlogService;
import br.com.rpx.designpatterns.factorymethod.services.MelhorEnvioService;

import java.util.HashMap;
import java.util.Map;

import static br.com.rpx.designpatterns.factorymethod.FreightCarrier.*;

public class FreightServiceFactory {

    private static final Map<FreightCarrier, FreightService> freightServices = new HashMap<>();

    static {
        freightServices.put(CORREIOS, new CorreiosService());
        freightServices.put(JADLOG, new JadlogService());
        freightServices.put(MELHORENVIO, new MelhorEnvioService());
    }

    public static FreightService create(String carrierName) {
        FreightCarrier freightCarrier = FreightCarrier.valueOf(carrierName);
        FreightService service = freightServices.get(freightCarrier);
        if (service == null) {
            throw new IllegalArgumentException("Carrier not found.");
        }
        return service;
    }

}
