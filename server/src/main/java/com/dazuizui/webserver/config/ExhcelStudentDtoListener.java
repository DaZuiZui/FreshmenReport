package com.dazuizui.webserver.config;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class ExhcelStudentDtoListener extends AnalysisEventListener<Students> {
     public static List<Students> list = new ArrayList<>();
    @Override
    public void invoke(Students excelStudentDTO, AnalysisContext analysisContext) {
        list.add(excelStudentDTO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("读取完毕");
    }
    public    List<Students> get (){
        return this.list;
    }
}
