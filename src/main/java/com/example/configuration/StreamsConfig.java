package com.example.configuration;

import com.example.kafkalistener.IDemoSubscribe;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(IDemoSubscribe.class)
public class StreamsConfig {
}
