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
							<h1 class="display-4">新生报到管理系统</h1>
							<p class="lead">Welcome to the project</p>
						</div>
					</div>

                    <div style="float:left;"> 
                        <el-upload
                            class="upload-demo"
                            name="files"
                            action="http://127.0.0.1/user/addAdmin"
                            :on-preview="handlePreview"
                            :on-success="fileOK"
                            :on-error="fileON"
                            :on-remove="handleRemove"
                            :before-remove="beforeRemove"
                            multiple
                            :limit="3"
                            :on-exceed="handleExceed"
                            :file-list="fileList">
                            <el-button size="small" type="primary">从Excel导入数据</el-button>

                        </el-upload>
                    </div>

                    <div  style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="addoneuser()">添加一个管理员</el-button>
                    </div>

           			<div  style="float:left;">
                        &nbsp;<el-button size="small" type="primary" @click="beifen()">备份数据</el-button>
                    </div>

					 <br>
	                    <div class="table-responsive">
						<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th>账号</th>
									<th>密码</th>
                                    <th>操作</th>
								</tr>
							</thead>
							<tbody v-for="(article,index) in t" :key="index">
								<tr>
									<td style="width:40%">{{article.username}}</td>
									<td style="width:40%">{{article.password}}</td>
									<td>
                                        <button type="button" class="btn btn-primary" @click="deletestudent(article.username)">删除</button>
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
	</div>
</template>

<script>
export default {
  name: 'homeindex',
  data () {
    return {
		 fileList: [],
		 t: null,
		 		          start: 1,   
                end: 0,
      msg: 'Welcome to Your Vue.js App'
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
        addoneuser(){
          window.location.href="http://127.0.0.1:8080/user/addoneadmin";
        },
		fileOK(){
			alert("导入成功");
			window.location.href="http://127.0.0.1:8080/";
		},
		fileON(){
			alert("导入失败，请检查是否为Excel文件,或者您的Excel文件不符合规则。或者username不唯一");
		},
	  handleRemove(file, fileList) {
       
      },
	  beifen(){
		  this.$axios.get("http://127.0.0.1/admin/daochu")
		  .then(res => {
			  alert("备份成功，备份信息保存到您的配置文件中")
		  })
	  },
      handlePreview(file) {
       
      },

      handleExceed(files, fileList) {
 
      },

      beforeRemove(file, fileList) {
      
      },
	  deletestudent(id){
		//删除数据
		this.$axios.get("http://127.0.0.1/user/deltetheadmin?username="+id)
		.then(res => {
			alert("删除成功");
			window.location.href="http://127.0.0.1:8080/user/AdminManagement";
		})
	  },
	  updateTheUser(id){
		  window.location.href="http://127.0.0.1:8080/user/QueryTheDateOfStudent?id="+id;
	  },
	       //跳转指定页面
            getMerchantInformation(val){   
		 
                this.articlelist = null;
                var l = 0; //总长度
                this.$axios.get("http://127.0.0.1/user/selectalladmin?start="+val)
                .then((response) => {
                         this.t = response.data;
                       
                    
                });
            },
  },
  //自启动
  mounted(){
    //身份验证 
    this.checkinsin();
		//获取数据 
		this.$axios.get("http://127.0.0.1/user/user/galln")
		.then(res => {
			 this.end = Number(res.data);
		});

		this.getMerchantInformation(1);
  },

}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>