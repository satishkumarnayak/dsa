
package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

  @Test
  public void testAnagram() {
    ValidAnagram va = new ValidAnagram();
    assertTrue(va.isAnagram("listen", "silent"));
    assertFalse(va.isAnagram("hello", "billion"));
    assertFalse(va.isAnagram("anagram", ""));
    assertTrue(va.isAnagram("", ""));
    assertFalse(va.isAnagram("rat", "car"));
  
  }
}