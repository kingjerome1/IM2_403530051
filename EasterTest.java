import java.util.Scanner;

interface  Easter1{
    public String calculateEaster();
    public int getResult(); 
    }

public class Easter 
{
    public static void main(String[] args)
    {
        System.out.print("請您輸入想要計算復活節的西元年份: ");
        Scanner input = new Scanner(System.in);
        int num = getResult(input);       
        while(num <= 0)
        {
            System.out.print("請勿輸入負數唷=ˇ=");
            num = getResult(input);
        }
        System.out.println(calculateEaster(num));
        
        Easter easter_2001 = new Easter(2001,0,0);
		Easter easter_2012 = new Easter(2012,0,0);
		
		System.out.println(easter_2001.toString());
		System.out.println(easter_2012.toString());
    }

    public static int getResult(Scanner input)
    {
        while(!input.hasNextInt())
        {
            System.out.print("請您照著正確的年份輸入");
            input.nextLine();
        }
        return input.nextInt();
    }

    public static String calculateEaster(int aYear)
    {
        int a = aYear % 19,
            b = aYear / 100,
            c = aYear % 100,
            d = b / 4,
            e = b % 4,
            g = (8 * b + 13) / 25,
            h = (19 * a + b - d - g + 15) % 30,
            j = c / 4,
            k = c % 4,
            m = (a + 11 * h) / 319,
            r = (2 * e + 2 * j - k - h + m + 32) % 7,
            n = (h - m + r + 90) / 25,
            p = (h - m + r + n + 19) % 32;

        String result;
        switch(n)
        {
            case 1:
                result = "January ";
                break;
            case 2:
                result = "February ";
                break;
            case 3:
                result = "March ";
                break;
            case 4:
                result = "April ";
                break;
            case 5:
                result = "May ";
                break;
            case 6:
                result = "June ";
                break;
            case 7:
                result = "July ";
                break;
            case 8:
                result = "August ";
                break;
            case 9:
                result = "September ";
                break;
            case 10:
                result = "October ";
                break;
            case 11:
                result = "November ";
                break;
            case 12:
                result = "December ";
                break;
            default:
                result = "error";
        }

        return result + p;
    }

}
