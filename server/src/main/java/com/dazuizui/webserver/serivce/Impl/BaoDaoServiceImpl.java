package com.dazuizui.webserver.serivce.Impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONAware;
import com.dazuizui.webserver.mapper.DaobaoMapper;
import com.dazuizui.webserver.pojo.BaoDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BaoDaoServiceImpl {
    @Autowired
    private DaobaoMapper  daobaoMapper;

    public String getquanbu(){
        return JSONArray.toJSONString(daobaoMapper.getquanbu());
    }
    /**
     * 获取全部报道数据
     * @return
     */
    public String getalldaobao(String start){
        return JSONArray.toJSONString(daobaoMapper.getalldaobao((Integer.valueOf(start)-1)*10));
    }

    /**
     * 添加报道
     */
    public String insertDateDaobao(@RequestBody BaoDao baoDao){
        baoDao.setBaodaoshijian(baoDao.getBaodaoshijian().substring(0,10));
        BaoDao getbaodaobystundentid = daobaoMapper.getbaodaobystundentid(baoDao.getStudentid());
        System.out.println(getbaodaobystundentid);
        if (getbaodaobystundentid == null)
            daobaoMapper.insertDateDaobao(baoDao);
        return "true";
    }

    /**
     * 通过studentid获取指定报道数据
     * @param studentid
     * @return
     */
    public String getbaodaobystundentid(String studentid){
        BaoDao getbaodaobystundentid = daobaoMapper.getbaodaobystundentid(studentid);
        return JSONArray.toJSONString(getbaodaobystundentid);
    }

    /**
     * 修改报道信息
     * @param baoDao
     */
    public void updateBystudentid(BaoDao baoDao){
        baoDao.setBaodaoshijian(baoDao.getBaodaoshijian().substring(0,10));
        System.err.println(baoDao);
        daobaoMapper.updateBystudentid(baoDao);
    }

    /**
     * 通过准考证号删除
     * @param studentid
     */
    public void deletedatebystudentid(@Param("studentid")String studentid){
        daobaoMapper.deletedatebystudentid(studentid);
    }
}
