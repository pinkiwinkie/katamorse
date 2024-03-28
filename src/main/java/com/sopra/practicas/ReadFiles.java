package com.sopra.practicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadFiles {
  File wordFile = null;
  FileReader reader = null;
  BufferedReader buffer = null;

  public void readFileOfWords() {

    try {
      wordFile = new File("C:\\Users\\elruiz\\Documents\\katamorse\\src\\main\\java\\com\\sopra\\practicas\\words.txt");
      reader = new FileReader(wordFile);
      buffer = new BufferedReader(reader);

      String line;
      while ((line = buffer.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public Map<Character, String> readDictionary() {
    Map<Character, String> morseDictionary = new HashMap<>();
    try {
      wordFile = new File("C:\\Users\\elruiz\\Documents\\katas\\katamorse\\src\\main\\java\\com\\sopra\\practicas\\dictionary.txt");
      reader = new FileReader(wordFile);
      buffer = new BufferedReader(reader);
      
      String line;
      while ((line = buffer.readLine()) != null) {
        String [] parts = line.split(":");
        if (parts.length == 2) {
          char key = parts[0].charAt(0);
          String value = parts[1];

          morseDictionary.put(key, value);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return morseDictionary;
  }
}
