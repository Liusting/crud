<template>
  <div>
    <div v-for="(item,index) in contactList">
      <div class="ph-contact">
        <span>
          <img width="72" height="72" :src="item.imageUrl" alt />
        </span>
        <span style="margin-left:30px">
          <p style="font-size:18px;font-weight:bold">{{item.name}}</p>
          <p>{{item.contactWay}}</p>
        </span>
      </div>
    </div>
    <div id="map" style="width:700px;height:400px;"></div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      contactList: [
        {
          id: 1,
          name: "市场商务合作",
          contactWay: "phqc_marketing@163.com",
          imageUrl: "https://www.huolala.cn/rs/img/ic_cu_01.png",
        },
        {
          id: 1,
          name: "企业合作",
          contactWay: "phqc_qy@163.com",
          imageUrl: "https://www.huolala.cn/rs/img/ic_cu_04.png",
        },
        {
          id: 1,
          name: "客服热线",
          contactWay: "1010363",
          imageUrl: "https://www.huolala.cn/rs/img/ic_cu_02.png",
        },
        {
          id: 1,
          name: "我要吐槽",
          contactWay: "phqc_marketing@163.com",
          imageUrl: "https://www.huolala.cn/rs/img/ic_cu_05.png",
        },
        {
          id: 1,
          name: "公司地址",
          contactWay: "广东省深圳市龙岗区龙城街道嶂背社区嶂背路466号2#宿舍511",
          imageUrl: "https://www.huolala.cn/rs/img/ic_cu_03.png",
        },
      ],
      longitude: 114.251457,
      latitude: 22.687798,
    };
  },
  methods: {
    init() {
      let that = this;
      var center = new qq.maps.LatLng(this.latitude, this.longitude);
      var map = new qq.maps.Map(document.getElementById("map"), {
        center: center,
        zoom: 18,
        disableDefaultUI: true,
      });
      //地图标点文本
      var label = new qq.maps.Label({
        position: center,
        map: map,
        content: "深圳市鹏辉前程汽车服务有限公司",
        style: {padding: "1px 5px",borderRadius: "5px",border: "1px solid #D7290F", zIndex: 99,fontSize:"18px"},
      });
      //地图标点图片
      var anchor = new qq.maps.Point(0, 39),
        size = new qq.maps.Size(42, 68),
        origin = new qq.maps.Point(0, 0),
        icon = new qq.maps.MarkerImage(
          "https://3gimg.qq.com/lightmap/api_v2/2/4/99/theme/default/imgs/marker.png",
          size,
          origin,
          anchor
        );
      var marker = new qq.maps.Marker({
        icon: icon,
        map: map,
        position: map.getCenter(),
      });
      var infoWin = new qq.maps.InfoWindow({
        map: map,
      });
      var geocoder = new qq.maps.Geocoder({
        complete: function (res) {
          console.log(res);
          address = res.detail.nearPois[0].name;
        },
      });
    },
  },
  mounted() {
    this.init();
  },
};
</script>
<style  scoped>
.ph-contact {
  display: flex;
  align-items: center;
  height: 120px;
}
.ph-contact span {
  line-height: 2rem;
}
</style>