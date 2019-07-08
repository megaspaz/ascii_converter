package asciiconverter45;

import java.nio.BufferOverflowException;
import java.util.StringTokenizer;

/**
 * <p>
 * Title: Ascii Converter
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2003
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Megaspaz
 * @version 4.5
 */
public class convertHtoA {
  private String strAscii;

  /**
   * <p>
   * This constructor initializes the class's data variable, strAscii
   * </p>
   */
  public convertHtoA() {
    strAscii = "";
  }

  /**
   * <p>
   * Input: A reference to a string<br />
   * <p>
   * Output: Returns a reference to a string of characters less whitespace<br />
   * <p>
   * Description: Use a StringTokenizer to get tokens and appends it to a
   * temporary buffer which is returned.
   * </p>
   */
  private String getTokString(String rawString) {
    String strAscTemp = "";
    StringTokenizer strTok = new StringTokenizer(rawString); // will strip
    // out white
    // space
    while (strTok.hasMoreTokens()) {
      strAscTemp += strTok.nextToken();
    }
    return strAscTemp.toString();
  }

  /**
   * <p>
   * Input: A reference to a string<br />
   * <p>
   * Output: None<br />
   * <p>
   * Description: Loop over the input string processing each group of 2
   * characters. this is then stored in a character variable and appended to the
   * return string value if no errors occur. This method throws a catch-all
   * Exception and a BufferOverflowException. <br />
   * </p>
   */
  public void convertStringToAscString(String strHex)
      throws Exception, BufferOverflowException, IllegalArgumentException {
    String strAscTemp = "";
    int convertedDecVal;
    double baseNum = 16;
    try {
      // get binary string stripped of white spaces
      strAscTemp = this.getTokString(strHex.toString());
      // check to see if total length of hex string is valid
      if (0 != (strAscTemp.length() % 2)) {
        IllegalArgumentException e = new IllegalArgumentException();
        throw e; // throw IllegalArgumentException - not a valid binary
        // string
      }
      // process string stripped of whitespace
      // loop over new temp string
      int i = 0; // initialize start index
      int j = 2; // initialize last index of substring
      while (i < strAscTemp.length()) {
        // get substring to process by groups of 2
        String strSubString = strAscTemp.substring(i, j).toString();
        // initialize running total of converted binary parts - this is
        // Ascii decimal representation
        convertedDecVal = 0;
        int powIndex = strSubString.length() - 1; // power to raise the
        // base number by
        for (int x = 0; x < strSubString.length(); x++) {
          // check char if it is a hex digit
          if (('0' > strSubString.charAt(x) || 'f' < strSubString.charAt(x))
              || ('9' < strSubString.charAt(x) && 'A' > strSubString.charAt(x))
              || ('F' < strSubString.charAt(x) && 'a' > strSubString.charAt(x))) {
            IllegalArgumentException e = new IllegalArgumentException();
            throw e; // throw IllegalArgumentException - not a valid
            // binary string
          }
          if ('0' == strSubString.charAt(x)) {
            convertedDecVal += 0;
          } else if ('1' == strSubString.charAt(x)) {
            convertedDecVal += (1 * (Math.pow(baseNum, powIndex)));
          } else if ('2' == strSubString.charAt(x)) {
            convertedDecVal += (2 * (Math.pow(baseNum, powIndex)));
          } else if ('3' == strSubString.charAt(x)) {
            convertedDecVal += (3 * (Math.pow(baseNum, powIndex)));
          } else if ('4' == strSubString.charAt(x)) {
            convertedDecVal += (4 * (Math.pow(baseNum, powIndex)));
          } else if ('5' == strSubString.charAt(x)) {
            convertedDecVal += (5 * (Math.pow(baseNum, powIndex)));
          } else if ('6' == strSubString.charAt(x)) {
            convertedDecVal += (6 * (Math.pow(baseNum, powIndex)));
          } else if ('7' == strSubString.charAt(x)) {
            convertedDecVal += (7 * (Math.pow(baseNum, powIndex)));
          } else if ('8' == strSubString.charAt(x)) {
            convertedDecVal += (8 * (Math.pow(baseNum, powIndex)));
          } else if ('9' == strSubString.charAt(x)) {
            convertedDecVal += (9 * (Math.pow(baseNum, powIndex)));
          } else if ('a' == strSubString.charAt(x) || 'A' == strSubString.charAt(x)) {
            convertedDecVal += (10 * (Math.pow(baseNum, powIndex)));
          } else if ('b' == strSubString.charAt(x) || 'B' == strSubString.charAt(x)) {
            convertedDecVal += (11 * (Math.pow(baseNum, powIndex)));
          } else if ('c' == strSubString.charAt(x) || 'C' == strSubString.charAt(x)) {
            convertedDecVal += (12 * (Math.pow(baseNum, powIndex)));
          } else if ('d' == strSubString.charAt(x) || 'D' == strSubString.charAt(x)) {
            convertedDecVal += (13 * (Math.pow(baseNum, powIndex)));
          } else if ('e' == strSubString.charAt(x) || 'E' == strSubString.charAt(x)) {
            convertedDecVal += (14 * (Math.pow(baseNum, powIndex)));
          } else {
            convertedDecVal += (15 * (Math.pow(baseNum, powIndex)));
          }
          // decriment the power index
          powIndex--;
        }
        // concat the ascii decimal value into the class's data variable
        strAscii += (char) convertedDecVal;
        // set up indices for next substring
        i += 2;
        j += 2;
      }
    } catch (BufferOverflowException e) {
      // try to clean out variables
      strAscii = null;
      strAscTemp = null;
      throw e; // rethrow error to the caller
    } catch (IllegalArgumentException e) {
      // try to clean out variables
      strAscii = null;
      strAscTemp = null;
      throw e; // rethrow error to the caller
    } catch (Exception e) {
      // try to clean out variables
      strAscii = null;
      strAscTemp = null;
      throw e; // rethrow error to the caller
    }
  }

  /**
   * <p>
   * Input: None
   * </p>
   * <p>
   * Output: Returns a reference to the class's data variable, strAscii
   * </p>
   */

  public String getAscii() {
    return strAscii.toString();
  }
}
