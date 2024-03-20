
package  com.turing.api.crawler;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
public class CrawlerServiceImpl implements CrawlerService{
    private CrawlerRepository repository;


    @Override
    public Map<String, ?> findNamesFromWeb(Map<String, ?> paramMap) throws IOException {
        return repository.save(paramMap);
    }

    @Override
    public Map<String, ?> findNamesFromWeb2(Map<String, ?> paramMap) throws IOException {
        return repository.save2(paramMap);
    }
}
