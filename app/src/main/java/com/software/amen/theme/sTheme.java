package com.software.amen.theme;

import android.app.Activity;
import android.content.Intent;

public class sTheme {
    private static int cTheme;


    public final static int t1 = 1;

    public final static int t2 = 2;

    public final static int t3 = 3;

    public final static int t4 = 4;

    public final static int t5 = 5;

    public final static int t6 = 6;

    public static void changeToTheme(Activity activity, int theme) {

        cTheme = theme;

        activity.finish();


        activity.startActivity(new Intent(activity, activity.getClass()));


    }

    public static void onActivityCreateSetTheme(Activity activity) {

        switch (cTheme)

        {

            default:

            case t1:

                activity.setTheme(R.style.AppTheme1);

                break;

            case t2:

                activity.setTheme(R.style.AppTheme2);

                break;
            case t3:

                activity.setTheme(R.style.AppTheme3);

                break;

            case t4:

                activity.setTheme(R.style.AppTheme4);

                break;

            case t5:

                activity.setTheme(R.style.AppTheme5);

                break;

            case t6:

                activity.setTheme(R.style.AppTheme6);

                break;

        }

    }

}
