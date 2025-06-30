package br.com.rpx.designpatterns.factorymethod;

import java.util.Arrays;
import java.util.Optional;

public enum FreightCarrier {

    CORREIOS("Correios"),
    JADLOG("JADLOG"),
    MELHORENVIO("Melhor Envio");

    private final String label;

    FreightCarrier(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static Optional<FreightCarrier> fromLabel(String label) {
        return Arrays.stream(FreightCarrier.values())
                .filter(fc -> fc.label.equalsIgnoreCase(label))
                .findFirst();
    }
}
