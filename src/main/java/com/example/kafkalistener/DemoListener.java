package com.example.kafkalistener;

import com.example.model.NifiData;
import com.example.repository.NifiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class DemoListener {

    @Autowired
    private NifiRepository nifiRepository;

    @StreamListener(IDemoSubscribe.INPUT)
    public void handleGreetings(@Payload NifiData nifiData) {

        System.out.println(nifiData.getValue());
        nifiRepository.save(nifiData);
    }
}