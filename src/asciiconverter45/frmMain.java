package asciiconverter45;

import java.awt.AWTEvent;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.nio.BufferOverflowException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;

/**
 * <p>
 * Title: Ascii Converter 4.5
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
public class frmMain extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTabbedPane jTabbedPane1 = new JTabbedPane();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanelB = new JPanel();
  private JLabel jLabel1 = new JLabel();
  private JPanel jPanelH = new JPanel();
  private JLabel jLabel2 = new JLabel();
  private JPanel jPanel2 = new JPanel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JScrollPane jScrollPane1 = new JScrollPane();
  private JLabel jLabel5 = new JLabel();
  private JScrollPane jScrollPane2 = new JScrollPane();
  private JScrollPane jScrollPane3 = new JScrollPane();
  private JScrollPane jScrollPane4 = new JScrollPane();
  private JLabel jLabel6 = new JLabel();
  private JButton jButtonAtoB = new JButton();
  private JButton jButtonClear1 = new JButton();
  private JButton jButtonBtoA = new JButton();
  private JButton jButtonClear2 = new JButton();
  private JLabel jLabel7 = new JLabel();
  private JLabel jLabel8 = new JLabel();
  private JPanel jPanel3 = new JPanel();
  private JPanel jPanel4 = new JPanel();
  private JLabel jLabel9 = new JLabel();
  private JLabel jLabel10 = new JLabel();
  private JScrollPane jScrollPane5 = new JScrollPane();
  private JScrollPane jScrollPane6 = new JScrollPane();
  private JScrollPane jScrollPane7 = new JScrollPane();
  private JScrollPane jScrollPane8 = new JScrollPane();
  private JTextArea jTextAreaAscii3 = new JTextArea();
  private JTextArea jTextAreaHex1 = new JTextArea();
  private JTextArea jTextAreaHex2 = new JTextArea();
  private JTextArea jTextAreaAscii4 = new JTextArea();
  private JLabel jLabel11 = new JLabel();
  private JLabel jLabel12 = new JLabel();
  private JButton jButtonClear3 = new JButton();
  private JButton jButtonAtoH = new JButton();
  private JButton jButtonHtoA = new JButton();
  private JButton jButtonClear4 = new JButton();
  private JButton jButtonClearAll = new JButton();
  private JButton jButtonExit = new JButton();
  private JMenuBar jMenuBar1 = new JMenuBar();
  private JMenu jMenuFile = new JMenu();
  private JMenuItem jMenuFileExit = new JMenuItem();
  private JMenu jMenuHelp = new JMenu();
  private JMenuItem jMenuHelpUse = new JMenuItem();
  private JMenuItem jMenuHelpAbout = new JMenuItem();
  private JTextArea jTextAreaAscii1 = new JTextArea();
  private JTextArea jTextAreaBinary1 = new JTextArea();
  private JTextArea jTextAreaBinary2 = new JTextArea();
  private JTextArea jTextAreaAscii2 = new JTextArea();

  // Construct the frame
  public frmMain() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Component initialization
  private void jbInit() throws Exception {
    setIconImage(Toolkit.getDefaultToolkit().createImage(frmMain.class.getResource("/vj_blood.png")));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(null);
    this.setJMenuBar(jMenuBar1);
    this.setResizable(false);
    this.setSize(new Dimension(625, 650));
    this.setTitle("Ascii Converter 4.5 by Megaspaz");
    jTabbedPane1.setBounds(new Rectangle(7, 10, 610, 520));
    jTabbedPane1.addChangeListener(new frmMain_jTabbedPane1_changeAdapter(this));
    jPanel1.setBorder(BorderFactory.createEtchedBorder());
    jPanel1.setBounds(new Rectangle(7, 29, 280, 428));
    jPanel1.setLayout(null);
    jPanelB.setLayout(null);
    jLabel1.setMaximumSize(new Dimension(93, 15));
    jLabel1.setMinimumSize(new Dimension(93, 15));
    jLabel1.setPreferredSize(new Dimension(93, 15));
    jLabel1.setRequestFocusEnabled(false);
    jLabel1.setVerifyInputWhenFocusTarget(true);
    jLabel1.setText("Ascii To Binary");
    jLabel1.setBounds(new Rectangle(7, 6, 97, 22));
    jPanelH.setLayout(null);
    jLabel2.setBounds(new Rectangle(300, 6, 97, 22));
    jLabel2.setText("Binary To Ascii");
    jLabel2.setVerifyInputWhenFocusTarget(true);
    jLabel2.setRequestFocusEnabled(false);
    jLabel2.setPreferredSize(new Dimension(93, 15));
    jLabel2.setMinimumSize(new Dimension(93, 15));
    jLabel2.setMaximumSize(new Dimension(93, 15));
    jPanel2.setLayout(null);
    jPanel2.setBounds(new Rectangle(300, 29, 280, 428));
    jPanel2.setBorder(BorderFactory.createEtchedBorder());
    jLabel3.setBounds(new Rectangle(6, 3, 111, 18));
    jLabel3.setText("Ascii String");
    jLabel3.setVerifyInputWhenFocusTarget(true);
    jLabel3.setPreferredSize(new Dimension(71, 15));
    jLabel3.setRequestFocusEnabled(true);
    jLabel3.setMinimumSize(new Dimension(71, 15));
    jLabel3.setMaximumSize(new Dimension(71, 15));
    jLabel3.setDisplayedMnemonic('a');
    jLabel3.setLabelFor(jTextAreaAscii1);
    jLabel4.setMaximumSize(new Dimension(83, 15));
    jLabel4.setMinimumSize(new Dimension(83, 15));
    jLabel4.setRequestFocusEnabled(true);
    jLabel4.setPreferredSize(new Dimension(80, 15));
    jLabel4.setVerifyInputWhenFocusTarget(true);
    jLabel4.setText("Binary String");
    jLabel4.setBounds(new Rectangle(7, 2, 83, 16));
    jLabel4.setDisplayedMnemonic('b');
    jLabel4.setLabelFor(jTextAreaBinary2);
    jScrollPane1.setBounds(new Rectangle(6, 23, 266, 145));
    jScrollPane1.setAutoscrolls(true);
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jLabel5.setBounds(new Rectangle(6, 183, 111, 18));
    jLabel5.setText("Converted Binary");
    jScrollPane2.setBounds(new Rectangle(6, 204, 266, 145));
    jScrollPane2.setAutoscrolls(true);
    jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane3.setAutoscrolls(true);
    jScrollPane3.setBounds(new Rectangle(7, 23, 266, 145));
    jScrollPane4.setBounds(new Rectangle(7, 203, 266, 145));
    jScrollPane4.setAutoscrolls(true);
    jScrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jLabel6.setBounds(new Rectangle(7, 183, 102, 16));
    jLabel6.setText("Converted Ascii");
    jButtonAtoB.setBounds(new Rectangle(6, 366, 119, 52));
    jButtonAtoB.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonAtoB.setPreferredSize(new Dimension(116, 19));
    jButtonAtoB.setText("Convert To Binary");
    jButtonAtoB.addActionListener(new frmMain_jButtonAtoB_actionAdapter(this));
    jButtonAtoB.setMnemonic('n');
    jButtonClear1.setBounds(new Rectangle(152, 366, 119, 52));
    jButtonClear1.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonClear1.setText("Clear This Frame");
    jButtonClear1.addActionListener(new frmMain_jButtonClear1_actionAdapter(this));
    jButtonClear1.setMnemonic('t');
    jButtonBtoA.setText("Convert To Ascii");
    jButtonBtoA.addActionListener(new frmMain_jButtonBtoA_actionAdapter(this));
    jButtonBtoA.setPreferredSize(new Dimension(107, 19));
    jButtonBtoA.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonBtoA.setBounds(new Rectangle(7, 365, 119, 52));
    jButtonBtoA.setMnemonic('s');
    jButtonClear2.setText("Clear This Frame");
    jButtonClear2.addActionListener(new frmMain_jButtonClear2_actionAdapter(this));
    jButtonClear2.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonClear2.setBounds(new Rectangle(153, 365, 119, 52));
    jButtonClear2.setMnemonic('l');
    jLabel7.setText("Ascii To Hex");
    jLabel7.setBounds(new Rectangle(7, 6, 97, 23));
    jLabel8.setBounds(new Rectangle(300, 6, 83, 23));
    jLabel8.setText("Hex To Ascii");
    jPanel3.setBorder(BorderFactory.createEtchedBorder());
    jPanel3.setBounds(new Rectangle(7, 29, 280, 428));
    jPanel3.setLayout(null);
    jPanel4.setLayout(null);
    jPanel4.setBounds(new Rectangle(300, 29, 280, 428));
    jPanel4.setBorder(BorderFactory.createEtchedBorder());
    jLabel9.setText("Ascii String");
    jLabel9.setDisplayedMnemonic('i');
    jLabel9.setLabelFor(jTextAreaAscii3);
    jLabel9.setBounds(new Rectangle(6, 3, 111, 18));
    jLabel10.setText("Hex String");
    jLabel10.setDisplayedMnemonic('g');
    jLabel10.setLabelFor(jTextAreaHex2);
    jLabel10.setBounds(new Rectangle(7, 3, 82, 15));
    jScrollPane5.setBounds(new Rectangle(6, 23, 266, 145));
    jScrollPane6.setBounds(new Rectangle(6, 204, 266, 145));
    jScrollPane7.setBounds(new Rectangle(7, 23, 266, 145));
    jScrollPane8.setBounds(new Rectangle(7, 203, 266, 145));
    jTextAreaAscii3.setText("");
    jTextAreaAscii3.setLineWrap(true);
    jTextAreaAscii3.setWrapStyleWord(true);
    jTextAreaHex1.setEditable(false);
    jTextAreaHex1.setText("");
    jTextAreaHex1.setLineWrap(true);
    jTextAreaHex1.setWrapStyleWord(true);
    jTextAreaHex2.setText("");
    jTextAreaHex2.setLineWrap(true);
    jTextAreaHex2.setWrapStyleWord(true);
    jTextAreaAscii4.setEditable(false);
    jTextAreaAscii4.setText("");
    jTextAreaAscii4.setLineWrap(true);
    jTextAreaAscii4.setWrapStyleWord(true);
    jLabel11.setBounds(new Rectangle(6, 184, 111, 16));
    jLabel11.setText("Converted Hex");
    jLabel12.setText("Converted Ascii");
    jLabel12.setBounds(new Rectangle(7, 183, 102, 17));
    jButtonClear3.setMnemonic('r');
    jButtonClear3.setText("Clear This Frame");
    jButtonClear3.addActionListener(new frmMain_jButtonClear3_actionAdapter(this));
    jButtonClear3.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonClear3.setBounds(new Rectangle(152, 366, 119, 52));
    jButtonAtoH.setMnemonic('o');
    jButtonAtoH.setText("Convert To Hex");
    jButtonAtoH.addActionListener(new frmMain_jButtonAtoH_actionAdapter(this));
    jButtonAtoH.setPreferredSize(new Dimension(116, 19));
    jButtonAtoH.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonAtoH.setBounds(new Rectangle(6, 366, 119, 52));
    jButtonHtoA.setMnemonic('v');
    jButtonHtoA.setBounds(new Rectangle(7, 365, 119, 52));
    jButtonHtoA.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonHtoA.setPreferredSize(new Dimension(107, 19));
    jButtonHtoA.setText("Convert To Ascii");
    jButtonHtoA.addActionListener(new frmMain_jButtonHtoA_actionAdapter(this));
    jButtonClear4.setMnemonic('m');
    jButtonClear4.setBounds(new Rectangle(153, 365, 119, 52));
    jButtonClear4.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonClear4.setText("Clear This Frame");
    jButtonClear4.addActionListener(new frmMain_jButtonClear4_actionAdapter(this));
    jButtonClearAll.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonClearAll.setBounds(new Rectangle(315, 525, 121, 45));
    jButtonClearAll.addActionListener(new frmMain_jButtonClearAll_actionAdapter(this));
    jButtonClearAll.setText("Clear All");
    jButtonClearAll.addActionListener(new frmMain_jButtonClearAll_actionAdapter(this));
    jButtonClearAll.addActionListener(new frmMain_jButtonClearAll_actionAdapter(this));
    jButtonClearAll.addActionListener(new frmMain_jButtonClearAll_actionAdapter(this));
    jButtonClearAll.setMnemonic('c');
    jButtonExit.setBorder(BorderFactory.createRaisedBevelBorder());
    jButtonExit.setBounds(new Rectangle(464, 525, 119, 45));
    jButtonExit.addActionListener(new frmMain_jButtonExit_actionAdapter(this));
    jButtonExit.setText("Exit");
    jButtonExit.addActionListener(new frmMain_jButtonExit_actionAdapter(this));
    jButtonExit.addActionListener(new frmMain_jButtonExit_actionAdapter(this));
    jButtonExit.setMnemonic('x');
    jButtonExit.addActionListener(new frmMain_jButtonExit_actionAdapter(this));
    jMenuFile.setText("File");
    jMenuFile.setMnemonic('f');
    jMenuFileExit.setText("Exit");
    jMenuFileExit.addActionListener(new frmMain_jMenuFileExit_actionAdapter(this));
    jMenuFileExit.setMnemonic('x');
    jMenuHelp.setText("Help");
    jMenuHelp.setMnemonic('h');
    jMenuHelpUse.setText("How To Use");
    jMenuHelpUse.addActionListener(new frmMain_jMenuHelpUse_actionAdapter(this));
    jMenuHelpUse.setMnemonic('u');
    jMenuHelpAbout.setText("About");
    jMenuHelpAbout.addActionListener(new frmMain_jMenuHelpAbout_actionAdapter(this));
    jMenuHelpAbout.setMnemonic('a');
    jTextAreaAscii1.setText("");
    jTextAreaAscii1.setLineWrap(true);
    jTextAreaAscii1.setWrapStyleWord(true);
    jTextAreaBinary1.setWrapStyleWord(true);
    jTextAreaBinary1.setEditable(false);
    jTextAreaBinary1.setText("");
    jTextAreaBinary1.setWrapStyleWord(true);
    jTextAreaBinary2.setText("");
    jTextAreaBinary2.setLineWrap(true);
    jTextAreaBinary2.setWrapStyleWord(true);
    jTextAreaAscii2.setEditable(false);
    jTextAreaAscii2.setText("");
    jTextAreaAscii2.setLineWrap(true);
    jTextAreaAscii2.setWrapStyleWord(true);
    jTabbedPane1.add(jPanelB, "Binary");
    jTabbedPane1.setMnemonicAt(0, KeyEvent.VK_Y);
    jPanelB.add(jLabel1, null);
    jPanelB.add(jPanel1, null);
    jPanel1.add(jLabel3, null);
    jPanel1.add(jScrollPane1, null);
    jScrollPane1.getViewport().add(jTextAreaAscii1, null);
    jPanel1.add(jLabel5, null);
    jPanel1.add(jScrollPane2, null);
    jPanel1.add(jButtonAtoB, null);
    jPanel1.add(jButtonClear1, null);
    jPanelB.add(jLabel2, null);
    jPanelB.add(jPanel2, null);
    jPanel2.add(jLabel4, null);
    jPanel2.add(jScrollPane3, null);
    jPanel2.add(jScrollPane4, null);
    jPanel2.add(jLabel6, null);
    jPanel2.add(jButtonBtoA, null);
    jPanel2.add(jButtonClear2, null);
    jTabbedPane1.add(jPanelH, "Hex");
    jPanelH.add(jLabel7, null);
    jPanelH.add(jLabel8, null);
    jPanelH.add(jPanel3, null);
    jPanel3.add(jLabel9, null);
    jPanel3.add(jScrollPane5, null);
    jScrollPane5.getViewport().add(jTextAreaAscii3, null);
    jPanel3.add(jScrollPane6, null);
    jPanel3.add(jLabel11, null);
    jPanel3.add(jButtonAtoH, null);
    jPanel3.add(jButtonClear3, null);
    jScrollPane6.getViewport().add(jTextAreaHex1, null);
    jPanelH.add(jPanel4, null);
    jPanel4.add(jLabel10, null);
    jPanel4.add(jScrollPane7, null);
    jPanel4.add(jScrollPane8, null);
    jTabbedPane1.setMnemonicAt(1, KeyEvent.VK_E);

    contentPane.add(jTabbedPane1, null);
    jScrollPane7.getViewport().add(jTextAreaHex2, null);
    jScrollPane8.getViewport().add(jTextAreaAscii4, null);
    jPanel4.add(jButtonClear4, null);
    jPanel4.add(jButtonHtoA, null);
    jPanel4.add(jLabel12, null);
    contentPane.add(jButtonClearAll, null);
    contentPane.add(jButtonExit, null);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuHelp);
    jMenuFile.add(jMenuFileExit);
    jMenuHelp.add(jMenuHelpUse);
    jMenuHelp.add(jMenuHelpAbout);
    jScrollPane2.getViewport().add(jTextAreaBinary1, null);
    jScrollPane3.getViewport().add(jTextAreaBinary2, null);
    jScrollPane4.getViewport().add(jTextAreaAscii2, null);

    // disable focus for jTabbedPane1
    jTabbedPane1.setFocusable(false);
  }

  // Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }

  void jButtonClearAll_actionPerformed(ActionEvent e) {
    if (0 == jTabbedPane1.getSelectedIndex()) {
      // clear all text areas in binary tab
      jTextAreaAscii1.setText("");
      jTextAreaBinary1.setText("");
      jTextAreaAscii2.setText("");
      jTextAreaBinary2.setText("");
      // request focus for ascii1 text area - default focus
      jTextAreaAscii1.requestFocus();
    } else {
      // clear all text areas in hex tab
      jTextAreaAscii3.setText("");
      jTextAreaHex1.setText("");
      jTextAreaAscii4.setText("");
      jTextAreaHex2.setText("");
      // request focus for ascii3 text area - default focus
      jTextAreaAscii3.requestFocus();
    }
  }

  void jButtonExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  void jButtonClear1_actionPerformed(ActionEvent e) {
    // clear text areas in Ascii To Binary Panel
    jTextAreaAscii1.setText("");
    jTextAreaBinary1.setText("");
    // request focus for ascii text area
    jTextAreaAscii1.requestFocus();
  }

  void jButtonAtoB_actionPerformed(ActionEvent e) {
    // need to create conversion class for ascii to binary
    convertAtoB convertString = new convertAtoB();
    JFrame frame = new JFrame();

    try {
      // clear out the decoded text area
      jTextAreaBinary1.setText("");
      // check if user entered anything
      if (0 == jTextAreaAscii1.getText().length()) {
        JOptionPane.showMessageDialog(frame, "No User Input", "Conversion Error", JOptionPane.WARNING_MESSAGE);
        // request focus
        jTextAreaAscii1.requestFocus();
      } else {
        // convert the text to binary
        convertString.convertStringToBinString(jTextAreaAscii1.getText().toString());
        // get the binary string and set the jTextAreaBinary1 text Area
        jTextAreaBinary1.setText(convertString.getPrettyBinString(24));
      }
    } catch (BufferOverflowException err) {
      String errMsg = "Error: A Buffer Overflow Has Occured.  Try Breaking Up Your Message\n"
          + "Into Smaller Parts And Then Try The Conversion Again.";
      // clear input textarea
      jTextAreaAscii1.setText("");
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg, "Buffer Overflow", JOptionPane.WARNING_MESSAGE);
      // clear out text areas in panel ascii to binary
      jTextAreaBinary1.setText("");
      jTextAreaAscii1.requestFocus();
    } catch (Exception err) {
      String errMsg = "Error: " + err.getMessage().toString() + "\nCause: " + err.getCause().toString()
          + "\nIf This Problem Persists, Please Send An Email To " + "vjong@jandjgraphics.com\n"
          + "Include The Error Message And The Cause Message";
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg.toString(), "Unknown Error", JOptionPane.WARNING_MESSAGE);
      // exit program with error code 1
      System.exit(1);
    }
  }

  void jButtonBtoA_actionPerformed(ActionEvent e) {
    // need to create conversion class for binary to ascii
    String strAsc;
    JFrame frame = new JFrame();
    convertBtoA convertString = new convertBtoA();

    try {
      // clear out decoded text area
      jTextAreaAscii2.setText("");
      // check if user entered anything
      if (0 == jTextAreaBinary2.getText().length()) {
        JOptionPane.showMessageDialog(frame, "No User Input", "Conversion Error", JOptionPane.WARNING_MESSAGE);
        // request focus
        jTextAreaBinary2.requestFocus();
      } else {
        convertString.convertStringToAscString(jTextAreaBinary2.getText().toString());
        strAsc = convertString.getAscii();
        jTextAreaAscii2.setText(strAsc.toString());
      }
    } catch (BufferOverflowException err) {
      String errMsg = "Error: A Buffer Overflow Has Occured.  Try Breaking Up Your Message\n"
          + "Into Smaller Parts And Then Try The Conversion Again.";
      // clear input text area
      jTextAreaBinary2.setText("");
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg, "Buffer Overflow", JOptionPane.WARNING_MESSAGE);
      // clear out text areas in binary->ascii panel
      jTextAreaAscii2.setText("");
      jTextAreaBinary2.requestFocus();

    } catch (IllegalArgumentException err) {
      // clear out input textarea
      jTextAreaBinary2.setText("");
      // display error dialog
      JOptionPane.showMessageDialog(frame,
          "Conversion Error - After Stripping Your Binary String,\n"
              + "Your Binary String Length Is Still Not A Multiple Of 8.\n"
              + "Or Your Binary String Has Characters Other Than " + "0's And 1's\n"
              + "Please Check Your Binary String And Try Again.",
          "Conversion Error", JOptionPane.WARNING_MESSAGE);
      // clear out all text areas
      jTextAreaAscii2.setText("");
      // set focus of offending text area
      jTextAreaBinary2.requestFocus();
    } catch (Exception err) {
      String errMsg = "Error: " + err.getMessage().toString() + "\nCause: " + err.getCause().toString()
          + "\nIf This Problem Persists, Please Send An Email To " + "vjong@jandjgraphics.com\n"
          + "Include The Error Message And The Cause Message";
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg.toString(), "Unknown Error", JOptionPane.WARNING_MESSAGE);
      // exit program with error code 1
      System.exit(1);
    }
  }

  void jButtonAtoH_actionPerformed(ActionEvent e) {
    // need to create conversion class for ascii to binary
    convertAtoH convertString = new convertAtoH();
    JFrame frame = new JFrame();

    try {
      // clear out the decoded text area
      jTextAreaHex1.setText("");
      // check if user entered anything
      if (0 == jTextAreaAscii3.getText().length()) {
        JOptionPane.showMessageDialog(frame, "No User Input", "Conversion Error", JOptionPane.WARNING_MESSAGE);
        // request focus
        jTextAreaAscii3.requestFocus();
      } else {
        // convert the text to binary
        convertString.convertStringToHexString(jTextAreaAscii3.getText().toString());
        // get the binary string and set the jTextAreaBinary1 text Area
        jTextAreaHex1.setText(convertString.getPrettyHexString(24));
      }
    } catch (BufferOverflowException err) {
      String errMsg = "Error: A Buffer Overflow Has Occured.  Try Breaking Up Your Message\n"
          + "Into Smaller Parts And Then Try The Conversion Again.";
      // clear input textarea
      jTextAreaAscii3.setText("");
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg, "Buffer Overflow", JOptionPane.WARNING_MESSAGE);
      // clear out text areas in panel ascii to binary
      jTextAreaHex1.setText("");
      jTextAreaAscii3.requestFocus();
    } catch (Exception err) {
      String errMsg = "Error: " + err.getMessage().toString() + "\nCause: " + err.getCause().toString()
          + "\nIf This Problem Persists, Please Send An Email To " + "vjong@jandjgraphics.com\n"
          + "Include The Error Message And The Cause Message";
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg.toString(), "Unknown Error", JOptionPane.WARNING_MESSAGE);
      // exit program with error code 1
      System.exit(1);
    }
  }

  void jButtonHtoA_actionPerformed(ActionEvent e) {
    // need to create conversion class for binary to ascii
    String strAsc;
    JFrame frame = new JFrame();
    convertHtoA convertString = new convertHtoA();

    try {
      // clear out decoded text area
      jTextAreaAscii4.setText("");
      // check if user entered anything
      if (0 == jTextAreaHex2.getText().length()) {
        JOptionPane.showMessageDialog(frame, "No User Input", "Conversion Error", JOptionPane.WARNING_MESSAGE);
        // request focus
        jTextAreaHex2.requestFocus();
      } else {
        convertString.convertStringToAscString(jTextAreaHex2.getText().toString());
        strAsc = convertString.getAscii();
        jTextAreaAscii4.setText(strAsc.toString());
      }
    } catch (BufferOverflowException err) {
      String errMsg = "Error: A Buffer Overflow Has Occured. Try Breaking Up Your Message\n"
          + "Into Smaller Parts And Then Try The Conversion Again.";
      // clear input text area
      jTextAreaHex2.setText("");
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg, "Buffer Overflow", JOptionPane.WARNING_MESSAGE);
      // clear out text areas in binary->ascii panel
      jTextAreaAscii4.setText("");
      jTextAreaHex2.requestFocus();
    } catch (IllegalArgumentException err) {
      // clear out input textarea
      jTextAreaHex2.setText("");
      // display error dialog
      JOptionPane.showMessageDialog(frame,
          "Characters Other Than 0 - 9 Or A - F Entered OR\n"
              + "The Length Of The String To Convert Is Not A Multiple Of 2.",
          "Conversion Error", JOptionPane.WARNING_MESSAGE);
      // clear out all text areas
      jTextAreaAscii4.setText("");
      // set focus of offending text area
      jTextAreaHex2.requestFocus();
    } catch (Exception err) {
      String errMsg = "Error: " + err.getMessage().toString() + "\nCause: " + err.getCause().toString()
          + "\nIf This Problem Persists, Please Send An Email To " + "vjong@jandjgraphics.com\n"
          + "Include The Error Message And The Cause Message";
      // display exception dialog
      JOptionPane.showMessageDialog(frame, errMsg.toString(), "Unknown Error", JOptionPane.WARNING_MESSAGE);
      // exit program with error code 1
      System.exit(1);
    }
  }

  void jButtonClear2_actionPerformed(ActionEvent e) {
    // clear text areas in Binary to Ascii Panel
    jTextAreaAscii2.setText("");
    jTextAreaBinary2.setText("");
    // request focus for binary text area
    jTextAreaBinary2.requestFocus();
  }

  void jButtonClear3_actionPerformed(ActionEvent e) {
    // clear text areas in Ascii To Binary Panel
    jTextAreaAscii3.setText("");
    jTextAreaHex1.setText("");
    // request focus for ascii text area
    jTextAreaAscii3.requestFocus();
  }

  void jButtonClear4_actionPerformed(ActionEvent e) {
    // clear text areas in Binary to Ascii Panel
    jTextAreaAscii4.setText("");
    jTextAreaHex2.setText("");
    // request focus for binary text area
    jTextAreaHex2.requestFocus();
  }

  void jTabbedPane1_stateChanged(ChangeEvent e) {
    if (0 == jTabbedPane1.getSelectedIndex()) {
      jTextAreaAscii1.requestFocus();
    } else {
      jTextAreaAscii3.requestFocus();
    }
  }

  void jMenuFileExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  void jMenuHelpUse_actionPerformed(ActionEvent e) {
    JFrame frame = new JFrame();

    String strTitle = "Using Ascii Converter 4.5";
    String strUsage = "To convert a regular English message to binary,\n"
        + "click the Binary tab and enter the message in the Ascii String textbox\n"
        + "and click the Convert To Binary button.\n\n" + "To convert a binary string into it a regular\n"
        + "English message, click the Binary tab and enter the binary string " + "(0's and 1's)\n"
        + "into the Binary String text box and click the\n" + "Convert To Ascii button.\n\n"
        + "To convert a regular English message to hex,\n"
        + "click the Hex tab and enter the message in the Ascii String textbox\n"
        + "and click the Convert To Hex button.\n\n" + "To convert a Hex string into it a regular\n"
        + "English message, click the Hex tab and enter the Hex string (0-9,A-F)\n"
        + "into the Hex String text box and click the\n" + "Convert To Ascii button.\n\n"
        + "To close the About Window, click anywhere on the About Window.";
    JOptionPane.showMessageDialog(frame, strUsage.toString(), strTitle.toString(), JOptionPane.INFORMATION_MESSAGE);
  }

  void jMenuHelpAbout_actionPerformed(ActionEvent e) {
    frmAbout dlg = new frmAbout(this);
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.pack();
    dlg.setVisible(true);
  }
}

class frmMain_jButtonClearAll_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonClearAll_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonClearAll_actionPerformed(e);
  }
}

class frmMain_jButtonExit_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonExit_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonExit_actionPerformed(e);
  }
}

class frmMain_jButtonAtoB_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonAtoB_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonAtoB_actionPerformed(e);
  }
}

class frmMain_jButtonClear1_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonClear1_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonClear1_actionPerformed(e);
  }
}

class frmMain_jButtonBtoA_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonBtoA_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonBtoA_actionPerformed(e);
  }
}

class frmMain_jButtonClear2_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonClear2_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonClear2_actionPerformed(e);
  }
}

class frmMain_jButtonAtoH_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonAtoH_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonAtoH_actionPerformed(e);
  }
}

class frmMain_jButtonClear3_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonClear3_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonClear3_actionPerformed(e);
  }
}

class frmMain_jButtonHtoA_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonHtoA_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonHtoA_actionPerformed(e);
  }
}

class frmMain_jButtonClear4_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jButtonClear4_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButtonClear4_actionPerformed(e);
  }
}

class frmMain_jTabbedPane1_changeAdapter implements javax.swing.event.ChangeListener {
  frmMain adaptee;

  frmMain_jTabbedPane1_changeAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void stateChanged(ChangeEvent e) {
    adaptee.jTabbedPane1_stateChanged(e);
  }
}

class frmMain_jMenuFileExit_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jMenuFileExit_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuFileExit_actionPerformed(e);
  }
}

class frmMain_jMenuHelpUse_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jMenuHelpUse_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuHelpUse_actionPerformed(e);
  }
}

class frmMain_jMenuHelpAbout_actionAdapter implements java.awt.event.ActionListener {
  frmMain adaptee;

  frmMain_jMenuHelpAbout_actionAdapter(frmMain adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuHelpAbout_actionPerformed(e);
  }
}
