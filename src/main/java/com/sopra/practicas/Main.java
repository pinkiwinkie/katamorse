package com.sopra.practicas;

import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    DecodingMorseCode decodingMorseCode = new DecodingMorseCode();
    List<String> decodedPhrases = decodingMorseCode.decodeMorsePhrase("--.--.---.......-.---.-.-.-..-.....--..-....-.-----..-");
    System.out.println("Frase decodificada:");
    for (String phrase : decodedPhrases) {
      System.out.println(phrase);
    }
  }
}