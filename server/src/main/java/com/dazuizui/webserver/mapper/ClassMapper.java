package com.dazuizui.webserver.mapper;

import com.dazuizui.webserver.pojo.ClassT;
import com.dazuizui.webserver.pojo.Students;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ClassMapper {
    //添加一个学生数据
    @Insert("insert into classT value(null,#{studentid},#{name},#{year},#{zhuanye},#{bclass})")
    public void insert(ClassT classT);

    @Select("select *from classT")
    public ArrayList<ClassT> getAll();

    /**
     *
     * @param studentid
     * @return
     */
    @Select("select *from classT where studentid = #{studentid}")
    public ClassT getTheClassOftheStundet(@Param("studentid") String studentid);

    @Update("update classT set zhuanye = #{zhuanye},bclass = #{bclass},year = #{year} where studentid = #{studentid}")
    public void Updatethestudentclass(Students students);

    @Delete("delete from classT where studentid = #{studentid}")
    public void deleteStudentid(@Param("studentid")String studentid);
}
