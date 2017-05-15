package com.example.vigneshsm.task8;

import java.util.ArrayList;

/**
 * Created by Vignesh S.M on 4/26/2017.
 */

public class Data {
    public static ArrayList<Information> getData(){
        ArrayList<Information> data=new ArrayList<>();
        String[] usernames={"a","b","c","d"};
        String[] locations={"newdelhi","chennai","kolkata","mumbai"};
        for(int i=0;i<usernames.length;i++)
        {
            Information current=new Information();
            current.username=usernames[i];
            current.location=locations[i];
            data.add(current);

        }
        return data;
    }

}
