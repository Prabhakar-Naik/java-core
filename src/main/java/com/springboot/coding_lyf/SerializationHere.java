package com.springboot.coding_lyf;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * @author prabhakar, @Date 12-11-2025
 */

public class SerializationHere {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Path.of("data.txt"), StandardCharsets.UTF_8);

    }
}
