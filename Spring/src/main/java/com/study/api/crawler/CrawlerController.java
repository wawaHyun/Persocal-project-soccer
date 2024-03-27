
package  com.study.api.crawler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CrawlerController {
    CrawlerServiceImpl crawSer;

    public Map<String, ?> findBugsMusic(Scanner sc) throws IOException {
        System.out.println("크롤링할 주소를 입력하세요");
        System.out.println("https://music.bugs.co.kr/chart");
        String url = sc.next();
        Map<String, String> paramap = new HashMap<>();
        paramap.put("URl", url);
        return null;
    }

    public Map<String, ?> findMelonMusic(Scanner sc) throws IOException {
        System.out.println("크롤링할 주소를 입력하세요");
        System.out.println("https://www.melon.com/chart/index.htm");
        String url = sc.next();
        Map<String, String> paramap = new HashMap<>();
        paramap.put("URl", url);
        return null;
    }
}

