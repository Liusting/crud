<template>
  <div>
    <div class="driver-div">
      <div
        style="
          width: 450px;
          height: 440px;
          position: absolute;
          right: 180px;
          top: 32px;
          padding: 30px;
        "
      >
        <h1>鹏辉前程专享车型</h1>
        <h1>首付0元起</h1>
        <div style="display: flex">
          <Input placeholder="请输入手机号" ></Input>
          <Button type="primary" style="margin-left: 20px">马上预约购车礼包</Button>
        </div>
      </div>
    </div>
    <div
      style="
        text-align: center;
        margin: 90px 0px;
        font-size: 50px;
        font-weight: bold;
      "
    >
      <p>服务承诺</p>
    </div>
    <div class="ph-carType">
      <ul>
        <li>
          <img
            src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAg6L_x2QUokP2a9gcwkAE4kAE.png.webp"
            alt
          />
          <div style="text-align: center">
            <span style="font-size: 18px">订单充足</span>
          </div>
          <div>
            <span style="font-size: 12px">免去无订单烦恼，跑得多赚得更多</span>
          </div>
        </li>
        <li>
          <img
            src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAg6L_x2QUokMrwxwEwkAE4kAE.png.webp"
            alt
          />
          <div style="text-align: center">
            <span style="font-size: 18px">订单充足</span>
          </div>
          <div>
            <span style="font-size: 12px">免去无订单烦恼，跑得多赚得更多</span>
          </div>
        </li>
        <li>
          <img
            src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAg6L_x2QUo4LG3kwUwkAE4kAE.png.webp"
            alt
          />
          <div style="text-align: center">
            <span style="font-size: 18px">订单充足</span>
          </div>
          <div>
            <span style="font-size: 12px">免去无订单烦恼，跑得多赚得更多</span>
          </div>
        </li>
        <li>
          <img
            src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAg57_x2QUouOSbsQUwkAE4kAE.png.webp"
            alt
          />
          <div style="text-align: center">
            <span style="font-size: 18px">订单充足</span>
          </div>
          <div>
            <span style="font-size: 12px">免去无订单烦恼，跑得多赚得更多</span>
          </div>
        </li>
      </ul>
    </div>

    <div style="width: 100%; background: #f5f9ff; padding-bottom: 50px">
      <div class="ph-whyselect" style="background: #f5f9ff; color: #00a7fe">
        热销车型
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

                  <!-- <ol v-for="item in items.moredata" :key="item.id"> -->
                </p>
                <p style="margin: 30px 0px">{{ items.detail }}</p>
                <!-- </ol> -->
              </div>
            </div>
          </li>
        </ul>
      </div>
    </div>

    <div style="text-align: center; padding: 30px 50px; background: white">
      <Carousel
        v-model="value3"
        :autoplay="setting.autoplay"
        :autoplay-speed="setting.autoplaySpeed"
        :dots="setting.dots"
        :radius-dot="setting.radiusDot"
        :trigger="setting.trigger"
        :arrow="setting.arrow"
      >
        <CarouselItem>
          <div>
            <img
              src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAg9bux2QUozsD_8QYw7gQ4vQI.png.webp"
              alt
            />
            <div style="padding: 30px 0px">
              <h2>丰田卡罗卡新能源</h2>
            </div>
          </div>
        </CarouselItem>
        <CarouselItem>
          <div>
            <img
              src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAgma_x2QUott2slgIwqAk45AI.png.webp"
              alt
            />
            <div style="padding: 30px 0px">
              <h2>丰田卡罗卡新能源</h2>
            </div>
          </div>
        </CarouselItem>
        <CarouselItem>
          <div>
            <img
              src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAg9bux2QUozsD_8QYw7gQ4vQI.png.webp"
              alt
            />
            <div style="padding: 30px 0px">
              <h2>丰田卡罗卡新能源</h2>
            </div>
          </div>
        </CarouselItem>
        <CarouselItem>
          <div>
            <img
              src="https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAgma_x2QUott2slgIwqAk45AI.png.webp"
              alt
            />
            <div style="padding: 30px 0px">
              <h2>丰田卡罗卡新能源</h2>
            </div>
          </div>
        </CarouselItem>
      </Carousel>
    </div>
    <div
      style="
        text-align: center;
        margin: 90px 0px;
        font-size: 50px;
        font-weight: bold;
      "
    >
      <p>超多车型选择</p>
    </div>
    <div class="ph-block clearfix">
      <ul v-for="(item,index) in 6" :key="index">
        <li>
          <img src="https://lalamc.huolala.cn/images/car1.png" alt />
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
              <a @click="modal1 = true">马上预约，领取购车礼包</a>
            </p>
          </div>
        </li>
      </ul>
    </div>
    <Modal v-model="modal1">
      <div style="text-align: center;margin-top:50px">
        <Form  ref="formData" :model="formData" :rules="ruleInline">
          <FormItem>
            <Input v-model="formData.name" size="large" placeholder="请输入您的称呼" />
          </FormItem>
          <FormItem>
            <Input v-model="formData.phoneNumber" size="large" placeholder="请输入手机号码" />
          </FormItem>
          <FormItem>
            <Input v-model="formData.code" size="large" placeholder="请输入验证码">
              <a slot="append" href="">获取验证码</a>
            </Input>
          </FormItem>
        </Form>
      </div>
      <div slot="footer">
        <Button
          type="error"
          size="large"
          long
          :loading="modal_loading"
          @click="order"
          >立即预约</Button
        >
      </div>
    </Modal>
  </div>
