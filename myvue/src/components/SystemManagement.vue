<template>
	<div>
		<div class="container-fluid">
			<div class="row">
				<nav class="col-md-2 d-none d-md-block bg-light sidebar"  >
					<div class="">
						<ul class="nav flex-column">
							<li><br> <br>  </li> 
							 
						 
						 
						</ul>

						<h6 class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">

               			<span>管理员操作</span>
			 
            			</h6>
						<ul class="nav flex-column mb-2">
 
							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									用户信息管理
								</a>
							</li>

							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/user/AdminManagement">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									管理员信息管理
								</a>
							</li>

							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/user/baodao">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									报道管理
								</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/user/paymanagement">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									缴费管理
								</a>
							</li>
														<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/user/room">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									寝室管理
								</a>
							</li>

														<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/classmanagement">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									班级管理
								</a>
							</li>
														<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/gonggao/management">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									公告管理
								</a>
							</li>
														<li class="nav-item">
								<a class="nav-link" href="http://127.0.0.1:8080/index">
									<svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text">
										<path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path>
										<polyline points="14 2 14 8 20 8"></polyline>
										<line x1="16" y1="13" x2="8" y2="13"></line>
										<line x1="16" y1="17" x2="8" y2="17"></line>
										<polyline points="10 9 9 9 8 9"></polyline>
									</svg>
									系统管理
								</a>
							</li>
						</ul>
					</div>
				</nav>
				<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
			        
					<div class="jumbotron jumbotron-fluid">
						<div class="container">
							<h1 class="display-4">首页</h1>
							<p class="lead">Welcome to the project</p>
						</div>
					</div>

           			<div  style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="beifen()">备份学生在数据库数据</el-button>
                    </div>

           			<div  style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="beifen1()">备份管理员在数据库数据</el-button>
                    </div>

       					<div  style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="liuyan()">留言</el-button>
                    </div>
					
					<br>
					<!--情况图-->
						    <div class="vol-data">
								<div class="charts" style="width:'100%',height:'6.54rem'">
									<div class="charts-title">
							 
									</div>
									<div id="myChart" :style="{width:'100%',height:'300px'}">
									</div>
								</div>
								</div>
				</main>
			</div>
		</div>
		<el-drawer
 size="50%"
  title="留言"
  :visible.sync="drawer"
  :direction="direction"
 >
  
  <el-input v-model="ly" placeholder="请输入内容"></el-input>
      <el-button size="small" type="primary" @click="fb()">留言</el-button>
	<hr>
	<el-card class="box-card">
  <div slot="header" class="clearfix">
    <span>留言列表</span>
  </div>
  <div v-for="o in lylist" :key="o" class="text item">
    {{'留言内容： ' + o.ly }}
	<hr>
  </div>
</el-card>



</el-drawer>
	</div>
</template>

<script>
import * as echarts from 'echarts';
export default {
	
  name: 'homeindex',
  data () {
    return {
		ly: '',
		drawer: false,
        direction: 'btt',
		 fileList: [],
		 t: null,
        option: {
			series: [
				{
				type: 'pie',
				data: [
		 
				]
				}
			]
		},
		bd: 0,
		 lylist: null,
    }
  },
  methods: {
	   //身份验证
            checkinsin(){
                //获取token
                this.token = getCookie("token");
                //解析token
                this.$axios.get("http://127.0.0.1/user/jiexiJWT?token="+this.token)
                .then((response) => {
					 //tood
                 }).catch(res =>{
					alert("您还没有登入!");
				    window.location.href="http://127.0.0.1:8080/user/login";
				 })
            },

			fb(){
				this.$axios.get("http://127.0.0.1/ly/add?ly="+this.ly)
				.then(res =>{
					window.location.href="http://127.0.0.1:8080/index";
				})
			},
	beifen(){
		this.$axios.get("http://127.0.0.1/stu/daochu")
		alert("备份成功,备份文件以保存到您的配置文件中，请注意查看")
	},
	liuyan(){
		this.drawer = true;
	},
		  beifen1(){
		  this.$axios.get("http://127.0.0.1/admin/daochu")
		  .then(res => {
			  alert("备份成功，备份信息保存到您的配置文件中")
		  })
	  },
		fileOK(){
			alert("导入成功");
			window.location.href="http://127.0.0.1:8080/";
		},
		fileON(){
			alert("导入失败，请检查是否为Excel文件,或者您的Excel文件不符合规则。");
		},
	  handleRemove(file, fileList) {
       
      },
      handlePreview(file) {
       
      },
	  addoneuser(){
		  window.location.href="http://127.0.0.1:8080/user/addstudent";
	  },
      handleExceed(files, fileList) {
 
      },

      beforeRemove(file, fileList) {
      
      },
	  deletestudent(id){
		//删除数据
		this.$axios.get("http://127.0.0.1/user/deletestudent?id="+id)
		.then(res => {
			alert("删除成功");
			window.location.href="http://127.0.0.1:8080/";
		})
	  },
	  updateTheUser(id){
		  window.location.href="http://127.0.0.1:8080/user/QueryTheDateOfStudent?id="+id;
	  }
  },
 

  //自启动
  mounted(){
    //身份验证 
    this.checkinsin();

	this.$axios.get("http://127.0.0.1/baogao/getallnumber")
	.then(res => {
		this.bd = res.data ;
		
				this.option.series[0].data.push({
						value: res.data,
						name: '报道人数'
					},);

						//渲染数据
	this.$axios.get("http://127.0.0.1/sut/getallconunt")
	.then(res => {
		this.option.series[0].data.push({
						value: res.data - this.bd,
						name: '未报道人数'
					},);
 

		var myChart = echarts.init(document.getElementById('myChart'));
    	myChart.setOption(this.option)
	})
	})
	
	//获取留言
	this.$axios.get("http://127.0.0.1/ly/sall")
	.then(res => {
		this.lylist = res.data;
	})
  },
}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>