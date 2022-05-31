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
								<a class="nav-link" href="http://127.0.0.1:8080/admin/insuredmangement">
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
								<a class="nav-link" href="http://127.0.0.1:8080/admin/insuredmangement">
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
								<a class="nav-link" href="http://127.0.0.1:8080/admin/insuredmangement">
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
								<a class="nav-link" href="http://127.0.0.1:8080/admin/insuredmangement">
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
							<h1 class="display-4">新生报到管理系统</h1>
							<p class="lead">Welcome to the project</p>
						</div>
					</div>


                    <div style="float:left;"> 
                        <div>
                            &nbsp;<el-button size="small" type="primary" @click="getall()">查询全部信息</el-button>
                        </div>
                    </div>
 

                    <div>
                        &nbsp;<el-button size="small" type="primary" @click="drawer = true">通过学号查询数据</el-button>
                    </div>

					 <br>
	                    <div class="table-responsive">
						<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th>准考证号</th>
									<th>姓名</th>
									<th>寝室类别</th>
									<th>寝室楼</th>
									<th>房间号</th>
                                    <th>操作</th>
								</tr>
							</thead>
							<tbody v-for="(article,index) in t" :key="index">
								<tr>
									<td>{{article.studentid}}</td>
									<td>{{article.name}}</td>
									<td>{{article.sex}}生寝室</td>
          
                                    <td>{{article.builder}}</td>
									<td>{{article.room}}</td>
									<td>
                                        <button type="button" class="btn btn-warning" @click="updateTheUser(article.id)">修改</button>
                                    </td>
								</tr>
							</tbody>
						</table>
					</div>
					
				                                                    <!--码页-->
                                                    <div  >
                                                            <el-pagination
                                                                background
                                                                @current-change="getMerchantInformation"
                                                                :current-page="start"
                                                                layout="prev, pager, next"
                                                                :total="end">
                                                            </el-pagination>
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
                            <el-input v-model="studentid" placeholder="请输入准考证号" ></el-input><br>
              
                            <button @click="getthedate()"  class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"    style="width:100%;height: 50px;"  > 查询</button> 
                        </el-drawer>
	</div>
</template>

<script>
export default {
  name: 'homeindex',
  data () {
    return {
		 fileList: [],
		 t: null,
        drawer: false,
				          start: 1,   
                end: 0,
    studentid: ''
    }
  },
  methods: {
	  	           //跳转指定页面
            getMerchantInformation(val){   
                this.articlelist = null;
                var l = 0; //总长度
                this.$axios.get("http://127.0.0.1/user/selectAll?start="+val)
                .then((response) => {
              
                         this.t = response.data;
                       
                    
                });
             
 
            },
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

		fileOK(){
			alert("导入成功");
			window.location.href="http://127.0.0.1:8080/";
		},

        getthedate(){
            this.$axios.get("http://127.0.0.1/stu/getthedatebystuid?studentid="+this.studentid)
            .then(res => {
                //this.t = res.data;
                this.t = [];
                this.t.push(res.data);
            })
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
		  window.location.href="http://127.0.0.1:8080/room/update?id="+id;
	  },
      getall(){
          	//获取数据 
		this.$axios.get("http://127.0.0.1/user/selectAll")
		.then(res => {
			 window.location.href="http://127.0.0.1:8080/user/room"
		})
      }
  },
  //自启动
  mounted(){
    //身份验证 
    this.checkinsin();
			    this.$axios.get("http://127.0.0.1/sut/getallconunt").then(res =>{
                    this.end = Number(res.data);
                }).catch(res => {
                    alert("服务器繁忙")
                })
	this.getMerchantInformation(1);
  },

}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>