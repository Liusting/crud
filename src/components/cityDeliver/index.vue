<template>
  <div>
    <img style="width:100%" src="http://dfcms.dflzm.com.cn/cmsuploads/carinfo_pic/8e0eef87c87788f9c8dd003d7b435962.jpg"
      alt />
    <div style="text-align:center;padding:20px 0px;font-size:35px;font-weight:bold">
      <span>极速的城际配送</span>
    </div>
    <div style="text-align:center;padding:20px 0px;font-size:35px;font-weight:bold">
      <span>开通路线</span>
    </div>
    <div class="ph-table">
      <div class="ph-job-table">
        <Table no-border :columns="columns1" :data="data1"></Table>
        <div class="ph-job-page">
          <Page :total="40" size="small" show-elevator show-sizer />
        </div>
      </div>
    </div>
    <div style="text-align:center;padding:20px 0px;font-size:20px;font-weight:bold">
      <span>更多路线正在路上，敬请期待...</span>
    </div>
  </div>
</template>
<script>
  export default {
    name: "Yuanli",
    data() {
      return {
        show: false,
        columns1: [{
            title: '职位名称',
            key: 'name'
          },
          {
            title: '职位类型',
            key: 'age'
          },
          {
            title: '工作地点',
            key: 'address'
          }, {
            title: '发布时间',
            key: 'date'
          }, {
            title: '更多',
            render: (h, params) => {
              return h('span', {
                style: {
                  color: 'blue'
                },
                on: {
                  click: () => {
                    this.moreDetail()
                  }
                }
              }, '详情点击');
            }
          }
        ],
        data1: [{
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          },
          {
            name: '汽车销售',
            age: '销售岗',
            address: '广东-深圳',
            date: '2016-10-03'
          }
        ],
      };
    },
    methods: {
      handleClick: function() {
        this.show = !this.show;
      },
    },
  };
</script>
<style scoped>
  .ph-table {
    width: 80%;
    margin: 0px auto;
  }
  .ph-job-page{
    display: flex;
    justify-content: flex-end;
    padding-top:2em;
  }

  .ph-job-table {

    margin: 0 auto;
    color: black;
    width: 100%;
    padding: 20px;
    margin-top: 20px;
  }

  .ph-jobDetail {
    height: 35px;
    color: #333;
    font-weight: 600px;
    margin-top: 20px;
    margin-bottom: 10px;
    line-height: 35px;

  }

  .ph-jobList {
    padding: 20px;
    display: flex;
  }
</style>
