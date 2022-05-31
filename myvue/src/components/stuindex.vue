<template>
	<div>
		<div class="container-fluid">
			<div class="row">
	 
				<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
			        
					<div class="jumbotron jumbotron-fluid">
						<div class="container">
							<h1 class="display-4">学生操作系统主页</h1>
							<p class="lead">Welcome to the project</p>
						</div>
					</div>

                     <div style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="addoneuser()"  >上传缴费信息</el-button>
                    </div>

                    <div style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="drawer = true"   >我来报道了</el-button>
                    </div>

                    <div style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="drawer1 = true"  >查询自己寝室</el-button>
                    </div>
                </main>
                 
			</div>
		</div>
             <el-drawer
  title="我是标题"
  :visible.sync="drawer"
  :with-header="false">
                     <br>     <br>     <br>     <br>     <br>     <br>
                            请输入准考证号：
                            <el-input v-model="baodao.studentid" placeholder="请输入准考证号" disabled></el-input><br>
                            请输入名子：
                            <el-input v-model="baodao.name" placeholder="请输入准考证号"  disabled></el-input><br>
                            请选择登记时间：<br>
                                <el-date-picker style="width:100%"
                                    v-model="baodao.baodaoshijian"
                                    type="date"
                                    placeholder="选择日期">
                                    </el-date-picker><br>
                                    <button @click="update1()"  class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"    style="width:100%;height: 50px;"  > 报道</button> 
                        </el-drawer>
                                     <el-drawer
  title="我是标题"
  :visible.sync="drawer1"
  :with-header="false">





                     <br>     <br>     <br>     <br>     <br>     <br>
                            寝室楼
                            <el-input v-model="b" placeholder="请输入准考证号" disabled></el-input><br>
                            房间号
                            <el-input v-model="room" placeholder="请输入准考证号"  disabled></el-input><br>
                    
                                 
                                  
                        </el-drawer>
	</div>
</template>

<script>
import * as echarts from 'echarts';
export default {
	
  name: 'homeindex',
  data () {
    return {
        drawer: false,
		 fileList: [],
		 t: null,
         drawer1: false,
        option: {
			series: [
				{
				type: 'pie',
				data: [
		 
				]
				}
			]
		},
                baodao: {
            studentid: '',
            name: '',
            baodaoshijian: '',
        },
		bd: 0,
		b: '',
        room: '',
    }
  },
  methods: {
	   //身份验证
            checkinsin(){
                //获取token
                this.token = getCookie("token1");
                //解析token
                this.$axios.get("http://127.0.0.1/st/jiexiJWT?token="+this.token)
                .then((response) => {
					 //tood
                     this.$axios.get("http://127.0.0.1/stu/getthedatebystuid?studentid="+response.data)
                     .then(res => {
                        this.baodao.name = res.data.name;
                        this.baodao.studentid = res.data.studentid;
                     });


                     //查询寝室
                     this.$axios.get("http://127.0.0.1/stu/getthedatebystuid?studentid="+response.data)
                     .then(r => {
                        this.b = r.data.builder;
                        this.room = r.data.room;
                     })
                 }).catch(res =>{
					alert("您还没有登入!");
				    window.location.href="http://127.0.0.1:8080/stu/dengru";
				 })
            },

        addoneuser(){
		  window.location.href="http://127.0.0.1:8080/user/jfxt/";
	  },
       update1(){
          this.$axios.post("http://127.0.0.1/baodao/tianjiabaodao",this.baodao)
          .then(res => {
             alert("以报道");
          })
      },
  },
 

  //自启动
  mounted(){
    //身份验证 
    this.checkinsin();
  },
 
}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>