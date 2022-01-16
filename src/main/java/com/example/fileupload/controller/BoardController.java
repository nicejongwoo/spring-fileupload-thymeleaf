package com.example.fileupload.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/board")
public class BoardController {

    @GetMapping
    public String list() {
        log.info("====================BoardController.list()====================");
        return "board/list";
    }

    @GetMapping("/insert")
    public String insertForm() {
        log.info("====================BoardController.insert()====================");
        return "board/insertOrUpdate";
    }

}
