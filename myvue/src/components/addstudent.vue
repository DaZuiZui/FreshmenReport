<template>
    <div>
        <div style="margin: auto;width: 600px" id="enrolldate" class="animated zoomIn" v-cloak>
            <div style="margin: auto;width: 250px">
                <img class="mb-4" src="https://privateproject.oss-cn-hangzhou.aliyuncs.com/P03172022/logo.jpg" alt="" width="250" height="250">
            </div>
            <form v-on:submit.prevent="submit()">
                   <div class="form-group">
                    <label for="username">名字</label> 
                    <input type="text" class="form-control" id="username" name="username" v-model="userdata.name">
                </div>

                <div class="form-group">
                    <label for="email">学号</label>   
                    <input type="text" class="form-control" id="email" name="email" v-model="userdata.studentid">
                </div>
               
               <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="password">寝室楼</label>
                       
                        <input type="text" class="form-control" id="password" name="password" v-model="userdata.builder">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="erpassword">寝室房间号</label>   
                        <input type="text" class="form-control" id="erpassword" name="eqpassword" v-model="userdata.room">
                    </div>
                </div>

                <div class="form-row">
                    <div class="form-group col-md-4">
                        <label for="years">出生年份</label>  
                        <select id="years" name="years" class="form-control" v-model="userdata.year">
                            <option value="" disabled>--请选择--</option>
                            <option v-for="(year,index) in yearsList" :key="index">{{year}}</option>
                        </select>
                    </div>

                    <div class="form-group col-md-4">
                        <label for="month">出生月份</label> 
                        <select id="month" name="month" class="form-control" v-model="userdata.mouth">
                            <option value=""  disabled>--请选择--</option>
                            <option v-for="(month,index) in monthArray" :key="index">{{month}}</option>
                        </select>
                    </div>

                    <div class="form-group col-md-4" >
                        <label for="sex">性别</label> 
                        <select id="sex" name="sex" class="form-control" v-model="userdata.sex">
                            <option value=""  disabled>--请选择--</option>
                            <option>男</option>
                            <option>女</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"   style="width:600px;height: 50px;"> 添加这个学生</button> 
          
            </form>
 
        </div>
    </div>
</template>

<script>
    import Axios from 'axios'
    export default {
        name: "registered",

        data() {
            return{
                    userdata: {
                    
                        name: null,
                        year: null,
                        sex: null,
           studentid: null,
                        mouth: null,
                        email: null,
                    },
          
                    //用户数据是否合法校验
                    userformif: true,
                    //年份集合
                    yearsList: [1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015],
                    //月份集合
                    monthArray: [1,2,3,4,5,6,7,8,9,10,11,12],
                    //设置按钮为不可点击
                    formbutton: false,
                }
        },

        methods: {
            //注册
            submit() {
        
                      //更新表单按钮为不可提交
                       this.formbutton = true;
                       this.$axios.post("http://127.0.0.1/user/adduser",
                       this.userdata 
                       ).then(function (response) {
             
                            window.location.href="http://127.0.0.1:8080/"
                       })
                
            },
       }
    }
</script>
 
<style scoped>
  @import 'http://www.dazuizui.com:5002/static/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>
 