/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeclause_pdf.spliter.project;

import javax.swing.UIManager;

/**
 *
 * @author HP
 */
public class CodeClause_PDFSpliterProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       MainWindow mw=new MainWindow();
       mw.setVisible(true);
    }   
}