package com.Paul_McGie;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pmcgie on 3/14/2017.
 */

public class LakeTimes {
    static Scanner numberScanner = new Scanner(System.in);
    static Scanner stringScanner = new Scanner(System.in);


    public static void main(String args[]) {

        /*Need to do the following:
            1. Ask for Lake Name
            2. Add Times
            3. Allow user option to stop entering times
            4. Ask user if they want to enter another lake w/ times
            5. get and print out lake names and max times
         */

        //Set it up for while loop
        String LakeName = "1";
        double Time_Response = 1;

        //Set up Array list of objects
        ArrayList<LakeRunning> LakeCollection = new ArrayList<>();

        //Enter Lake Name and corresponding times
        while (!LakeName.equals("0")) {

            //Ask for lake name
            System.out.println("Enter Lake Name (Enter '0' to be done entering lake names): ");
            LakeName = stringScanner.nextLine();

            LakeRunning Lake = new LakeRunning(LakeName);

            //Add Lake object
            if (LakeName.equals("0")) {
            } else {
                LakeCollection.add(Lake);
                Time_Response = 1;
            }

            while (Time_Response != 0) {
                //Ask user for time
                System.out.println("Enter Time (if done entering time enter '0')");
                Time_Response = numberScanner.nextDouble();

                //take into account user response

                if (Time_Response == 0) {
                    //terminates entering time for current name
                } else {
                    //Adds time to list
                    Lake.addTime(Time_Response);
                }
            }

        }

        //Display lakes with best times
        for (LakeRunning lake : LakeCollection) {
            System.out.println(lake.getName() + "   Best Time: " + lake.getBestTime());
        }

        //close out scanners
        numberScanner.close();
        stringScanner.close();

    }
}
