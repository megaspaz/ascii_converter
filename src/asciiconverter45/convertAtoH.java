package asciiconverter45;

import java.nio.BufferOverflowException;

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
public class convertAtoH {
  private String strHex;

  /**
   * <p>
   * This constructor initializes the class's data variable, strBinary
   * </p>
   */
  public convertAtoH() {
    // initialize variable
    strHex = ""; // the returned final buffer storing a hex representation
    // of the input string
  }

  /**
   * <p>
   * Input: A reference to a string, rawHexString<br />
   * <p>
   * Output: Returns a reference to a Hex string stuffed with 0's.<br />
   * <p>
   * Description: get the length of the input string and subtract that by 2. this
   * will give the length of the string of 0's which is appended to the input
   * string and returned as a string.
   * </p>
   */
  private String appendZeros(String rawHexString) {
    String strZero = "0"; // string of 0's
    // get # of 0's to stuff to make 2 digit hex
    if (1 == rawHexString.length()) {
      rawHexString += strZero;
    }
    return rawHexString;
  }

  /**
   * <p>
   * Input: A reference to a string, rawHexString<br />
   * <p>
   * Output: Returns a reference to a hex string that is the reverse of the input
   * string<br />
   * <p>
   * Description: initialize a StringBuffer with the input string and call the
   * StringBuffer's reverse method and return.
   * </p>
   */
  private String reverseString(String rawHexString) {
    // need to reverse the temporary buffer - will use string buffer due to
    // laziness
    StringBuffer myTemp = new StringBuffer();
    myTemp.append(rawHexString);
    return (myTemp.reverse().toString());
  }

  /**
   * <p>
   * Input: A reference to a string to loop over<br />
   * <p>
   * Output: Returns a reference to a hexidecimal string<br />
   * <p>
   * Description: Loop over the input string processing each character's decimal
   * representation and doing a modulus 16 to get it's hex representation. each
   * character is stored in a temporary buffer to be stuffed with 0's to make an
   * hex representation which is appended into a final buffer that is returned if
   * finished without error. This method throws a catch-all Exception and a
   * BufferOverflowException
   * </p>
   */
  public void convertStringToHexString(String strAscii) throws Exception, BufferOverflowException {
    String strHexTemp; // temp buffer to store characters binary rep
    char charElement;
    int quotient;
    int remainder;

    try {
      // to do - set the algorithm to convert to binary
      // loop to get characters for processing
      // get a character to process from the input string at index
      for (int i = 0; i < strAscii.length(); i++) {
        // initialize variables
        charElement = strAscii.charAt(i);
        quotient = charElement;
        strHexTemp = "";
        while (quotient != 0) {
          // get modulus
          remainder = quotient % 16;
          // get the new quotient
          quotient = quotient / 16;
          // check if remainder is a hex letter
          if (10 == remainder) {
            strHexTemp += "A";
          } else if (11 == remainder) {
            strHexTemp += "B";
          } else if (12 == remainder) {
            strHexTemp += "C";
          } else if (13 == remainder) {
            strHexTemp += "D";
          } else if (14 == remainder) {
            strHexTemp += "E";
          } else if (15 == remainder) {
            strHexTemp += "F";
          } else {
            // insert it into the buffer string
            strHexTemp += remainder;
          }
        }
        // append 0's to raw hex string
        strHexTemp = this.appendZeros(strHexTemp.toString());
        // reverse stuffed but still raw binary string
        strHexTemp = this.reverseString(strHexTemp);
        // add a pretty space
        strHexTemp += " ";
        // assign and append AtoBtoA class's private data type
        strHex += strHexTemp.toString();
      }
      // trim off extra whitespace
      strHex = strHex.trim();
    } catch (BufferOverflowException e) {
      // try to clean out variables
      strHex = null;
      strHexTemp = null;
      throw e; // throw exception to caller;

    } catch (Exception e) {
      // try to clean out variables
      strHex = null;
      strHexTemp = null;
      throw e; // throw exeption to caller;
    }
  }

  /**
   * <p>
   * Input: None
   * </p>
   * <p>
   * Output: Returns a reference to the class's data variable, strHex
   * </p>
   */
  public String getHexString() {
    return strHex.toString();
  }

  /**
   * <p>
   * Input: An integer value of the line length<br />
   * <p>
   * Output: Returns a reference to a StringBuffer<br />
   * <p>
   * Description: inserts a line break at the point
   * </p>
   */
  public String getPrettyHexString(int lineLength) {
    StringBuffer myTemp = new StringBuffer();
    int i;

    // initialize variables
    myTemp.append(strHex.toString());
    i = lineLength;
    while (i < myTemp.length()) {
      // insert line break at index 30 - this will increase the string
      // lenght by 1
      myTemp.insert(i, "\n");
      // increment i by the line length plus 1 - 1 character is added each
      // insert
      i += (lineLength + 1);
    }
    return myTemp.toString();
  }
}
