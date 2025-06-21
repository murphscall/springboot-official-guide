package com.kimje.springbootreferenceguide;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class EnvironmentListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("🌍 환경 설정 준비 시작..!");

        // 환경 변수 설정 확인 코드
        System.out.println("🌍 환경 설정 준비 완료..!");
    }
}
