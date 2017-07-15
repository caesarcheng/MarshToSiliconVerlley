package ChaperSix.Array;

import com.edu.zju.cjx.MarshIntoSiliconVellery._Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by caesarcheng on 13/07/2017.
 */
public class IntervalMergeAndSubtraction {
    static List<_Interval> intervalSubtaction(List<_Interval> list1, List<_Interval> list2) {
        Collections.sort(list1);
        Collections.sort(list2);
        List<_Interval> list3 = new ArrayList<>();
        _Interval interval, interval2;
        int i = 0, j = 0;
        int len1 = list1.size(), len2 = list2.size();
        while (i < len1 && j < len2) {
            interval = list1.get(i);
            interval2 = list2.get(j);
            int x1 = interval.getBegin();
            int y1 = interval.getEnd();
            int x2 = interval2.getBegin();
            int y2 = interval2.getEnd();

            if (y1 > y2) {
                if (x1 < x2) {
                    list3.add(new _Interval(x1, x2));
                }
                interval.setBegin(Math.max(y2, x1));
                j++;
            } else if (y1 < y2) {
                if (x1 < x2) {
                    list3.add(new _Interval(x1, Math.min(y1, x2)));
                }
                i++;
            } else if (x1 == x2) {
                i++;
                j++;
            }
        }
        while (i < len1) {
            list3.add(list1.get(i++));
        }


        return list3;
    }

    static List<_Interval> intervalMerge(List<_Interval> list) {
        if (list.size() <= 0 || list == null) return null;
        Collections.sort(list);
        List<_Interval> list2 = new ArrayList<>();
        int i = 0, j = 1;
        int len = list.size();
        _Interval it1, it2;
        while (j < len) {
            it1 = list.get(i);
            it2 = list.get(j);
            if (it2.getBegin() > it1.getEnd()) {
                list2.add(it1);
            } else {
                it2.setBegin(it1.getBegin());
                it2.setEnd(Math.max(it1.getEnd(),it2.getEnd()));
            }
            i=j;
            j++;
        }
        if(i<len)
        list2.add(list.get(i));
        return list2;
    }

    public static void main(String[] args) {
        List<_Interval> list1 = new ArrayList<>();
        List<_Interval> list2 = new ArrayList<>();
        List<_Interval> list3;
        list2.add(new _Interval(-1, 0));
        list2.add(new _Interval(1, 2));
        list2.add(new _Interval(5, 7));
        list2.add(new _Interval(7, 9));
        list2.add(new _Interval(10, 11));
        list2.add(new _Interval(15, 16));
        list2.add(new _Interval(22, 40));
        list2.add(new _Interval(25, 26));
        list2.add(new _Interval(27, 29));


//        list1.add(new _Interval(3, 4));
//        list1.add(new _Interval(6, 8));
//        list1.add(new _Interval(9, 12));
//        list1.add(new _Interval(13, 14));
        list1.add(new _Interval(18, 29));
        list1.add(new _Interval(21, 23));
        list1.add(new _Interval(28, 37));
        list1.add(new _Interval(32, 34));
        list1.add(new _Interval(35, 36));
        list1.add(new _Interval(38, 39));



        list3 =intervalMerge(list2);

//        list3 = intervalSubtaction3(list1, list2);
        for (_Interval interval : list3) {
            System.out.println(interval.getBegin() + " , " + interval.getEnd());
        }
    }

}
