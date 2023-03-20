package com.cos.blog.controller;

import com.cos.blog.config.auth.PrincipalDetail;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    // @AuthenticationPrincipal PrincipalDetail principal
    @GetMapping({"","/"})
    public String index() { // 컨트롤러에서 세션을 어떻게 찾는지?
        // WEB-INF/vies/index.jsp
        return "index";
    }

    // USER 권한 필요
    @GetMapping("/board/saveForm")
    public String saveForm() {
        return "board/saveForm";
    }
}
