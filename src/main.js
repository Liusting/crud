// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import 'babel-polyfill'
import axios from "axios"
import ViewUI from 'view-design';
import 'view-design/dist/styles/iview.css';
import animated from 'animate.css'
import vRegion from 'v-region'



//切换页面自动滚动顶部
router.beforeEach((to, from, next) => {
    // chrome
    document.body.scrollTop = 0
    // firefox
    document.documentElement.scrollTop = 0
    // safari
    window.pageYOffset = 0
    next()
});

Vue.config.productionTip = false
Vue.use(ViewUI);
Vue.use(router);
Vue.use(animated);
Vue.use(vRegion)


/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
