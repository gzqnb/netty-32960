package com.nevt.gbt32960.common.http;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;

import java.util.concurrent.TimeUnit;

public class HTTPCustomer {

    private static final HttpClient httpClient;

    static {
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
        connectionManager.setMaxTotal(500);
        connectionManager.setDefaultMaxPerRoute(50);
        connectionManager.setValidateAfterInactivity(60 * 1000);
        ConnectionKeepAliveStrategy keepAliveStrategy = (response, context) -> {
            HeaderElementIterator it = new BasicHeaderElementIterator(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
            while (it.hasNext()) {
                HeaderElement he = it.nextElement();
                String param = he.getName();
                String value = he.getValue();
                if (value != null && param.equalsIgnoreCase
                        ("timeout")) {
                    return Long.parseLong(value) * 1000;
                }
            }
            return 60 * 1000;
        };

        httpClient = HttpClients.custom()
                .setConnectionTimeToLive(10L, TimeUnit.SECONDS)
                .setConnectionManager(connectionManager)
                .setKeepAliveStrategy(keepAliveStrategy)
                .build();

    }

    public static HttpClient createClient() {
        return httpClient;
    }

    public static HttpPost creatHttpPost(String url) {
        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Connection", "keep-alive");
        httpPost.setHeader("Content-Type", "application/json");
        return httpPost;
    }

}
