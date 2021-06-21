import Vue from "vue";
import Router from "vue-router";
Vue.use(Router);

export default new Router({
  mode: "history",
  // base: '/phqc/',
  routes: [{
    path: "/",
    name: "index",
    redirect: "/home",
    component: () => import("@/components/index.vue"),
    children: [{
        path: "/home",
        name: "home",
        component: () => import("@/components/home.vue")
      },
      {
        path: "/carType",
        name: "carType",
        component: () => import("@/components/carType/index.vue")
      },
      {
        path: "/driverJoin",
        name: "driverJoin",
        component: () => import("@/components/driverJoin/index.vue")
      },
      {
        path: "/send",
        name: "send",
        component: () => import("@/components/send/index.vue")
      },
      {
        path: "/cityDeliver",
        name: "cityDeliver",
        component: () => import("@/components/cityDeliver/index.vue")
      },
      {
        path: "/companyHope",
        name: "companyHope",
        component: () => import("@/components/companyHope/index.vue")
      },
      {
        path: "/aboutCompany",
        redirect: "/aboutUs",
        name: "aboutCompany",
        component: () => import("@/components/aboutCompany/index.vue"),
        children: [{
            path: "/aboutUs",
            name: "aboutUs",
            component: () => import("@/components/aboutCompany/aboutUs.vue")
          },
          {
            path: "/contactUs",
            name: "contactUs",
            component: () =>
              import("@/components/aboutCompany/contactUs.vue")
          },
          {
            path: "/joinUs",
            name: "joinUs",
            component: () => import("@/components/aboutCompany/joinUs.vue")
          }
        ]
      },
      {
        path: "/news",
        redirect: "/list",
        name: "news",
        component: () => import("@/components/news/index.vue"),
        children: [{
            path: "/list",
            name: "list",
            component: () => import("@/components/news/list.vue")
          },
          {
            path: "/industry",
            name: "industry",
            component: () => import("@/components/news/industry.vue")
          },
          {
            path: "/financing",
            name: "financing",
            component: () => import("@/components/news/financing.vue")
          }
        ]
      },
      {
        path: "/help",
        redirect: "/question",
        name: "help",
        component: () => import("@/components/help/index.vue"),
        children: [{
            path: "/question",
            name: "question",
            component: () => import("@/components/help/question.vue")
          },
          {
            path: "/advice",
            name: "advice",
            component: () => import("@/components/help/advice.vue")
          }
        ]
      }, {
        path: "/detail",
        name: "detail",
        component: () => import("@/components/news/detail.vue")
      }, {
        path: "/privacyPolicy",
        name: "privacyPolicy",
        component: () => import("@/components/news/privacyPolicy.vue")
      }, {
        path: "/userAgreement",
        name: "userAgreement",
        component: () => import("@/components/news/userAgreement.vue")
      }, {
        path: "/legalStatement",
        name: "legalStatement",
        component: () => import("@/components/news/legalStatement.vue")
      }
    ]
  }]
});
