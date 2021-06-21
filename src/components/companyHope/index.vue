<template>
  <div>
    <div class="driver-div">
      <div
        style="width:100%;height:440px;position: absolute;text-align:center;padding:30px;color:white;font-size:40px;top:90px"
      >
        <span>助力企业物流转型升级</span>
        <span>·</span>
        <span>力推智能物流实体落地</span>
      </div>
    </div>
    <div style="text-align:center;margin:50px 0px;font-size:50px;font-weight:bold">
      <p>合作流程</p>
    </div>
    <div class="ph-carType">
      <ul>
        <li>
          <img
            src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2991720892,3744091777&fm=26&gp=0.jpg"
            alt
          />
          <h1>免费申请</h1>
        </li>
        <li>
          <img
            src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2498422615,836580288&fm=26&gp=0.jpg"
            alt
          />
          <h1>初步沟通</h1>
        </li>
        <li>
          <img
            src="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3756779852,4151493519&fm=26&gp=0.jpg"
            alt
          />
          <h1>签署协议</h1>
        </li>
        <li>
          <img
            src="https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3959570896,1640492214&fm=26&gp=0.jpg"
            alt
          />
          <h1>开展业务</h1>
        </li>
      </ul>
    </div>

    <div style="text-align:center;margin:50px 0px;font-size:50px;font-weight:bold">
      <p>成功案例</p>
    </div>
    <div class="ph-ourPower clearfix">
      <ul>
        <li>
          <img
            src="http://www.chinasie.com/uploadFile/web/94715d15dd9646ae85bbae76c70472b2.png"
            alt
          />
        </li>
        <li>
          <img
            src="http://www.chinasie.com/uploadFile/web/92fdfde05fc54168b28e1787cd965854.png"
            alt
          />
        </li>
        <li>
          <img
            src="http://www.chinasie.com/uploadFile/web/b579c962a53248499887909aca02b952.png"
            alt
          />
        </li>
         <li>
          <img
            src="http://www.chinasie.com/uploadFile/web/46a79d0afe474110a77013d8b16abeff.png"
            alt
          />
        </li>
         <li>
          <img
            src="http://www.chinasie.com/uploadFile/web/bd7262939834421183bc24f5f4733ae7.png"
            alt
          />
        </li>
         <li>
          <img
            src="http://www.chinasie.com/uploadFile/web/8f8ba5b6f46d42ac8674e88d90658ede.png"
            alt
          />
        </li>
       
      </ul>
    </div>
    <div style="text-align:center;margin:90px 0px;font-size:50px;font-weight:bold">
      <p>超多车型选择，满足企业物流配送任务</p>
    </div>
    <div class="ph-block clearfix">
      <ul v-for="item in 5" :key="item.id">
        <li>
          <img src="https://lalamc.huolala.cn/images/car1.png" alt />
          <div style="padding:20px">
            <h2>汉兰达七座(至尊版)</h2>
            <br />
            <p class="tags">
              <span>新能源</span>
              <span>免押金</span>
              <span>利息低</span>
            </p>
            <br />
             <p>型号：一汽红旗T90拖头</p>
            <p>体积：12m³</p>
            <p>续航里程：100km</p>
            <p>适合企业：中大型企业办公用品搬迁</p>
            <br />
            <p></p>
          </div>
        </li>
      </ul>
      <ul>
        <li>
          <img src="https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1313334212,519402177&fm=26&gp=0.jpg" alt />
          <div style="padding:20px">
            <h2>汉兰达七座(至尊版)</h2>
            <br />
            <p class="tags">
              <span>新能源</span>
              <span>免押金</span>
              <span>利息低</span>
            </p>
            <br />
            <p>型号：一汽红旗T90拖头</p>
            <p>型号：一汽红旗T90拖头</p>
            <p>型号：一汽红旗T90拖头</p>
            <p>型号：一汽红旗T90拖头</p>
            <br />
            <!-- <p></p> -->
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      formItem: {
        account: "",
        password: "",
      },
      ruleInline: {
        account: [
          {
            required: true,
            message: "请填写用户名",
            trigger: "blur",
          },
        ],
        password: [
          {
            required: true,
            message: "请填写密码",
            trigger: "blur",
          },
          {
            type: "string",
            min: 6,
            message: "密码长度不能小于6位",
            trigger: "blur",
          },
        ],
      },
    };
  },
};
</script>
<style scoped>
.driver-div {
  background-image: url("http://www.175jin.com/static/images/abbanner.jpg");
  background-size: auto 100%;
  height: 297px;
  width: 100%;
  position: relative;
}
.ph-carType {
  width: 1250px;
  margin: 0 auto;
  min-width: 1250px;
  height: 350px;
  display: block;
}
.ph-carType ul li {
  float: left;
  width: 25%;
  text-align: center;
}

.ph-carType img {
  width: 200px;
  height: 200px;
}

.ph-ourPower {
  width: 1250px;
  margin: 0 auto;
  min-width: 1250px;
  height: 350px;
  display: block;
}
.ph-ourPower img {
  width: 323px;
  height: 148px;
}
.ph-ourPower ul li {
  float: left;
  width: 33%;
  text-align: center;
}

.ph-block {
  width: 1250px;
  margin: 0 auto;
  min-width: 1250px;
  height: 350px;
  display: block;
}

.ph-block ul {
  width: 100%;
  box-sizing: border-box;
}
.clearfix {
  zoom: 1;
}
.clearfix::after {
  content: "\20";
  display: block;
  height: 0;
  clear: both;
}
.tags span {
  background: #eee;
  margin-right: 10px;
  color: #364554;
  border-radius: 5px;
  padding: 4px 8px;
}
.ph-block img {
  width: 402px;
  height: 209px;
}

.ph-block a {
  display: block;
  width: 100%;
  margin-top: 10px;
  background-color: #f16622;
  padding: 11px;
  text-align: center;
  color: #fff;
  border-radius: 3px;
  font-size: 14px;
}
.ph-block ul li {
  float: left;
  margin-right: 30px;
  background-color: #fff;
  margin-bottom: 30px;
  width: calc(32.3333333333% - 20px);
  border-radius: 5px;
  overflow: hidden;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}
ul,
ol {
  list-style: none;
}
</style>