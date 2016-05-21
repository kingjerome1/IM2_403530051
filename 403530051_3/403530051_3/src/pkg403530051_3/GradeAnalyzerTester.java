/*
* [A]100
* [TA's Advise]
* 1. Good!
*/
package pkg403530051_3;

import pkg403530051_3.GradeAnalyzer;
import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
    public static void main(String[] args) {
        double TempScore = 0;  
        String TempInput = "";  //接收使用者的輸入
        GradeAnalyzer GA = new GradeAnalyzer();  //使用GradeAnalyzer
        
        while(true){ //當輸入東西的時候進入下一行
            TempInput = JOptionPane.showInputDialog(null, "!!!請輸入一個分數!!!");
            if (TempInput.equalsIgnoreCase("q")){ //當輸入q或Q的時候離開   
                break;
            }
            try{ //用try catch把不合規定的數字抓出來
                GA.addGrade(Double.parseDouble(TempInput));
            } catch (Exception e) {
                System.out.println("請輸入可用的數字!");
            }
        }
        //缺少判斷是否<2, -2.
        GA.analyzeGrades();
        //列出輸出格式
        System.out.println("You entered " + GA.CntUserInput + "Valid grades from 0 to 110.  Invalid grades are ignored! ");
        //顯示出平均和標準差
        System.out.println("The average = " + (int) GA.Avg + " with a standard deviation = " + (int) GA.SD);
        //將GradeAnalyzer中toString()內的文字顯示出來
        System.out.println(GA);
    }
}        
