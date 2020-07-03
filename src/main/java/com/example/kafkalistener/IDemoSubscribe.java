package com.example.kafkalistener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IDemoSubscribe {

    public static final String INPUT = "consumerChannel";

    @Input(INPUT)
    SubscribableChannel subscribe ();

}
