import java.io.*;
import java.math.*;
import java.util.Scanner;

public class Person {
    String sPersonName;
    String sJobName;
    int iJobSelect;

    Person(){
        Scanner i = new Scanner(System.in);
        sPersonName = i.nextLine();

    }

    void JobSellect(){
        Scanner i = new Scanner(System.in);

        iJobSelect = i.nextInt();

        switch (iJobSelect)
        {
            case 1:
            {
                sJobName = "asfsadf";
                System.out.println(sJobName);

                break;
            }
            case 2:
            {
                sJobName = "ererrrre";
                System.out.println(sJobName);

                break;

            }
        }
    }

    void showData(){
        System.out.println(sPersonName);
        System.out.println(sJobName);

    }
}
