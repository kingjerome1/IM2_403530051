package pkg403530051_3;
import java.util.ArrayList;

class MyCount { 
    String name;
    int cnt;
 
    MyCount(){        
    }
    //name用來給RANK cnt用來計數
    MyCount(String _name, int _cnt){ 
        this.name = _name;
        this.cnt = _cnt;
    }
    //使用Override
    public String toString(){
        return this.name + "=" + this.cnt;
    }
}

public class GradeAnalyzer {
   
    int CntUserInput = 0;
    double TotalNum = 0, SD = 0, Avg = 0, GetNum = 0, SDtemp = 0;
    ArrayList<Double> NumScore = new ArrayList<Double>();
    MyCount[] GradeDistri = new MyCount[11]; //陣列[0]~[10]所以需要11個空間
    boolean FirstTime = true;
    //使用靜態方法抓可用的數字
    static boolean isValidGrade(double aGrade){
        if (aGrade <= 110 && aGrade >= 0)
            return true; //正確就true
        return false; //錯誤就false
    }
    
    void addGrade(double aGrade){ //用ArrayList的方式把每個分數分類
	//Good, +2.
        if (FirstTime) { 
            GradeDistri[0] = new MyCount("A+", 0);
            GradeDistri[1] = new MyCount("A", 0);
            GradeDistri[2] = new MyCount("A-", 0);
            GradeDistri[3] = new MyCount("B+", 0);
            GradeDistri[4] = new MyCount("B", 0);
            GradeDistri[5] = new MyCount("B-", 0);
            GradeDistri[6] = new MyCount("C+", 0);
            GradeDistri[7] = new MyCount("C", 0);
            GradeDistri[8] = new MyCount("C-", 0);
            GradeDistri[9] = new MyCount("D", 0);
            GradeDistri[10] = new MyCount("F", 0);
            FirstTime = false;
        }
        
        if(!isValidGrade(aGrade)){
            return;
        }
        NumScore.add(aGrade);
        TotalNum += aGrade;
        CntUserInput++;
        if (aGrade > 90){ //將A+ A  A-進行分類
            if (aGrade >= 98)
                GradeDistri[0].cnt++;
            else if (aGrade >=92)
                GradeDistri[1].cnt++;
            else
                GradeDistri[2].cnt++;
        }else if (aGrade > 80){ //將B+ B  B-進行分類
            if (aGrade >= 88)
                GradeDistri[3].cnt++;
            else if (aGrade >= 82)
                GradeDistri[4].cnt++;
            else
                GradeDistri[5].cnt++;            
        }else if (aGrade > 70){  //將C+ C  C-進行分類
            if (aGrade >=78)
                GradeDistri[6].cnt++;
            else if (aGrade >=72)
                GradeDistri[7].cnt++;
            else
                GradeDistri[8].cnt++;
        }else{
            if (aGrade >= 60)  //這是D
                GradeDistri[9].cnt++;
            else  //這是F
                GradeDistri[10].cnt++;
        }
    }
    
    void analyzeGrades(){
        Avg = TotalNum / CntUserInput;  //計算平均分數和標準差
        for (int i = 0; i < NumScore.size(); i++){
            SDtemp += (NumScore.get(i) - Avg) * (NumScore.get(i) - Avg);
        }  
        SD = Math.round((Math.sqrt(SDtemp / CntUserInput)));  //應題目要求使用四捨五入法
    }
    //使用Override將輸出格式變成題目要求的樣子
    public String toString(){
        String rlt = "";
        for (int i = 0 ; i < GradeDistri.length ; i++){
            rlt += GradeDistri[i] + "\n";
        }
        return "The grade distribution is:\n\n" + rlt;
    }
}