</template>
<script>
export default {
  data() {
    return {
      modal1: false,
      modal_loading:false,
      value3: 0,
      formData:{
        name:'',
        phoneNumber:'',
        code:''
      },
      setting: {
        autoplay: false,
        autoplaySpeed: 2000,
        dots: "inside",
        radiusDot: false,
        trigger: "click",
        arrow: "hover",
      },
      youshiList: [
        {
          id: 1,
          imageurl:
            "https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAgt7ix2QUovPrG-wQw1gM40wI!400x400.png",
          name: "10方水泥搅拌车",
          enName: "Car Rental",
          detail: "续航里程：200km",
        },
        {
          id: 1,
          imageurl:
            "https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAgurix2QUowL3K4QQw1gM40wI!400x400.png",
          name: "丰田卡罗拉新能源",
          enName: "Car Rental",
          detail: "续航里程：200km",
        },
        {
          id: 1,
          imageurl:
            "https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAgt7ix2QUojcieqwIw1gM40wI!400x400.png",
          name: "传祺骐达襄垣",
          enName: "Car Rental",
          detail: "续航里程：200km",
        },
        {
          id: 1,
          imageurl:
            "https://17025853.s61i.faiusr.com/4/AD0IvZaPCBAEGAAgt7ix2QUojcieqwIw1gM40wI!400x400.png",
          name: "五菱全电配送",
          enName: "Car Rental",
          detail: "续航里程：200km",
        },
      ],
      ruleInline: {
        name: [
          {
            required: true,
            message: "请填写用户名",
            trigger: "blur",
          },
        ],
        phoneNumber: [
          {
            required: true,
            message: "请填写手机号码",
            trigger: "blur",
          }
        ],
      },
      code: [
          {
            required: true,
            message: "请填写密码",
            trigger: "blur",
          },
          {
            type: "string",
            min: 6,
            message: "验证码长度不能小于6位",
            trigger: "blur",
          },
        ],
    };
  },
  methods: {
    bb() {},
    //点击马上预约
    order(){
      this.modal_loading=true;
    } 
     },
};
</script>
<style scoped>
.ph-whyselect {
  font-size: 35px;
  text-align: center;
  padding: 60px 0px;
  font-weight: bold;
}

.pj {
  width: 70%;
  margin: 0 auto;
  /* min-width: 1250px; */
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

  overflow: hidden;
  background-color: white;
  float: left;
  margin-right: 30px;
}

.ph-youshi li img {
  cursor: pointer;
  transition: all 0.5s;
  padding: 10px;
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
.driver-div {
  background-image: url("https://13370474.s61i.faiusr.com/2/AD0I6oiwBhACGAAg8ZPdzQUohpGwkgEwgA84vAU.jpg");
  background-size: auto 100%;
  height: 585px;
  min-width: 1250px;
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
  width: calc(27% - 28px);
  text-align: center;
}

.ph-carType img {
  width: 144px;
  height: 144px;
}

.ph-ourPower {
  width: 1250px;
  margin: 0 auto;
  min-width: 1250px;
  height: 350px;
  display: block;
}
.ph-ourPower img {
  width: 300px;
  height: 300px;
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