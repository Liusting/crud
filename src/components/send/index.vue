<template>
  <div class="ph-page">

    <div>

    </div>
    <div class="ph-message">

      <div style="display: flex; align-items: center;">
        <div style="flex:1;padding: 20px;">

          <div>
            <Icon type="md-flag" color="red" size="20" />
            <span style="font-size: 20px;">收货人地址</span>
            <Input v-model="receAddress" type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="复制地址，智能识别，用逗号隔开"></Input>
          </div>
          <div style="margin:20px 0;text-align:right">
            <Button type="error" shape="circle" @click="gg()">智能识别</Button>
          </div>

          <div>


            <Form label-position="left" ref="receiverValidate" :model="receiverValidate" :rules="ruleValidate"
              :label-width="100">

              <FormItem label="收件人姓名" prop="name">
                <Input v-model="receiverValidate.name" placeholder="收件人姓名"></Input>
              </FormItem>
              <FormItem label="收件人电话" prop="mail">
                <Input v-model="receiverValidate.phone" placeholder="收件人电话"></Input>
              </FormItem>
              <FormItem label="省市" prop="mail">
                <v-region :town="true" @values="regionChange" v-model="selected"></v-region>
              </FormItem>

              <FormItem label="详细地址" prop="desc">
                <Input v-model="receiverValidate.receiverAddress" type="textarea" :autosize="{minRows: 2,maxRows: 5}"
                  placeholder="请输入详细地址信息，如街道、小区、门牌号、楼栋号、单元等信息"></Input>
              </FormItem>
            </Form>
          </div>
        </div>
        <div style="flex:1;padding: 20px;">
          <div>
            <Icon type="md-flag" color="blue" size="20" />
            <span style="font-size: 20px;">寄件人地址</span>
            <Input type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="复制地址，智能识别，用逗号隔开"></Input>
          </div>
          <div style="margin:20px 0;text-align:right">
            <Button type="error" shape="circle">智能识别</Button>
          </div>
          <div>
            <Form label-position="left" ref="sendValidate" :model="sendValidate" :rules="ruleValidate" :label-width="100">
              <FormItem label="寄件人姓名" prop="name">
                <Input v-model="sendValidate.sendName" placeholder="寄件人姓名" style="width:100%"></Input>
              </FormItem>
              <FormItem label="寄件人电话" prop="mail">
                <Input v-model="sendValidate.sendNumber" placeholder="寄件人电话"></Input>
              </FormItem>
              <FormItem label="省市" prop="mail">
                <v-region :town="true" @values="regionChange" v-model="selected"></v-region>
              </FormItem>
              <FormItem label="详细地址" prop="desc">
                <Input v-model="sendValidate.sendAddress" type="textarea" :autosize="{minRows: 2,maxRows: 5}"
                  placeholder="请输入详细地址信息，如街道、小区、门牌号、楼栋号、单元等信息"></Input>
              </FormItem>
            </Form>
          </div>
        </div>
      </div>
    </div>
    <div>
      <Form label-position="left" ref="otherMessage" :model="otherMessage" :rules="ruleValidate" :label-width="120">
        <FormItem label="上门取货时间:" prop="date">
          <Cascader style="width: 150px;" :data="data" @on-change="hhh"></Cascader>
        </FormItem>
        <FormItem label="服务类型" prop="gender">
          <RadioGroup v-model="sendValidate.serviceType">
            <Radio  v-for="(item,index) in goodType" :label="item.lable"  :key="index">  {{item.lable}}</Radio>
       <!--     <Radio label="male">专车直发</Radio>
            <Radio label="female">限时快运</Radio>
            <Radio label="female">快递小件</Radio> -->
          </RadioGroup>
        </FormItem>
        <FormItem label="增值服务" prop="interest">
          <CheckboxGroup v-model="sendValidate.interest">
            <Checkbox v-for="(item,index) in goodType" :label="item.value" :key="index">
              {{item.lable}}
            </Checkbox>
          </CheckboxGroup>
        </FormItem>
        <FormItem label="物品类型" prop="city">
          <Select style="width:200px">
            <Option v-for="(item,index) in goodType" :value="item.value" :key="index">{{item.lable}}</Option>
          </Select>
        </FormItem>
        <FormItem label="物品数量" prop="name">
          <div style="display: flex;align-items: center;">
            <Icon @click="reduce('goodNumber')" type="ios-remove" size="25" />
            <span style="margin: 0px 10px;">
              <Input style="width:60px" v-model="otherMessage.goodNumber"></Input>
              <span>&nbsp;&nbsp;件</span>
            </span>
            <Icon @click="add('goodNumber')" type="ios-add" size="25" />
          </div>
        </FormItem>
        <FormItem label="预估重量" prop="mail">
          <div style="display: flex;align-items: center;">
            <Icon @click="reduce('estimatedWeight')" type="ios-remove" size="25" />
            <span style="margin: 0px 10px;">
              <Input style="width:60px" v-model="otherMessage.estimatedWeight"></Input>
              <span>&nbsp;&nbsp;kg</span>
            </span>
            <Icon @click="add('estimatedWeight')" type="ios-add" size="25" />
          </div>
        </FormItem>
        <FormItem label="预估体积" prop="mail">
          <div style="display: flex;align-items: center;">
            <Icon @click="reduce('estimatedVolume')" type="ios-remove" size="25" />
            <span style="margin: 0px 10px;">
              <Input style="width:60px" v-model="otherMessage.estimatedVolume"></Input>
              <span>&nbsp;&nbsp;m³</span>
            </span>
            <Icon @click="add('estimatedVolume')" type="ios-add" size="25" />
          </div>
        </FormItem>
        <FormItem label="结算方式" prop="waySelect">
          <RadioGroup v-model="sendValidate.waySelect">
            <Radio label="cashonDelivery">货到付款</Radio>
            <Radio label="postCash">寄付现结</Radio>
          </RadioGroup>
        </FormItem>
        <FormItem label="订单备注" prop="gender">
          <Input v-model="sendValidate.desc" type="textarea" :autosize="{minRows: 2,maxRows: 5}" placeholder="请输入详细地址信息，如街道、小区、门牌号、楼栋号、单元等信息"></Input>
        </FormItem>
      </Form>
    </div>
    <div style="display: flex;align-items: center;justify-content: space-between;margin-top: 20px;">
      <span>
        <Checkbox></Checkbox>我已阅读并同意
        <a href="/privacyPolicy">《深圳市鹏辉前程汽车服务有限公司电子运单契约条款》</a>
      </span>
      <div style="display: flex;align-items: center;">
        <span style="width:400px;text-align:right;margin-right:20px">
          <p>
            预估（寄付现结）：
            <span style="font-weight:bold;font-size:25px;color:red">
              <span>￥</span>199.00
            </span>
            <span></span>
          </p>
          <p style="color: #a7a9b7;">最终费用以平台核实为准</p>
        </span>
        <Button size="large" type="error" shape="circle" @click="gg()">立即下单</Button>
      </div>
    </div>
    <div style="position: fixed;top:13%;right:1%;background-color: white;padding:10px 20px;text-align: center;">
      <p>一键下单</p>
      <p>更多详情信息</p>
      <p>打开微信扫一扫</p>
      <img width="100px" style="margin-top: 10px;" src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=151212591,3558744659&fm=26&gp=0.jpg" />
    </div>
    <div class="grid"></div>
  </div>
