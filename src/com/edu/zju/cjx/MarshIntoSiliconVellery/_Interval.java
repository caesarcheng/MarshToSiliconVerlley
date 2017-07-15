package com.edu.zju.cjx.MarshIntoSiliconVellery;

/**
 * Created by caesarcheng on 13/07/2017.
 */
public class _Interval implements Comparable<_Interval>{
    private int begin;
    private int end;

    public _Interval(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public int getBegin() {
        return begin;
    }



    public int getEnd() {
        return end;
    }


    @Override
    public int compareTo(_Interval o) {
        if( this.begin-o.getBegin()>0){
            return 1;
        }else if ( this.begin-o.getBegin()<0){
            return -1;
        }else{
            if(this.end -o.getEnd()>0){
                return 1;
            }else if(this.end-o.getEnd()<0){
                return -1;
            }else{
                return 0;
            }
        }

    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
