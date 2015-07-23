package com.example.android.popularmovies;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by admin on 11-07-2015.
 */
public class Utility {

    public static final String API_KEY_CODE = "api_key";
    public static final String API_KEY_VALUE = "0758a2d908b7f1295d294bd800b7b763";


    public static String getPreferredSortBy(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_sort_key),
                context.getString(R.string.pref_sort_most_popular));
    }

    public static boolean isFavoriteOption(Context context) {
        return Utility.getPreferredSortBy(context).equals(context.getString(R.string
                .pref_sort_favorite));
    }
}
