package com.sopra.practicas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileOfWords {
  public void readFile() {
    File wordFile = null;
    FileReader reader = null;
    BufferedReader buffer = null;

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
}
