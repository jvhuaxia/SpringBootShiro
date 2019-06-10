package com.example.demo62.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtils {
    public static final String dateFormat = "yyyy-MM-dd";
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

    public static String dateToString(Date date) {
        return simpleDateFormat.format(date);
    }

    public static Date stringToDate(String date) {
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println(e);
            return new Date();
        }

    }

    public static void main(String[] args) {

        System.out.println(dateToString(new Date()));

//        System.out.println(hasDigit("asd1sa"));
        System.out.println(stringIsNumber("15"));
    }

    public static void printMyLog(Object log) {
        System.out.println("----------------------------------------------------------------");
        System.out.println(log);
        System.out.println("----------------------------------------------------------------");
    }

    public static boolean hasDigit(String content) {
        boolean flag = false;
        Pattern p = Pattern.compile(".*\\d+.*");
        Matcher m = p.matcher(content);
        if (m.matches()) {
            flag = true;
        }
        return flag;
    }

    public static boolean stringIsNumber(String str) {
        Pattern pattern = Pattern.compile("-?[0-9]*.?[0-9]*");
        Matcher matcher = pattern.matcher((CharSequence) str);
        boolean result = matcher.matches();
        return result;
    }
}
