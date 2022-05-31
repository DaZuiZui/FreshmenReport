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
                    		<h2>申请理赔管理</h2>
                            <br>
                                <button @click="adopt()"  class="btn btn-lg btn-primary btn-block"   type="submit"  id="sub"    style="width:100%;height: 50px;"   > 通过</button> 
                                <button @click="out()"  class="btn btn-lg btn-primary btn-block" type="submit"  id="sub"    style="width:100%;height: 50px;"  > 拒绝</button> 
                            <br>
				 

                     

                        <div style="float:left;margin:top:20px;width:50%">
                        	 <div class="demo-image__lazy">
  <el-image v-for="url in urls" :key="url" :src="url" lazy></el-image>
</div>
                        </div>

	 
				</main>
         
			</div>
		</div>

		<el-dialog
            title="提示"
            :visible.sync="dialogVisible"
            width="30%"
            :before-close="handleClose">
            <span>我已同意解理赔须知，如果不同意请关闭此窗口</span>
            <span slot="footer" class="dialog-footer">
                <el-button type="primary" @click="ok()">我同意</el-button>
            </span>
        </el-dialog>
        
	</div>
</template>

<style>
  .el-carousel__item h3 {
    color: #475669;
    font-size: 14px;
    opacity: 0.75;
    line-height: 200px;
    margin: 0;
  }
  
  .el-carousel__item:nth-child(2n) {
    background-color: #99a9bf;
  }
  
  .el-carousel__item:nth-child(2n+1) {
    background-color: #d3dce6;
  }
</style>

<script>
export default {
  name: 'policyMaintanance',
  data () {
    return {
		dis: false,
		   active: 1,
        dialogVisible: false,
        fits: ['fill'],
             urls: [
 
        ]
 
    }
  },  
  //自启动
  mounted(){
    //身份验证 
    this.checkinsin();
    //获取图片
    
    this.$axios.get("http://127.0.0.1/pay/getpyimagelist?studentid="+getQueryVariable("studentid"))
    .then(res =>{
        for(let i = 0; i <res.data.length ;i++){
            this.urls.push(res.data[i]);
        }
    });
     
  },
     methods: {
 
        adopt(){
            this.$axios.get("http://127.0.0.1/pay/updatestateze?studentid="+getQueryVariable("studentid")+"&state=审核通过")
            .then(res =>{
                window.location.href="http://127.0.0.1:8080/user/paymanagement";
            })
        },
        out(){
            this.$axios.get("http://127.0.0.1/pay/updatestateze?studentid="+getQueryVariable("studentid")+"&state=审核拒绝")
            .then(res =>{
                window.location.href="http://127.0.0.1:8080/user/paymanagement";
            })
        },
	  xianshi(){
		  this.dialogVisible = true;
	  },
	  ok(){
		this.dialogVisible = false;
	 	 //window.location.href = "http://127.0.0.1:8080/user/csa";
	  },
      handleClose(done) {
        this.$confirm('确认关闭？')
          .then(_ => {
            done();
			window.location.href="http://127.0.0.1:8080/"
          })
          .catch(_ => {});
      },
	  	  	   //身份验证
            checkinsin(){
                //获取token
                this.token = getCookie("token");
                //解析token
                this.$axios.get("http://127.0.0.1/user/jiexiJWT?token="+this.token)
                .then((response) => {
					 
                 }).catch(res =>{
					alert("您还没有登入!");
				    window.location.href="http://127.0.0.1:8080/user/login";
				 })
            },
	 
    },
  
}
</script>

<style>
.demo-image__lazy .el-image {
    display: block;
    min-height: 200px;
    margin-bottom: 10px;
}

</style>
 
 