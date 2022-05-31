<template>
	<div>
		<div class="container-fluid">
			<div class="row">
 

				<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
			        
					<div class="jumbotron jumbotron-fluid">
						<div class="container">
							<h1 class="display-4">缴费信息上传</h1>
							<p class="lead">Welcome to the project</p>
						</div>
					</div>
 
					<el-input v-model="studentid" placeholder="请输入学号" style="width:50%"></el-input>

					<br>
                    <el-upload
                        class="upload-demo"
                        drag
                        name="files"
                        :action="'http://127.0.0.1/uploadimage?studentid='+studentid"
                        multiple>
                        <i class="el-icon-upload"></i>
                        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
                    
                    </el-upload>
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
		studentid: '',
		 fileList: [],
		 t: null,
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
		//获取数据 
		this.$axios.get("http://127.0.0.1/user/getAllPay")
		.then(res => {
			 this.t = res.data;
		})
  },

}
</script>
 
 <style scoped>
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/js/dazuiblog.js';
  @import 'https://dazuiblog.oss-cn-hangzhou.aliyuncs.com/webstatic/dazuiblog/userlogin.css';
  @import 'https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css'; 
</style>