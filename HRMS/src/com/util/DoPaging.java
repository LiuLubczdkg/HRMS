package com.util;

/**
 * Created by lenovo on 2017/12/25.
 */
public class DoPaging {
    private static final int pageSize=5;

    public static int getTotalPages(int totalRows){
        int totalPages=totalRows%pageSize==0?totalRows/pageSize:totalRows/pageSize+1;
        return totalPages;
    }
}
