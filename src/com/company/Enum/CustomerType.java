package com.company.Enum;

import org.jetbrains.annotations.Nullable;

enum CustomerType {
    INDIVIDUAL(1,"Individual"),
    COMPANY(2,"Company");
    private final int DB_VALUE;
    private final String REPORT_VALUE;

    public String getREPORT_VALUE() {
        return REPORT_VALUE;
    }

    public int getDB_VALUE() {
        return DB_VALUE;
    }
    CustomerType(int DB_VALUE,String REPORT_VALUE) {
        this.DB_VALUE = DB_VALUE;
        this.REPORT_VALUE = REPORT_VALUE;
    }
    public static @Nullable CustomerType getByReportValue(String reportValue){
        for (CustomerType iterator : values()) {
            if(iterator.getREPORT_VALUE().equalsIgnoreCase(reportValue)){
                return iterator;
            }
        }

        return null;
    }


}
