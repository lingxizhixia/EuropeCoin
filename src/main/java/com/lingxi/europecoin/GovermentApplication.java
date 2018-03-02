package com.lingxi.europecoin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 欧币治理API
 */
@RestController
@RequestMapping("/goverment")
public class GovermentApplication {
    @RequestMapping("/nodes")
    public Object listNode() {
        return null;
    }
}
