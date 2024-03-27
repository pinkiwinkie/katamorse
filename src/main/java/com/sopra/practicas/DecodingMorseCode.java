package com.sopra.practicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class DecodingMorseCode {

  static DictionaryCodeMorse dcm = new DictionaryCodeMorse();
  Set<Integer> myDictionary = dcm.keySet();

  public static String get(String morseCode) {
    return morseCode.isEmpty() ? "" : getDecodeLetter(morseCode);
  }

  public static String decodeWord(String codedWord, int index, String currentLetter){
    if (codedWord.length() == 1) {
      return getDecodeLetter(codedWord);
    } else {
      for (int i = 0; i < codedWord.length(); i++) {
        String code = codedWord.substring(index, i);
        for(Entry<String, Integer> entry : dcm.entrySet()){
          
        }
      }
    }
    
    return "";
  }

  public static String getDecodeLetter(String morseCode){
    return DictionaryCodeMorse.get(morseCode);
  }
}
