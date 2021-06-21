<template>
  <div>
    <div>
      <Swiper />
    </div>
    <div class="ph-nav">
      <ul v-for="(items,index) in navList" :key="index">
        <li>
          <div class="ph-nav-div">
            <img style="width: 75px; height: 80px" :src="items.imageUrl" alt />
            <div style="margin-left: 20px; text-align: center">
              <p style="font-size: 18px; color: #989baf">{{ items.name }}</p>
              <p style="font-size: 40px">
                {{ items.number }}
                <span
                  style="
                    margin-left: 13px;
                    vertical-align: middle;
                    line-height: 45px;
                    font-size: 18px;
                    color: #3a405b;
                  "
                  >家</span
                >
              </p>
            </div>
          </div>
        </li>
      </ul>
    </div>
    <div class="ph-home">
      <div class="ph-whyselect" style="color: #1ebfa3">公司主营业务</div>
      <div class="pj clearfix">
        <ul v-for="(items,index) in yewuList" :key="index">
          <li>
            <div class="ph-lio">
              <div style="text-align: center">
                <p>
                  <img
                    :src="items.imageurl"
                    style="height: 240px; width: 100%"
                    alt
                  />
                </p>
              </div>
              <div style="text-align: center">
                <p style="margin: 33px 0 30px 0">
                  <span style="font-size: 30px">{{ items.name }}</span>
                  <br />
                  <span>{{ items.enName }}</span>
                  <br />
                </p>
              </div>
              <div style="margin-top: 10px">
                <ol v-for="(item,index) in items.moredata" :key="index">
                  <p
                    style="
                      font-size: 14px;
                      padding: 0px 20px;
                      color: #989baf;
                      line-height: 29px;
                    "
                  >
                    {{ item.name }}
                  </p>
                </ol>
              </div>
              <div style="text-align: center; margin-top: 20px">
                <span class="fkw-product-container-click">查看更多</span>
              </div>
            </div>
          </li>
        </ul>
      </div>
      <div class="ph-whyselect" style="color: #f84">
        热销车型
        <div style="text-align: center; color: #a7a9b7; font-size: 16px">
          超多车型任君选择，让你的选择更加放心
        </div>
      </div>

      <div style="background: white; width: 100%; padding: 50px">
        <div class="pj clearfix">
          <ul v-for="(item,index) in 6" :key="index">
            <li style="margin-bottom: 30px">
              <img
                style="width: 402px; height: 209px"
                src="https://lalamc.huolala.cn/images/car1.png"
                alt
              />
              <div style="padding: 20px">
                <h2>汉兰达七座(至尊版)</h2>
                <br />
                <p class="tags">
                  <span>首付0元起</span>
                  <span>免押金</span>
                  <span>利息低</span>
                </p>
                <br />
                <p>
                  <span>还款周期</span>
                  <span style="font-size: 18px; color: #f00">36期</span>
                  <span>还款金额</span>
                  <span style="font-size: 18px; color: #f00">2174元</span>
                </p>
                <br />
                <p>
                  <span>还款周期</span>
                  <span style="font-size: 18px; color: #f00">24期</span>
                  <span>还款金额</span>
                  <span style="font-size: 18px; color: #f00">2174元</span>
                </p>
                <p>
                  <a>马上预约，领取购车礼包</a>
                </p>
              </div>
            </li>
          </ul>
        </div>
      </div>

      <div style="width: 100%; background: #f5f9ff; padding-bottom: 50px">
        <div class="ph-whyselect" style="background: #f5f9ff; color: #00a7fe">
          公司优势
          <div style="text-align: center; color: #a7a9b7; font-size: 16px">
            企业实力雄厚，选择好的平台让你更大价值化
          </div>
        </div>
        <div class="ph-youshi clearfix">
          <ul v-for="(items,index) in youshiList" :key="index">
            <li style="text-align: center">
              <div class="ph-lio">
                <div>
                  <p>
                    <img
                      style="height: 190px; width: 100%"
                      :src="items.imageurl"
                      alt
                    />
                  </p>
                </div>
                <div style="padding: 30px 20px">
                  <p style="text-align: center">
                    <span
                      style="font-size: 20px; color: #333; line-height: 20px"
                      >{{ items.name }}</span
                    >
                  </p>
                  <p style="margin: 30px 0px">{{ items.detail }}</p>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>

      <div class="ph-whyselect" style="color: #3a405b">
        他们都在与鹏辉前程合作
        <div style="text-align: center; color: #a7a9b7; font-size: 16px">
          我们在不断实现企业的使命，期待与更多企业合作
        </div>
      </div>
      <div style="marign: 100px 0px" class="pj clearfix">
        <ul v-for="(items,index) in hezuoList" :key="index">
          <li style="text-align: center; margin-bottom: 30px">
            <div>
              <div>
                <p style="margin: 30px 0px">
                  <img style="height: 100px" :src="items.imageUrl" alt />
                </p>
              </div>
              <div style="text-align: left; padding: 0px 20px 30px 20px">
                <h2>货拉拉</h2>
                <span
                  >决策缺乏数据支撑？权责不明？服务体系未建立？赛意助力惠而浦建立营销管理平台、费用管控系统、服务系统、报表分析体系，实现财务业务一体化、决策科学性......</span
                >
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>
<script>
import Swiper from "../components/swiper/index";
export default {
  components: { Swiper },
  data() {
    return {
      hezuoList: [
        {
          id: 1,
          imageUrl:
            "http://www.chinasie.com/uploadFile/web/7b96aafc3f22477186e14663ab467274.png",
        },
        {
          id: 1,
          imageUrl:
            "http://www.chinasie.com/uploadFile/web/4b161903d49b4dce9f07f74354566914.png",
        },
        {
          id: 1,
          imageUrl:
            "http://www.chinasie.com/uploadFile/web/bd7262939834421183bc24f5f4733ae7.png",
        },
        {
          id: 1,
          imageUrl:
            "http://www.chinasie.com/uploadFile/web/8f8ba5b6f46d42ac8674e88d90658ede.png",
        },
        {
          id: 1,
          imageUrl:
            "http://www.chinasie.com/uploadFile/web/f870f8cd76c9444eb815bcfe9febb73c.png",
        },
        {
          id: 1,
          imageUrl:
            "http://www.chinasie.com/uploadFile/web/ad2125c68fd44223b01f60cf7917af99.png",
        },
      ],
      navList: [
        {
          id: 1,
          name: "合作伙伴",
          imageUrl: "https://static.easyicon.net/preview/124/1244691.gif",

          number: "362",
        },
        {
          id: 1,
          name: "开通城市",
          imageUrl: "https://static.easyicon.net/preview/127/1270389.gif",
          number: "45",
        },
        {
          id: 1,
          name: "拥有车辆",
          imageUrl: "https://static.easyicon.net/preview/128/1284184.gif",
          number: "101",
        },
      ],
      youshiList: [
        {
          id: 1,
          imageurl: "https://img1.dowebok.com/5897s.jpg",
          name: "日订单量大",
          enName: "Car Rental",
          detail: "与众多企业达成物流配送合作，拥有大量的订单，无需考虑订单",
        },
        {
          id: 1,
          imageurl: "https://img1.dowebok.com/5895s.png",
          name: "拥有多种车型",
          enName: "Car Rental",
          detail: "与各大车企达成合作，拥有封闭式面包车、9.6米等货车",
        },
        {
          id: 1,
          imageurl: "https://img1.dowebok.com/5888s.png",
          name: "工作时间自由",
          enName: "Car Rental",
          detail:
            "无固定上班时间，多劳多得，让时间实现最大价值化，拒绝浪费时间",
        },
        {
          id: 1,
          imageurl: "https://img1.dowebok.com/5883s.jpg",
          name: "配送时间快",
          enName: "Car Rental",
          detail:
            "基于人工智能优化配送路线，高效的自动化分拣，配送车队随时准备出发",
        },
      ],
      yewuList: [
        {
          id: 1,
          imageurl: "https://img1.dowebok.com/5843s.png",
          name: "新能源汽车租赁",
          enName: "Car Rental",
          moredata: [
            {
              id: 1,
              url: "",
              name:
                "1.拥有灵活的新能源汽车租赁方案，解决你的后顾之忧，从源头打消您的顾虑",
            },
            {
              id: 1,
              url: "",
              name: "2.服务周到，售后服务周到，让你安心工作",
            },
            {
              id: 1,
              url: "",
              name: "3.拥有快速响应的队伍，为您提供多种的救援服务",
            },
          ],
        },
        {
          id: 2,
          imageurl: "https://img1.dowebok.com/5885s.png",
          name: "新能源汽车销售",
          enName: "Car Sales",
          moredata: [
            {
              id: 1,
              url: "",
              name: "1.本公司车型众多，任君选择,本公司宗旨我们的服务你们的安心",
            },

            {
              id: 1,
              url: "",
              name:
                "3.质量有保障驶技术稳定，驾驶技术高超的驾驶员，保证货物安全完整运",
            },
          ],
        },
        {
          id: 3,
          imageurl: "https://img1.dowebok.com/5890s.jpg",
          name: "城际物流配送",
          enName: "Intercity logistics distribution",
          moredata: [
            {
              id: 1,
              url: "",
              name:
                "1.拥有众多企业成功合作案例，建立庞大的企业合作网络，见证企业实力",
            },

            {
              id: 1,
              url: "",
              name:
                "2.公司企业拥有一支驾驶技术稳定，驾驶技术高超的驾驶员，保证货物安全完整运达",
            },
          ],
        },
      ],
    };
  },
};
</script>
<style scoped>
.fkw-product-container-click {
  /* width: 152px; */
  /* height: 37px; */

  background: -webkit-linear-gradient(
    to right,
    #fdc830,
    #f37335
  ); /* Chrome 10-25, Safari 5.1-6 */
  background: linear-gradient(
    to right,
    #fdc830,
    #f37335
  ); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

  border-radius: 25px;
  padding: 10px 60px;
  text-align: center;
  color: #fff;
  font-size: 16px;
  font-weight: bold;
  cursor: pointer;
}
.ph-nav {
  height: 150px;
  width: 70%;
  background: white;
  border-radius: 5px;
  margin: 0px auto;
  position: relative;
  margin-top: -80px;
  padding: 20px 30px;
  box-shadow: 0 7px 18px rgba(0, 0, 0, 0.12);
}
.ph-nav ul li {
  list-style: none;
  width: 33%;
  float: left;
  text-align: center;
  height: 110px;
}
.ph-nav-div {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100%;
}
.ph-content {
  background-image: url("https://oimg.huolala.cn/cms/2019/07/11/19071118032283505825.jpeg");
  height: 530px;
  width: 100%;
}
.ph-whyselect {
  font-size: 35px;
  text-align: center;
  padding: 60px 0px;
  font-weight: bold;
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
.pj {
  width: 70%;
  margin: 0 auto;
  min-width: 1250px;
  display: block;
}
.ph-youshi {
  width: 70%;
  /* width: 1250px; */
  margin: 0 auto;
  /* min-width: 1250px; */
  display: block;
}
.ph-youshi ul {
  width: 100%;
  box-sizing: border-box;
}
.pj li {
  width: calc(24% - 20px);
}
.pj ul {
  width: 100%;
  box-sizing: border-box;
}
.ph-youshi li {
  list-style: none;
  width: calc(24% - 20px);
  border-radius: 5px;
  overflow: hidden;
  background-color: white;
  float: left;
  margin-right: 30px;
  border-radius: 5px;
}

.ph-youshi li img {
  cursor: pointer;
  transition: all 0.5s;
}

.ph-youshi li img:hover {
  transform: scale(1.03);
}
.pj li {
  /* margin-bottom: 100px; */
  list-style: none;
  width: calc(32.3333333333% - 20px);
  border-radius: 5px;
  overflow: hidden;
  height: 560px;
  background-color: white;
  float: left;
  margin-right: 30px;
  border-radius: 5px;
  transition: all 0.5s;
  -moz-transition: all 0.5s;
  -o-transition: all 0.5s;
  -ms-transition: all 0.5s;
  -webkit-transition: all 0.5s;

  transition-delay: 0.1s;
  -moz-transition-delay: 0.1s;
  -webkit-transition-delay: 0.1s;
  -o-transition-delay: 0.1s;
  -ms-transition-delay: 0.1s;
}

.pj li:hover {
  cursor: pointer;
  transform: translate3d(0, -10px, 0);
  -moz-transform: translate3d(0, -10px, 0);
  -o-transform: translate3d(0, -10px, 0);
  -ms-transform: translate3d(0, -10px, 0);
  -webkit-transform: translate3d(0, -10px, 0);
  box-shadow: LightGray 10px 10px 30px 2px;
}


.pj a {
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
</style>