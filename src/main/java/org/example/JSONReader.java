package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JSONReader {

    public List<HashMap<String, String>> getJSONData(String filePath) throws IOException {
        //converting JSON file to string
        String jsonContent=FileUtils.readFileToString(new File(filePath));//"DataReader.json")
        //String to hashmap-{"":""}
        ObjectMapper mapper=new ObjectMapper();
        //list of hashmap
        List<HashMap<String,String>> data=mapper.readValue(jsonContent,new TypeReference<List<HashMap<String,String>>>(){});
        return data;
    }

}
