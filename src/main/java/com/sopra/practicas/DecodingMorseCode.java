package com.sopra.practicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class DecodingMorseCode {

  static DictionaryCodeMorse dcm = new DictionaryCodeMorse();

  public static String get(String morseCode) {
    return morseCode.isEmpty() ? "" : getDecodeLetter(morseCode);
  }

  public static String getDecodeLetter(String morseCode) {
    return DictionaryCodeMorse.get(morseCode);
  }

  public static List<String> decodeMorse(String morseSequence) {
    List<String> decodedSentences = new ArrayList<>();
    recursiveSearch(morseSequence, "", decodedSentences);
    return decodedSentences;
  }

  private static void recursiveSearch(String morseSequence, String currentWord, List<String> decodedSentences) {
    if (morseSequence.isEmpty()) {
      decodedSentences.add(currentWord.trim());
      return;
    }

    for (int i = 1; i <= morseSequence.length(); i++) {
      String prefix = morseSequence.substring(0, i);
      if (DictionaryCodeMorse.getMap().containsValue(prefix)) {
        for (char c : DictionaryCodeMorse.getMap().keySet()) {
          if (DictionaryCodeMorse.getMap().get(c).equals(prefix)) {
            recursiveSearch(morseSequence.substring(i), currentWord + c, decodedSentences);
          }
        }
      }
    }
  }
}


/* for (int i = 1; i <= morseSequence.length(); i++) {
  String prefix = morseSequence.substring(0, i);
  if (DictionaryCodeMorse.getMap().containsValue(prefix)) {
    for (Map.Entry<Character,String> entry: DictionaryCodeMorse.getMap().entrySet()) {
      if (entry.getValue().equals(prefix)) {
        recursiveSearch(morseSequence.substring(i), currentWord + entry.getKey(), decodedSentences);
      }
      System.out.println(currentWord);
    }
  }
}  */