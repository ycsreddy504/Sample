package com.vedait.practice.stringex;

public class JsonFormatting {
	
	// \n new line

	public static void main(String[] args) {
        StringBuffer jsonResponse = new StringBuffer("{\n");
        jsonResponse.append("\"userId\": \"123\",\n");
        jsonResponse.append("\"status\": \"success\",\n");
        jsonResponse.append("\"message\": \"Transaction completed\"\n");
        jsonResponse.append("}");
        
        System.out.println(jsonResponse.toString());
    }
	
	
}
