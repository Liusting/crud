<template>
  <div class="layout">
    <BackTop></BackTop>
    <Layout>
      <Header>
        <div class="ph-head">
          <div>
            <img class="ph-logoImg" :src="logoImg" />
          </div>
          <div class="ph-company">
            <span>深圳市鹏辉前程汽车服务有限公司</span>
            <p>专业汽车租赁、汽车销售、国内货运代理、仓储代理</p>
          </div>
          <div class="ph-nav">
            <Menu mode="horizontal" :active-name="path" ref="active">
              <MenuItem name="/home" to="/">首页</MenuItem>
              <MenuItem name="/driverJoin" to="/driverJoin">司机加入</MenuItem>
              <MenuItem name="/cityDeliver" to="/cityDeliver"
                >城际配送</MenuItem
              >
              <!-- <MenuItem name="/send" to="/send">发物流</MenuItem> -->
              <MenuItem name="/companyHope" to="/companyHope"
                >企业合作</MenuItem
              >
              <MenuItem name="/carType" to="/carType">租买车型</MenuItem>
              <Submenu name="/aboutUs">
                <template slot="title">关于我们</template>
                <MenuItem name="/aboutUs" to="/aboutUs">关于我们</MenuItem>
                <MenuItem name="/joinUs" to="/joinUs">加入我们</MenuItem>
                <MenuItem name="/contactUs" to="/contactUs">联系我们</MenuItem>
              </Submenu>
            </Menu>
          </div>
          <p>
            <Input search v-model="keyword" placeholder="请输入关键字" />
          </p>
          <div
            style="
              display: flex;
              align-items: center;
              line-height: 20px;
              margin-left: 20px;
            "
          >
            <img
              src="http://pusiqibao-oss.oss-cn-guangzhou.aliyuncs.com/my_file/top_hotline.jpg"
              alt
            />
            <span style="margin-left: 8px">
              <p>服务热线:</p>
              <p class="header-number">10095885</p>
            </span>
          </div>
          <!-- <p style="margin-left:20px">
            <Button @click="toLogin()" type="default" shape="circle" icon="md-person">登录</Button>
          </p>-->
        </div>
      </Header>

      <Content>
        <keep-alive>
          <router-view />
        </keep-alive>
      </Content>

      <Footer class="footer">
        <div class="ph-bottom">
          <div
            style="display: flex; padding: 20px"
            v-for="(items) in footList"
            :key="items.id"
          >
            <div style="width: 100px; text-align: right">
              <span style="font-size: 24px">{{ items.name }}</span>
              <div
                class="ph-footNav"
                v-for="item in items.children"
                :key="item.id"
              >
                <a :href="item.url">{{ item.name }}</a>
              </div>
            </div>
          </div>
          <div
            style="
              background: white;
              width: 1px;
              margin: 30px 50px;
              margin-top: 20px;
            "
          ></div>
          <div>
            <div style="padding: 20px; display: flex">
              <div>
                <span style="font-size: 24px">关注我们</span>
                <div style="display: flex; margin-top: 15px; line-height: 20px">
                  <div v-for="items in contactList" :key="items.id">
                    <div style="margin-right: 15px; text-align: center">
                      <p>{{ items.name }}</p>
                      <img
                        style="width: 100px; height: 100px; margin-top: 10px"
                        :src="items.imageUrl"
                        alt
                      />
                    </div>
                  </div>
                </div>
              </div>
              <div style="margin-left: 20px">
                <span style="font-size: 24px">客服电话</span>
                <h2 style="font-size: 1.1rem; margin-top: 10px">
                  400-98984-0399
                </h2>
              </div>
            </div>
          </div>
        </div>

        <div class="ph-footer-bottom">
          <p>
            <span>
              <a href="/legalStatement">法律声明</a>
            </span>
            <span style="color: white; opacity: 0.5"
              >&nbsp;&nbsp;|&nbsp;&nbsp;</span
            >
            <span>
              <a href="/privacyPolicy">隐私政策</a>
            </span>
            <span style="color: white; opacity: 0.5"
              >&nbsp;&nbsp;|&nbsp;&nbsp;</span
            >
            <span>
              <a href="/userAgreement">用户协议</a>
            </span>
            <span style="color: white; opacity: 0.5"
              >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Copyright © 2020
              深圳市鹏辉前程汽车服务有限公司
              版权所有&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span
            >
            <span>
              &nbsp;&nbsp;&nbsp;&nbsp;
              <a href>技术支持：佛山市流浪者信息科技有限公司</a>
            </span>
          </p>
          <p>
            <span>
              <a href="https://beian.miit.gov.cn/">粤ICP备09191193号</a>
            </span>
            <span>
              &nbsp;&nbsp;&nbsp;&nbsp;
              <a href="http://www.beian.gov.cn/">粤公网安备 44030502003055号</a>
            </span>
            <span></span>
          </p>
        </div>
      </Footer>
    </Layout>
  </div>
