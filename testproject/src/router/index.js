import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Home from '@/components/Home'
import About from '@/components/About'


Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/:author',
      name:'home',//这里可不是HelloWorld哦，我们会把HelloWorld组件放入vue中
      component:Home
    },
    {
      path:'/about/:id',
      name:'about',
     component:About
    }
  ]
})
