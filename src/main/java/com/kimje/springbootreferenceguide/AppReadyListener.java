package com.kimje.springbootreferenceguide;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class AppReadyListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("Application ready");
        System.out.println("레디스 설정...");
        System.out.println("데이터베이스 설정..확인중..");

    }
}
