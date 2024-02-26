package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
//	計測画面
    @GetMapping("/")
    public String index() {
        return "HTML/index";
    }
//    オプションでの時間設定へのページ遷移
    @GetMapping("/option")
    public String timerOpstin() {
        return "HTML/timerOption";
    }
//    計測データ
    
//    管理者画面
    
}