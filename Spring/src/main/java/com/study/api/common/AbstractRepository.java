package com.study.api.common;

import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractRepository {
        public abstract Map<String,?> save (Map<String,?> paramMap) throws IOException;

}
