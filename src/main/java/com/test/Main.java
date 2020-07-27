package com.test;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;

import java.io.IOException;

/**
 * @Author 周利东
 * @Date: 2020/7/17 15:25
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //原开始1行增加开始4
        JestClientFactory factory = new JestClientFactory();
//增加测试2
        HttpClientConfig config = new HttpClientConfig.Builder("http://local1:9200").build();

        JestClient jestClient = factory.getObject();
        Index index = new Index.Builder("{\n" +
                "      \"class_id\":\"191012\",\n" +
                "      \"name\":\"yulaoda\",\n" +
                "      \"age\":\"20\",\n" +
                "      \"sex\":\"male\",\n" +
                "      \"score\":\"99.9\",\n" +
                "      \"favo\":\"脚踩电灯泡乒乓球2\"\n" +
                "}")
                .build();


        System.out.println("渣渣");
        DocumentResult execute = jestClient.execute(index);
        System.out.println(execute.getJsonString());

    }
}
