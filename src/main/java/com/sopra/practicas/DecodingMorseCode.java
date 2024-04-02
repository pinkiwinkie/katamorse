package com.sopra.practicas;

import java.util.ArrayList;
import java.util.List;

public class DecodingMorseCode {

  DictionaryCodeMorse dcm = new DictionaryCodeMorse();
  ReadFiles readFiles = new ReadFiles();
  List<String> wordList = readFiles.readWordsFromFile();

  public String get(String morseCode) {
    return morseCode.isEmpty() ? "" : getDecodeLetter(morseCode);
  }

  public String getDecodeLetter(String morseCode) {
    return dcm.get(morseCode);
  }

  public List<String> decodeMorse(String morseSequence) {
    List<String> decodedSentences = new ArrayList<>();
    recursiveSearch(morseSequence, "", decodedSentences);
    return decodedSentences;
  }

  private void recursiveSearch(String morseSequence, String currentWord, List<String> decodedSentences) {
    System.out.println("morseSequence: " + morseSequence + ", currentWord: " + currentWord);
    if (morseSequence.isEmpty()) {
      System.out.println("Word found: " + currentWord.trim());
      if (wordList.contains(currentWord.trim().toLowerCase())) {
        decodedSentences.add(currentWord.trim());
      }
      return;
    }
    for (int i = 1; i <= morseSequence.length(); i++) {
      String prefix = morseSequence.substring(0, i);
      System.out.println("Checking prefix: " + prefix);
      if (dcm.getMap().containsValue(prefix)) {
        for (char c : dcm.getMap().keySet()) {
          if (dcm.getMap().get(c).equals(prefix)) {
            System.out.println("Match found: " + c);
            recursiveSearch(morseSequence.substring(i), currentWord + Character.toLowerCase(c), decodedSentences);
          }
        }
      }
    }
  }
}