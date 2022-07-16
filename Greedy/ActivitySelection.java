package Greedy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/
public class ActivitySelection {
    static class Activity implements Comparable<Activity>{
        int start;
        int end;
        Activity(int start,int end){
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Activity o) {
            return this.end - o.end;
        }
        @Override
        public String toString(){
            return this.start+" "+this.end;
        }
    }
    public static void main(String[] args) {
        Activity a1 = new Activity(1,2);
        Activity a2 = new Activity(5,6);
        Activity a3 = new Activity(4,5);
        Activity a4 = new Activity(1,3);
        List<Activity> list = new LinkedList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        Collections.sort(list);

        System.out.println(list);

    }
}
