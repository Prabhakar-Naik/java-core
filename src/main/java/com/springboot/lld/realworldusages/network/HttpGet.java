package com.springboot.lld.realworldusages.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author prabhakar, @Date 10-07-2025
 */

public class HttpGet {

    /**
     * Performs HTTP GET request.
     *
     * @param url the URI of the connection
     * @return response object
     * @throws InterruptedException and IOException i/o error, interruption error, etc
     */

    public static HttpResponse<String> httpGet(String url) throws InterruptedException, IOException {
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        return client.send(request,HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Tests for {@link HttpGet#httpGet(String)}.
     */
    //@Test
    void testHttpGet() throws Exception {
        var response = HttpGet.httpGet("http://www.google.com");
        //assertEquals(200, response.statusCode());
    }
}
