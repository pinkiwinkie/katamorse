package com.sopra.practicas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodingWordsOfFile {
  private DictionaryCodeMorse dcm = new DictionaryCodeMorse();
  private ReadFiles readFiles = new ReadFiles();
  private List<String> wordList = readFiles.readWordsFromFile();
  private Map<String, String> wordToMorseMap = new HashMap<>();

  public CodingWordsOfFile() {
    convertWordsToMorse();
  }

  private void convertWordsToMorse() {
    for (String word : wordList) {
      StringBuilder morseWord = new StringBuilder();
      for (char c : word.toCharArray()) {
        String morseChar = dcm.getCode(c);
        if (!morseChar.isEmpty()) {
          morseWord.append(morseChar);
        }
      }
      wordToMorseMap.put(word, morseWord.toString());
    }
  }

  public Map<String, String> getWordToMorseMap() {
    return wordToMorseMap;
  }
}
