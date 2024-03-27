import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sopra.practicas.DecodingMorseCode;

public class TestDecodingMorse {
  @Test
  public void testToProveThatReturnsE() {
    assertEquals(DecodingMorseCode.getDecodeLetter("."), "E");
  }
}
