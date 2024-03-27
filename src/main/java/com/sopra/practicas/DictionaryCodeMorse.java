package com.sopra.practicas;

import java.util.HashMap;
import java.util.Map;

public class DictionaryCodeMorse {
  private static final Map<String, Character> morseDictionary = new HashMap<>();

  static {
    morseDictionary.put(".-", 'A');
    morseDictionary.put("-...", 'B');
    morseDictionary.put("-.-.", 'C');
    morseDictionary.put("-..", 'D');
    morseDictionary.put(".", 'E');
    morseDictionary.put("..-.", 'F');
    morseDictionary.put("--.", 'G');
    morseDictionary.put("....", 'H');
    morseDictionary.put("..", 'I');
    morseDictionary.put(".---", 'J');
    morseDictionary.put("-.-", 'K');
    morseDictionary.put(".-..", 'L');
    morseDictionary.put("--", 'M');
    morseDictionary.put("-.", 'N');
    morseDictionary.put("---", 'O');
    morseDictionary.put(".--.", 'P');
    morseDictionary.put("--.-", 'Q');
    morseDictionary.put(".-.", 'R');
    morseDictionary.put("...", 'S');
    morseDictionary.put("-", 'T');
    morseDictionary.put("..-", 'U');
    morseDictionary.put("...-", 'V');
    morseDictionary.put(".--", 'W');
    morseDictionary.put("-..-", 'X');
    morseDictionary.put("-.--", 'Y');
    morseDictionary.put("--..", 'Z');
  }

  public static String get(String morseCode) {
    try {
      return morseDictionary.get(morseCode).toString();
    } catch (Exception codeNotFound) {
      return "?";
    }
  }
}
