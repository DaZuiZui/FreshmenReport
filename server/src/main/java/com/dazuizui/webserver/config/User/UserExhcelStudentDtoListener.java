package com.dazuizui.webserver.config.User;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.dazuizui.webserver.pojo.Students;
import com.dazuizui.webserver.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class UserExhcelStudentDtoListener extends AnalysisEventListener<User> {
     public static List<User> list = new ArrayList<>();
    @Override
    public void invoke(User excelStudentDTO, AnalysisContext analysisContext) {
        list.add(excelStudentDTO);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("读取完毕");
    }
    public    List<User> get (){
        return this.list;
    }
}
