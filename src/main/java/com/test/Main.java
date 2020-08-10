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
        //原开始1行增加开始4还修改了其他
        JestClientFactory factory = new JestClientFactory();
//增加测试2
        HttpClientConfig config = new HttpClientConfig.Builder("http://local1:9200").build();
//ads
        JestClient jestClient = factory.getObject();
        Index index = new Index.Builder("{\n" +
                "      \"class_id\":\"191012\",\n" +
                "      \"favo\":\"脚踩电灯泡乒乓球2\"\n" +
                "}")
                .build();

//啊啊啊啊
        System.out.println("渣渣");
        System.out.println("渣渣");
        DocumentResult execute = jestClient.execute(index);
        System.out.println(execute.getJsonString());

    }

}
