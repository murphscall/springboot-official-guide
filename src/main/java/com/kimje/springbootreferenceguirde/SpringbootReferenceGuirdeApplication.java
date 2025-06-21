package com.kimje.springbootreferenceguirde;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootReferenceGuirdeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootReferenceGuirdeApplication.class, args);

        // 스프링부트 애플리케이션 지연 초기화란?
        /*
        * 스프링 부트는 실행 시 모든 빈을 실행시키고 초기화 하는데 지연 초기화를 이용하게 되면
        * 꼭 필요한 빈들만 먼저 실행하고 지연 설정을 한 빈들은 실제로 사용할 때 초기화 시키므로
        * 스프링부트 앱 시작 시간을 단축 시키거나 초기 부하를 줄일 수 있다.
        * */


        /* lazy 로딩 설정
          SpringApplication application = new SpringApplication(SpringbootReferenceGuirdeApplication.class);
          application.setLazyInitialization(true);
          application.run(args);
        */

        /* lazy 로딩 builder 패턴 사용법
        new SpringApplicationBuilder(SpringbootReferenceGuirdeApplication.class)
                .lazyInitialization(true)
                .run(args);
        */

        /*
        * application.properties 또는 application.yaml 에 따로 설정 가능.
        * spring.main.lazy-initialization=true (Properties)
        * spring.main.lazy-initialization: true (YAML)
        * */


        /*  만약 애플리케이션 전체에 지연 초기화를 적용하면서도 특정 빈은 즉시 초기화를 원한다면
         @Lazy(false) 어노테이션을 통해 지연 초기화를 비활성화 할 수 있다.*/
    }


}