</template>
<script>
  import Masonry from "masonry-layout"; // Vue项目的引入方式
  import smart from 'address-smart-parse'
  export default {
    data() {
      return {
        goodType: [{
            value: 'car',
            lable: '文件证件'
          },
          {
            value: 'ma',
            lable: '数码产品'
          },
          {
            value: 'zhu',
            lable: '珠宝首饰'
          },
          {
            value: 'ri',
            lable: '美妆日用'
          },
          {
            value: 'cloths',
            lable: '服装鞋帽'
          },
          {
            value: 'sui',
            lable: '易碎物品'
          }
        ],
        hourList: [{
            label: "08:00-10:00",
            value: 8,
            disabled: false
          },

          {
            label: "10:00-12:00",
            value: 10,
            disabled: false
          },
          {
            label: "12:00-14:00",
            value: 12,
            disabled: false
          },

          {
            label: "14:00-16:00",
            value: 14,
            disabled: false
          },

          {
            label: "18:00-20:00",
            value: 18,
            disabled: false
          }
        ],
        data: [],
        receAddress: '',
        selected: {
          province: '',
          city: '',
          area: '',
          town: ''
        },
        receiverValidate: {
          name: "",
          mail: "",
          phone: '',
          city: "",
          gender: "",
          interest: [],
          date: "",
          time: "",
          desc: "",
          number: "1",
          weight: "1",
          lifang: "1",
          receiverAddress: ''
        },
        sendValidate: {
          name: "",
          mail: "",
          city: "",
          phone: '',
          gender: "",
          interest: [],
          date: "",
          time: "",
          desc: "",

        },
        otherMessage: {
          goodNumber: "1",
          estimatedWeight: "1",
          estimatedVolume: "1",
        },
        ruleValidate: {

        },
        hourIndex: -1,
        currentTab: 0,
        dayname: '',
        time: ''
      }
    },
    created() {
      //获取当前时间
      var hour = new Date().getHours();

      var list2 = this.hourList;
      //深拷贝一份数据，防止数据被污染
      var decopy = JSON.stringify(this.hourList);
      var _obj = JSON.parse(decopy)

      for (var i = 0; i < this.hourList.length; i++) {
        var list = this.hourList;
        //过时不可选
        if (this.hourList[i].value <= hour) {
          list[i].disabled = true;
          this.hourList = list;
        }
      }

      var newList = [];
      var today = {};
      today.label = "今天";
      today.value = "today";
      today.children = list;

      var tomorrow = {};
      tomorrow.label = "明天";
      tomorrow.value = "tomorrow";
      tomorrow.children = _obj;

      var afterTomorrow = {};
      afterTomorrow.label = "后天";
      afterTomorrow.value = "afterTomorrow";
      afterTomorrow.children = _obj;

      newList.push(today)
      newList.push(tomorrow)
      newList.push(afterTomorrow)
      this.data = newList;


    },
    methods: {
      reduce(e) {
        switch (e) {
          case 'goodNumber':
            if (this.otherMessage.goodNumber > 1)
              this.otherMessage.goodNumber--;
            break;
          case 'estimatedVolume':
            if (this.otherMessage.estimatedVolume > 1)
              this.otherMessage.estimatedVolume--;
            break;
          case 'estimatedWeight':
            if (this.otherMessage.estimatedWeight > 1)
              this.otherMessage.estimatedWeight--;
            break;
          default:
            break;
        }
      },
      add(e) {
        console.log(e)
        switch (e) {
          case 'goodNumber':
            this.otherMessage.goodNumber++;
            break;
          case 'estimatedVolume':
            this.otherMessage.estimatedVolume++;
            break;
          case 'estimatedWeight':
            this.otherMessage.estimatedWeight++;
            break;
          default:
            break;

        }
      },
      regionChange(data) {

      },
      hhh(value, selectedData) {
        console.log(value)
        console.log(selectedData)
      },
      gg() {
        var add = this.receAddress;
        var addList = smart(add);
        this.receiverValidate.name = addList.name;
        this.receiverValidate.phone = addList.phone;
        this.receiverValidate.receiverAddress = addList.address;
        this.selected.province = addList.provinceCode + '0000',
          this.selected.city = addList.cityCode + '00',
          this.selected.area = addList.countyCode,
          this.selected.town = addList.streetCode
      },
      updated() {
        var grid = document.querySelector(".grid");
        var msnry = new Masonry(grid, {
          // options...
          itemSelector: ".grid-item",
          columnWidth: 300,
        });
      },
    }

  };
</script>
<style scoped>
  .ph-page {
    width: 80%;
    margin: 20px auto;
    background: white;
    padding: 20px;
  }

  .ph-message ul li {
    list-style: none;
    float: left;
    width: 50%;
    text-align: left;
    padding: 30px;
  }
</style>
