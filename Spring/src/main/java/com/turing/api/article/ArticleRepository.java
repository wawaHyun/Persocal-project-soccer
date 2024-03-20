
package com.turing.api.article;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {

        private static ArticleRepository instance;

        public List<?> findArticleByWeb() throws SQLException {
            String sql = "select dfdfdfdf from com.turing.api.article";
            PreparedStatement prstmt = conec.prepareStatement(sql);
            ResultSet rs = prstmt.executeQuery();

            List<Article> list = new ArrayList<>();
            if(rs.next()){
                do{
                    list.add(Article.builder()
                            .id(rs.getLong("id"))
                            .title(rs.getString("title"))
                            .content(rs.getString("content"))
                            .writer(rs.getString("writer"))
                            .build());

                }while (rs.next());
            }else {
                System.out.println("data is notings.");
            }

            rs.close();
            prstmt.close();
            return list;

        }


    }


