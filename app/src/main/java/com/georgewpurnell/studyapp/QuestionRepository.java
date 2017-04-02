package com.georgewpurnell.studyapp;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by georgewpurnell on 4/1/17.
 */

public class QuestionRepository {
    static ArrayList<String> keyList = new ArrayList<String>();

    static Hashtable<String, String> Questions
            = new Hashtable<>();
    public static void putInRepository(String question, String answer) {
        Questions.put(question, answer);
        keyList.add(question);
        System.out.println(answer);
    }


    public static ArrayList<String> getKeyList() {
        return keyList;
    }

    public static String getAnswer(String key) {
        return Questions.get(key);
    }
}
