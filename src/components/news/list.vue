<template>
  <div>
    <div style="margin-top:30px">
      <ul v-for="item in 5" :key="item">
        <li>
          <div style="display:flex">
            <img
              src="https://oimg.huolala.cn/cms/prd/2020-08-31/35fdaff5-1439-44b8-28ed-fa6506a6cce9.png"
              alt
            />
            <div class="ph-new">
              <a href="/detail">深圳市鹏辉前程汽车服务有限公司与货拉拉有限公司签约启动仪式</a>
              <div
                style="color: #9E9E9E;margin-top:20px"
              >​8月27日，货拉拉广州分公司联合广州公安反诈中心、广州交警支队指挥中心、广州交通局举办司机赋能大会，为平台司机开展反诈骗、交通安全培训。</div>
            </div>
            <div class="ph-time">
              <div style="font-size:30px">08-26</div>
              <div style="font-size:20px">2020</div>
            </div>
          </div>
        </li>
      </ul>
    </div>
    <div class="ph-page">
      <Page :total="100" />
    </div>
  </div>
</template>
<style  scoped>
.ph-company p {
  line-height: 30px;
  -webkit-animation-name: fadein;
  -moz-animation-name: fadein;
  -ms-animation-name: fadein;
  animation-name: fadein;
}
li {
  list-style: none;
  height: 170px;
}
li img {
  width: 200px;
  height: 130px;
}

.ph-new {
  margin-left: 50px;
  width: 500px;
  overflow: hidden;
}
.ph-new a {
  font-size: 16px;
  font-weight: bold;
  color: #333;
  overflow: hidden;
}
.ph-new a:hover {
  color: #e16531;
}
.ph-time {
  width: 100px;
  height: 100px;
  border: 1px solid #eee;
  border-radius: 10px;
  text-align: center;
  line-height: 50px;
  margin-left: 50px;
}
.ph-page{
  text-align: center;
}
</style>