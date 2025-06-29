package cn.bitoffer.xtimer.controller;

import cn.bitoffer.common.model.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xtimer")
@Slf4j
public class TestController {

    @PostMapping("/callback")
    public ResponseEntity<String> callback(@RequestBody String callbackInfo) {
        log.info("CALLBACK:"+callbackInfo);
        // 消息队列发送消息
        return ResponseEntity.ok(
                "ok"
        );
    }
}

