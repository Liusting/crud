<template>
  <div style="background:white">
    <div class="ph-company"></div>
    <div style="padding:40px;">
      <Row>
        <Col span="8">
          <div class="ph-left-nav">
            <Menu :active-name="path" style="width:100px">
              <MenuItem name="/aboutUs" to="/aboutUs">关于我们</MenuItem>
              <MenuItem name="/joinUs" to="/joinUs">加入我们</MenuItem>
              <MenuItem name="/contactUs" to="/contactUs">联系我们</MenuItem>
            </Menu>
          </div>
        </Col>
        <Col span="12">
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
    };
  },
  //深度监听路由变化，获取当前路由变化的值
  watch: {
    $route() {
      this.path = this.$route.path;
    },
  },
  mounted() {
    this.path = this.$route.path;
  },
};
</script>
<style scoped>
.ph-left-nav {
  float: right;
  margin-right: 20%;
}
.ph-company {
  background-image: url("https://www.huolala.cn/rs/img/banner_joinus.png");
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