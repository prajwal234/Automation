package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJsonFile {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Ganga\\IdeaProjects\\PracticeSessions\\FIle.json"));
        String email = jsonNode.get("email").asText();
        String password = jsonNode.get("password").asText();
        System.out.println(email);
        System.out.println(password);
    }
}
