package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @GetMapping("/sample")
    public String getSample() {
        return "sample";
    }

    @PostMapping("/sample")
    public String postSample(@RequestParam("text1") String str, Model model) {
        // 画面から受け取った文字列をModelに登録
        model.addAttribute("testStr", str);
        // helloResponse.htmlに画面遷移
        return "sampleResponse";
    }

    @PostMapping("/sample/db")
    public String postDbSample(@RequestParam("text2")String str,Model model){
        // Stringからint型に変換
        int id = Integer.parseInt(str);
        // 1件検索
        Employee employee = sampleService.findOne(id);
        // 検索結果をModelに登録
        model.addAttribute("id", employee.getEmployeeId());
        model.addAttribute("name", employee.getEmployeeName());
        model.addAttribute("age", employee.getAge());
        // helloResponseDB.htmlに画面遷移
        return "sampleResponseDB";
    }
}