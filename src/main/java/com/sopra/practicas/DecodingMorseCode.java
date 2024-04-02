package com.sopra.practicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DecodingMorseCode {
  private Map<String, String> wordToMorseMap = new CodingWordsOfFile().getWordToMorseMap();

  public List<String> decodeMorsePhrase(String morsePhrase) {
    List<String> decodedPhrases = new ArrayList<>();
    recursiveDecode(morsePhrase, "", decodedPhrases);
    return decodedPhrases;
  }

  private void recursiveDecode(String morsePhrase, String currentPhrase, List<String> decodedPhrases) {
    if (morsePhrase.isEmpty()) {
      decodedPhrases.add(currentPhrase.trim());
      return;
    }

    for (Map.Entry<String, String> entry : wordToMorseMap.entrySet()) {
      String word = entry.getKey();
      String morseWord = entry.getValue();
      if (morsePhrase.startsWith(morseWord)) {
        recursiveDecode(morsePhrase.substring(morseWord.length()), currentPhrase + word + " ", decodedPhrases);
      }
    }
  }
}