</template>

<script>
import api from "@/api/api";
import Swiper from "./swiper/index";
export default {
  name: "index",
  components: {
    Swiper,
  },
  data() {
    return {
      logoImg:
        "http://pusiqibao-oss.oss-cn-guangzhou.aliyuncs.com/my_file/logo.png",
      theme2: "dark",
      path: "/",
      keyword:'',//关键字
      footList: [
        {
          id: 1,
          name: "首页",
          children: [
            {
              id: 101,
              name: "产品首页",
              url: "/home",
            },
          ],
        },
        {
          id: 2,
          name: "关于",
          children: [
            {
              id: 201,
              name: "关于我们",
              url: "/aboutUs",
            },
            {
              id: 202,
              name: "加入我们",
              url: "/joinUs",
            },
            {
              id: 203,
              name: "联系我们",
              url: "/contactUs",
            },
          ],
        },
        {
          id: 3,
          name: "资讯",
          children: [
            {
              id: 301,
              name: "公司要闻",
              url: "/list",
            },
            {
              id: 302,
              name: "业界动态",
              url: "/industry",
            },
            {
              id: 303,
              name: "公司风采",
              url: "/financing",
            },
          ],
        },
        {
          id: 4,
          name: "帮助",
          children: [
            {
              id: 401,
              name: "常见问题",
              url: "/question",
            },
            {
              id: 402,
              name: "意见反馈",
              url: "/advice",
            },
          ],
        },
      ],
      contactList: [
        {
          id: 1,
          name: "微信公众号",
          imageUrl:
            "http://pusiqibao-oss.oss-cn-guangzhou.aliyuncs.com/my_file/wet.png",
        },
        {
          id: 2,
          name: "官方小程序",
          imageUrl:
            "http://pusiqibao-oss.oss-cn-guangzhou.aliyuncs.com/my_file/gh_f413bb7e247b_258.jpg",
        },
        {
          id: 3,
          name: "官方QQ",
          imageUrl:
            "http://pusiqibao-oss.oss-cn-guangzhou.aliyuncs.com/my_file/qq.png",
        },
      ],
      isActive: true,
      loginform: false,
      swiperOptions: {
        pagination: {
          el: ".swiper-pagination",
        },
      },
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
  //深度监听路由变化，获取当前路由变化的值
  watch: {
    $route() {
      this.path = this.$route.path;
    },
  },
  mounted() {
    this.$nextTick(() => {
      this.path = this.$route.path;
      this.$refs.active.updateOpened();
      this.$refs.active.updateActiveName();
    });
  },

  methods: {
    handleSubmit(name) {},
    //点击登录
    toLogin() {
      this.loginform = true;
    },
    //关掉登录框
    closeForm() {
      this.loginform = false;
    },
    //选择账户登录
    accountSelect() {
      this.isActive = true;
    },
    //选择手机号登录
    phoneSelect() {
      this.isActive = false;
    },
  },
};
</script>

<style scoped>
.header-number {
  font-weight: bold;
  color: black;
  font-size: 1rem;
}
.ph-head {
  height: 100px;
  line-height: 2rem;
  display: flex;
  align-items: center;
  position: fixed;
  top: 0;
  left: 0;
  padding: 0 2%;
  z-index: 99;
  background: white;
  width: 100%;
}
.ph-formHeader {
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.ph-formHeader span {
  font-size: 1.1rem;
}
.ph-loginForm {
  margin-top: 1rem;
  font-size: 1.1rem;
}

.ph-loginForm span:hover {
  color: #e16531;
}
.ph-loginForm span:before {
  content: "";
  width: 0;
  height: 2px;
  position: absolute;
  left: 0;
  bottom: -10px;
  background: #e16531;
}
.ph-loginForm span:hover:before {
  width: 100%;
  transition: all 0.5s;
  -webkit-transition: all 0.5s;
  -moz-transition: all 0.5s;
  -ms-transition: all 0.5s;
}
.ph-loginForm span {
  font-size: 1.1rem;
  color: #999;
  cursor: pointer;
  display: inline-block;
  position: relative;
}
.ph-loginForm span.active {
  color: #e16531;
}
.ph-loginForm span.active:before {
  width: 100%;
  transition: all 0.5s;
  -webkit-transition: all 0.5s;
  -moz-transition: all 0.5s;
  -ms-transition: all 0.5s;
}
.ph-logoImg {
  overflow: hidden;
  width: 100px;
  height: 100px;
}
/**控制底部的线 */
.ivu-menu-light:after {
  height: 0px !important;
}
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-submenu-active:after {
  height: 0px !important;
}
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-item-active,
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-item:hover {
  color: #e16531;
  border-bottom: 2px solid #e16531;
}

.ivu-menu-light.ivu-menu-horizontal .ivu-menu-item-active,
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-item:hover,
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-submenu-active,
.ivu-menu-light.ivu-menu-horizontal .ivu-menu-submenu:hover {
  color: #e16531;
  border-bottom: 2px solid #e16531;
}
.ivu-menu-horizontal
  .ivu-menu-submenu
  .ivu-select-dropdown
  .ivu-menu-item-selected,
.ivu-menu-horizontal
  .ivu-menu-submenu
  .ivu-select-dropdown
  .ivu-menu-item-selected:hover {
  color: #e16531;
  border-bottom: none;
}
.ivu-menu-light.ivu-menu-horizontal
  .ivu-menu-submenu:hover
  .ivu-menu-item:hover {
  color: #e16531;
  border-bottom: none;
}
.ivu-menu-horizontal {
  font-size: 16px;
}
.ivu-menu-item {
  font-size: 16px;
}
.ivu-menu-horizontal .ivu-menu-submenu .ivu-select-dropdown .ivu-menu-item {
  font-size: 16px !important;
}
.ph-company {
  text-align: left;
  margin-left: 10px;
}
.clearfix:after {
  display: block;
  clear: both;
  content: "";
}
.ph-company span {
  font-size: 30px;
}
.ph-company p {
  font-size: 18px;
}
.ph-nav {
  margin: 0px 80px;
}
.ph-login {
  background: white;
  position: fixed;
  right: 5%;
  top: 13%;
  padding: 35px;
  width: 440px;
  height: 450px;
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}
.ph-close {
  position: absolute;
  right: 1rem;
  top: 1rem;
  color: #999;
  font-size: 1rem;
  cursor: pointer;
}
.footer {
  width: 100%;
  height: auto;
  background-color: #222222;
  color: white;
  min-width: 1250px;
}
.ph-bottom {
  margin: 0 auto;
  width: 1250px;
  height: auto;
  display: flex;
}
li {
  list-style: none;
  text-align: center;
}
.ph-footNav {
  margin-top: 15px;
  line-height: 20px;
}
.ph-footer-bottom {
  font-size: 16px;
  line-height: 30px;
  text-align: center;
}
.footer a {
  color: white;
  opacity: 0.5;
}
.footer a:hover {
  opacity: 1;
}
</style>
