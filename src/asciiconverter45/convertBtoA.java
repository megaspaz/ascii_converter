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
public class convertBtoA {
  private String strAscii;

  /**
   * <p>
   * This constructor initializes the class's data variable, strAscii
   * </p>
   */
  public convertBtoA() {
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
   * Description: Loop over the input string processing each group of 8 0's or 1's
   * to get a decimal value for the binary byte which is then stored in a
   * character variable and appended to the return string value if no errors
   * occur. This method throws a catch-all Exception and a
   * BufferOverflowException. <br />
   * </p>
   */

  public void convertStringToAscString(String strBinary)
      throws Exception, BufferOverflowException, IllegalArgumentException {
    String strAscTemp = "";
    int convertedDecVal;
    try {
      // get binary string stripped of white spaces
      strAscTemp = this.getTokString(strBinary.toString());
      // check to see if total length of binary string is valid
      if (0 != (strAscTemp.length() % 8)) {
        IllegalArgumentException e = new IllegalArgumentException();
        throw e; // throw IllegalArgumentException - not a valid binary
        // string
      }
      // process string stripped of whitespace
      // loop over new temp string
      int i = 0; // initialize start index
      int j = 8; // initialize last index of substring
      while (i < strAscTemp.length()) {
        // get substring to process by groups of 8
        String strSubString = strAscTemp.substring(i, j).toString();
        // initialize running total of converted binary parts.
        // This is Ascii decimal representation
        convertedDecVal = 0;
        int powIndex = strSubString.length() - 1; // power to raise the
        // base number by
        for (int x = 0; x < strSubString.length(); x++) {
          // check char if it is a 0 or 1
          if ('0' != strSubString.charAt(x) && '1' != strSubString.charAt(x)) {
            IllegalArgumentException e = new IllegalArgumentException();
            throw e; // throw IllegalArgumentException - not a valid
            // binary string
          }
          if ('0' == strSubString.charAt(x)) {
            convertedDecVal += 0;
          } else if ('1' == strSubString.charAt(x)) {
            convertedDecVal += (1 * (Math.pow(2, powIndex)));
          }
          // decriment the power index
          powIndex--;
        }
        // concat the ascii decimal value into the class's data variable
        strAscii += (char) convertedDecVal;
        // set up indices for next substring
        i += 8;
        j += 8;
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
