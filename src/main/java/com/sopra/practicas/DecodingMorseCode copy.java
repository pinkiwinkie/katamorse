/* 

 package com.sopra.practicas;

import java.util.ArrayList;
import java.util.List;

public class DecodingMorseCode {
  private static final DictionaryCodeMorse dcm = new DictionaryCodeMorse();
  private static final ReadFiles readFiles = new ReadFiles();
  private static final List<String> wordList = readFiles.readWordsFromFile();

  public static List<String> decodeMorse(String morseSequence) {
    List<String> decodedSentences = new ArrayList<>();
    recursiveSearch(morseSequence, "", decodedSentences);
    return decodedSentences;
  }

  private static void recursiveSearch(String morseSequence, String currentWord, List<String> decodedSentences) {
    if (morseSequence.isEmpty()) {
      if (isValidWord(currentWord)) {
        decodedSentences.add(currentWord.trim());
      }
      return;
    }

    char firstChar = getFirstChar(morseSequence);

    List<String> possibleWords = getPossibleWords(firstChar);

    for (String word : possibleWords) {
      if (morseSequence.startsWith(dcm.get(word))) {
        recursiveSearch(morseSequence.substring(dcm.get(word).length()), currentWord + word + " ", decodedSentences);
      }
    }
  }

  public static char getFirstChar(String morseSequence) {
    for (char c : dcm.getMap().keySet()) {
      if (dcm.getCode(c).equals(morseSequence.substring(0, 1))) {
        return c;
      }
    }
    return '\0';
  }

  public static List<String> getPossibleWords(char firstChar) {
    List<String> possibleWords = new ArrayList<>();
    for (String word : wordList) {
      if (word.charAt(0) == firstChar) {
        possibleWords.add(word);
      }
    }
    return possibleWords;
  }

  private static boolean isValidWord(String word) {
    return wordList.contains(word.trim());
  }
}
 */