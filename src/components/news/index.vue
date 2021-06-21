<template>
  <div style="background:white">
    <div class="ph-company"></div>
    <div style="padding:40px;">
      <Row>
        <Col span="8">
          <div style="float:right;margin-right:20%">
            <Menu :active-name="path" style="width:100px">
              <MenuItem name="/list" to="/list">公司要闻</MenuItem>
              <MenuItem name="/industry" to="/industry">业界动态</MenuItem>
              <MenuItem name="/financing" to="/financing">公司风采</MenuItem>
            </Menu>
          </div>
        </Col>
        <Col span="12">
          <div>
            <ol class="ph-head">
              <li>
                <a href="/">首页</a>
              </li>
              <li>
                <a href>资讯</a>
              </li>
              <li>
                <a :href="path">{{name}}</a>
              </li>
            </ol>
          </div>
          <router-view />
        </Col>
      </Row>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      path: "",
      name: "",
    };
  },
  //深度监听路由变化，获取当前路由变化的值
  watch: {
    $route() {
      this.path = this.$route.path;
      if (this.$route.name == "list") {
        this.name = "公司要闻";
      } else if (this.$route.name == "industry") {
        this.name = "业界动态";
      } else {
        this.name = "公司风采";
      }
    },
  },
  mounted() {
    this.path = this.$route.path;
    if (this.$route.name == "list") {
      this.name = "公司要闻";
    } else if (this.$route.name == "industry") {
      this.name = "业界动态";
    } else {
      this.name = "公司风采";
    }
  },
};
</script>
<style scoped>
.ph-head {
  padding-bottom: 20px;
}
.ph-head li {
  list-style: none;
  float: left;
  font-size: 16px;
  /* width: 10%; */
}
.ph-head li a:hover{
  color: #e16531;
}
.ph-head > li + li:before {
  padding: 0 10px;
  color: #ccc;
  content: "/\00a0";
}
.ph-company {
  background-image: url("https://www.huolala.cn/rs/img/banner_news.jpg");
  height: 320px;
}
a {
  color: #515a6e;
}
.ivu-menu {
    display: block;
    margin: 0;
    padding: 0;
    outline: 0;
    list-style: none;
    color: #515a6e;
    font-size: 14px;
    position: relative;
    z-index: 0;
}
.ivu-menu-vertical .ivu-menu-item,
.ivu-menu-vertical .ivu-menu-submenu-title {
  padding: 10px 4px;
  position: relative;
  cursor: pointer;
  z-index: 1000;
  transition: all 0.2s ease-in-out;
}
.ivu-menu-vertical.ivu-menu-light:after {
  content: "";
  display: block;
  width: 0px;
  height: 50%;
  background: none;
  position: absolute;
  top: 0;
  bottom: 0;
  right: 0;
  z-index: 1;
}
.ivu-menu-item {
  font-size: 16px;
}
.ivu-menu-light.ivu-menu-vertical .ivu-menu-item-active:not(.ivu-menu-submenu) {
  color: #e16531;
  z-index: 2;
}
.ivu-menu-light.ivu-menu-vertical .ivu-menu-item-active:not(.ivu-menu-submenu) {
  color: #e16531;
  background: none;
  z-index: 2;
}

.ivu-menu-light.ivu-menu-vertical .ivu-menu-item:hover {
  color: #e16531;
}

.ivu-menu-light.ivu-menu-vertical
  .ivu-menu-item-active:not(.ivu-menu-submenu):after {
  content: "";
  display: block;
  width: 1px;
  height: 50%;
  position: absolute;
  text-align: center;
  top: 11px;
  bottom: 0;
  right: 0;
  background: #e16531;
}
</style>