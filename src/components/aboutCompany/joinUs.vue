<template>
  <div>
    <div>
      <div class="ph-contact-head">
        <div v-for="(items,index) in navList" :key="index">
          <span :class="items.id==selectId?'active':''" @click="postSelect(items.id)">{{items.name}}</span>
        </div>
      </div>
    </div>
    <div v-if="selectId!=1" style="padding-top:2em">
      暂无职位~
    </div>
    <div v-else class="ph-job-table">
       <Table no-border :columns="columns1" :data="data1"></Table>
       <div class="ph-job-page">
       <Page :total="40" size="small" show-elevator show-sizer />
       </div>
    </div>

    <Modal v-model="modal" title="职位详情" height="800" width="800" ok-text="申请职位">
      <div>
        <span style="margin-right:30px">招聘类型：社会招聘</span>
        <span style="margin-right:30px">工作性质：全职</span>
        <span style="margin-right:30px">招聘人数：若干</span>
        <span>发布时间：2020-08-14</span>
      </div>
      <br />
      <div>
        <span>工作地点：广东省-深圳市</span>
      </div>
      <br />
      <div>
        <span>薪资面议：面议</span>
      </div>
      <div class="ph-jobDetail">
        <span>工作职责：</span>
      </div>
      <div>
        1、对手机产品进行前期方案堆叠，评估；
        <br />2、产品堆叠方案的可行性评估、风险分析及评估；
        <br />3、完成手机产品的PCB详细Placement，routing，Gerber Out等工作；
        <br />4、完成产品的DFX设计并能协助制造部分进行问题分析。
      </div>
      <div class="ph-jobDetail">
        <span>任职资格：</span>
      </div>
      <div>
        1、对手机产品进行前期方案堆叠，评估；
        <br />2、产品堆叠方案的可行性评估、风险分析及评估；
        <br />3、完成手机产品的PCB详细Placement，routing，Gerber Out等工作；
        <br />4、完成产品的DFX设计并能协助制造部分进行问题分析。
      </div>
    </Modal>
  </div>
</template>
<script>
export default {
  data() {
    return {
      modal: false,
      columns1: [
                    {
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
                    },{
                        title: '发布时间',
                        key: 'date'
                    },{
                      title:'更多',
                     render: (h, params) => {
    return h('span', {
                style: {
                    color:'blue'
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
                data1: [
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
      navList: [
        {
          id: 1,
          name: "全部",
          checked: true,
        },
        {
          id: 2,
          name: "销售岗",
          checked: false,
        },
        {
          id: 3,
          name: "客服岗",
          checked: false,
        },
        {
          id: 4,
          name: "行政岗",
          checked: false,
        },
        {
          id: 5,
          name: "管理岗",
          checked: false,
        },
        {
          id: 6,
          name: "其他",
          checked: false,
        },
      ],
      selectId: 1,
    };
  },
  methods: {
    postSelect(id) {
      this.selectId = id;
      
    },
    moreDetail() {
      this.modal = true;
    },
  },
};
</script>
<style>
.ph-contact-head {
  display: block;
  display: flex;
}
.ph-contact-head span {
  list-style: none;
  float: left;
  background: white;
  margin-right: 20px;
  border-radius: 32px;
  padding: 2px 0px;
  border: 1px solid #757575;
  width: 90px;
  color: #757575;
  text-align: center;
  font-size: 16px;
}
.ph-job-page{
  display: flex;
  justify-content: flex-end;
  padding-top:2em;
}
.ph-contact-head .active {
  background: #e16531;
  border: none;
  color: white;
}
.ph-job-table {
  color: black;
  width: 100%;
  margin-top: 20px;
}
.ph-jobDetail {
  height: 35px;
  color: #333;
  font-weight: 600px;
  margin-top: 20px;
  margin-bottom: 10px;
  line-height: 35px;
  background: #fbfbfb;
}
.ph-jobList {
  padding: 20px;
  display: flex;
}
</style>