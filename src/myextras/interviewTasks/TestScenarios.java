package myextras.interviewTasks;

import java.util.Arrays;
import java.util.Collections;

public class TestScenarios {

    public static void main(String[] args) {

        char str1[] = {'t', 'e', 's', 't'};
        char str2[] = {'e', 's', 't', 't'};

        //output ==> false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        boolean istrue = true;
        if(str1.length != str2.length) {
            istrue = false;
        }
        else {
            for (int i = 0; i < str1.length; i++) {
                istrue = str1[i] == str2[i];
                }

            }
        System.out.println(istrue);

        }
    }

