package com.springboot.lld.realworldusages.network;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.StringJoiner;

/**
 * @author prabhakar, @Date 10-07-2025
 */

public class HttpPost {

    /**
     * Performs HTTP POST request. Credits https://stackoverflow.com/questions/3324717/sending-http-post-request-in-java
     *
     * @param address   the URL of the connection in String format, like "http://www.google.com"
     * @param arguments the body of the POST request, as a HashMap
     * @return response object
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation is interrupted
     */

    public static HttpResponse<String> httpPost(String address, HashMap<String, String> arguments) throws IOException, InterruptedException {
        var stringJoiner = new StringJoiner("&");

        for (var entry : arguments.entrySet()) {
            stringJoiner.add(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8)+"="+
                    URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
        }
        var out = stringJoiner.toString().getBytes(StandardCharsets.UTF_8);
        var request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .header("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofByteArray(out))
                .build();

        return HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }

    /**
     * Tests for {@link HttpPost#httpPost(String, HashMap)}.
     */
    //@Test
    void testHttpPost() throws IOException, InterruptedException {
        HashMap<String, String> arguments = new HashMap<>();
        arguments.put("data", "Hello World");
        var result = HttpPost.httpPost("https://postman-echo.com/post", arguments);
        //This postman endpoint echoes the HTTP headers, request parameters, the contents
        //of the request body and the complete URI requested.
        var echoedData = "\"data\": \"Hello World\"";
        //assertThat(result.body(), containsString(echoedData));
    }
}
