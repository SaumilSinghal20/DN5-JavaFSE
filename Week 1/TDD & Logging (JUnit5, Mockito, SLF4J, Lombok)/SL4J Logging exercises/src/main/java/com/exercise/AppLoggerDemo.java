package com.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppLoggerDemo {
    private static final Logger log = LoggerFactory.getLogger(AppLoggerDemo.class);

    public static void main(String[] args) {
        log.warn("Memory usage is getting high");
        log.error("Failed to connect to the database");
    }
}
