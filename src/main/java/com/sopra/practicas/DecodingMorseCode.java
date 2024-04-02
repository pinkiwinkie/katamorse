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
    if (morseSequence.isEmpty()) {
      decodedSentences.add(currentWord.trim());
      return;
    }

    for (int i = 1; i <= morseSequence.length(); i++) {
      String prefix = morseSequence.substring(0, i);
      if (dcm.getMap().containsValue(prefix)) {
        for (char c : dcm.getMap().keySet()) {
          if (dcm.getMap().get(c).equals(prefix)) {
            recursiveSearch(morseSequence.substring(i), currentWord + c, decodedSentences);
          }
        }
      }
    }
  }

}