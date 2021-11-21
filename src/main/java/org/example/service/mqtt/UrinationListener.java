package org.example.service.mqtt;

import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.mqtt.annotation.MqttSubscriber;
import io.micronaut.mqtt.annotation.Topic;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@MqttSubscriber
public class UrinationListener {

    private MeterRegistry meterRegistry;

    List<String> messageLengths = Collections.synchronizedList(new ArrayList<>());

    public UrinationListener(MeterRegistry meterRegistry){
        this.meterRegistry = meterRegistry;
    }

    @Topic("urination/1")
    public void receive(byte[] data){
        System.out.println("Urination received: " + new String(data, StandardCharsets.UTF_8));
        String[] dataArray = new String(data, StandardCharsets.UTF_8).split(" ");
        meterRegistry
                .counter("urination", "clientId", dataArray[1])
                .increment(Double.parseDouble(dataArray[2]));
    }
}