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
public class convertAtoB {
  private String strBinary;

  /**
   * <p>
   * This constructor initializes the class's data variable, strBinary
   * </p>
   */
  public convertAtoB() {
    // initialize variable
    strBinary = ""; // the returned final buffer storing a binary
    // representation of the input string
  }

  /**
   * <p>
   * Input: A reference to a string, rawBinString<br />
   * <p>
   * Output: Returns a reference to a binary string stuffed with 0's to make an 8
   * bit binary string<br />
   * <p>
   * Description: get the length of the input string and subtract that by 8. this
   * will give the length of the string of 0's which is appended to the input
   * string and returned as a string.
   * </p>
   */
  private String appendZeros(String rawBinString) {
    int numOfZeros = 0;
    String strZero = ""; // string of 0's

    // get # of 0's to stuff to make 8 bits
    numOfZeros = 8 - rawBinString.length();
    // append zeros to temporary buffer
    for (int j = 0; j < numOfZeros; j++) {
      strZero += "0";
    }
    // concat strZero with temporary buffer
    return (rawBinString += strZero);
  }

  /**
   * <p>
   * Input: A reference to a string, rawBinString<br />
   * <p>
   * Output: Returns a reference to a binary string that is the reverse of the
   * input string<br />
   * <p>
   * Description: initialize a StringBuffer with the input string and call the
   * StringBuffer's reverse method and return.
   * </p>
   */
  private String reverseString(String rawBinString) {
    // need to reverse the temporary buffer - will use string buffer due to
    // laziness
    StringBuffer myTemp = new StringBuffer();
    myTemp.append(rawBinString);
    return (myTemp.reverse().toString());
  }

  /**
   * <p>
   * Input: A reference to a string to loop over<br />
   * <p>
   * Output: Returns a reference to a string of 0's and 1's<br />
   * <p>
   * Description: Loop over the input string processing each character's decimal
   * representation and doing a modulus 2 to get it's binary representation. each
   * character is stored in a temporary buffer to be stuffed with 0's to make an 8
   * bit representation which is appended into a final buffer that is returned if
   * finished without error. This method throws a catch-all Exception and a
   * BufferOverflowException
   * </p>
   */
  public void convertStringToBinString(String strAscii) throws Exception, BufferOverflowException {
    String strBinTemp; // temp buffer to store characters binary rep
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
        strBinTemp = "";
        while (quotient != 0) {
          // get modulus
          remainder = quotient % 2;
          // get the new quotient
          quotient = quotient / 2;
          // insert it into the buffer string
          strBinTemp += remainder;
        }
        // append 0's to raw binary string
        strBinTemp = this.appendZeros(strBinTemp.toString());
        // reverse stuffed but still raw binary string
        strBinTemp = this.reverseString(strBinTemp);
        // assign and append AtoBtoA class's private data type
        strBinary += strBinTemp.toString();
      }
    } catch (BufferOverflowException e) {
      // try to clean out variables
      strBinary = null;
      strBinTemp = null;
      throw e; // throw exception to caller;
    } catch (Exception e) {
      // try to clean out variables
      strBinary = null;
      strBinTemp = null;
      throw e; // throw exeption to caller;
    }
  }

  /**
   * <p>
   * Input: None
   * </p>
   * <p>
   * Output: Returns a reference to the class's data variable, strBinary
   * </p>
   */
  public String getBinString() {
    return strBinary.toString();
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
  public String getPrettyBinString(int lineLength) {
    StringBuffer myTemp = new StringBuffer();
    int i;
    // initialize variables
    myTemp.append(strBinary.toString());
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
