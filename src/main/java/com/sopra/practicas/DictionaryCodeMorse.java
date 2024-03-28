package com.sopra.practicas;

import java.util.Map;

public class DictionaryCodeMorse {
  public static Map<Character, String> getMap() {
    ReadFiles readFiles = new ReadFiles();
    return readFiles.readDictionary();
  }

  public static String get(String morseCode) {
    try {
      for (Map.Entry<Character, String> entry : getMap().entrySet()) {
        if (entry.getValue().equals(morseCode)) {
          return entry.getKey().toString();
        }
      }
      return "?";
    } catch (Exception codeNotFound) {
      return "?";
    }
  }
}
