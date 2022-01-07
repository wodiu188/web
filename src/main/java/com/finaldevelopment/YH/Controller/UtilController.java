package com.finaldevelopment.YH.Controller;

import com.finaldevelopment.YH.common.Result;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@RestController
public class UtilController {

    @GetMapping("/CodeApi")
    public Result getCode() throws IOException {
        Document document = Jsoup.connect("http://hm.suol.cc/API/yulu.php?type=鼓励").get();
        String text = document.body().text();
        return Result.success(text);
    }


}
