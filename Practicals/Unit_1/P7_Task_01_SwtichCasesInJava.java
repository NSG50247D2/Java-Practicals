package Unit_1;

import java.text.SimpleDateFormat;
import java.util.*;

public class P7_Task_01_SwtichCasesInJava {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		SwitchCase sc=new SwitchCase();
        System.out.print("Enter your choice\n 1.Current Year, 2. Current Month, 3. Current Date: ");
        int manual=in.nextInt();
        sc.display(manual);
		in.close();
	}

}

class SwitchCase{

    void display(int manual)
    {
        switch(manual)
        {
            case 1: Date curr_yr=new Date();
                SimpleDateFormat sdf=new SimpleDateFormat("YYYY");
                System.out.println("Year "+sdf.format(curr_yr));
                break;
            case 2: Date curr_m=new Date();
                sdf=new SimpleDateFormat("MM");
                System.out.println("Month "+sdf.format(curr_m));
                break;
            case 3: Date curr_day=new Date();
                sdf=new SimpleDateFormat("dd");
                System.out.println("Day "+sdf.format(curr_day));
                break;
            case 4:
                System.out.println("Not Applicable");
                break;
            default:
                System.out.println("Invalid argument");
        }
    }
}
