<template>
  <div>
    <div>
      <div class="ph-contact-head">
        <div v-for="(items,index) in navList" :key="index">
          <span :class="items.id==selectId?'active':''" @click="postSelect(items.id)">{{items.name}}</span>
        </div>
      </div>
    </div>
    <div class="ph-question">
      <ul v-for="item in questionList" :key="item.id">
        <li>
          <div @click="btnQuestion(item.id)">
            <span>{{item.msg}}</span>
            <Icon size="20" :type="item.checked?'ios-arrow-up':'ios-arrow-down'" />
          </div>
          <p
            style="opacity: 0.5;"
            v-show="item.checked"
          >货拉拉是一个同城搬家拉货服务的司机配对平台，为您找面包车和货车司机，提供点到点的载运服务，只要您输入运载路线，货拉拉会即时发送给平台上所有的专业司机，成功抢单的司机，会马上联络您，前来为您服务。</p>
        </li>
      </ul>
    </div>
    
  </div>
</template>
<script>
export default {
  data() {
    return {
      modal: false,
      navList: [
        {
          id: 1,
          name: "我是客户",
          checked: true,
        },
        {
          id: 2,
          name: "我是司机",
          checked: false,
        },
      ],
      selectId: 1,
      id: "",
      questionList: [
        {
          id: 1,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 2,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 3,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 4,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 5,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 6,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 7,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 8,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 9,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
        {
          id: 10,
          msg: "1.鹏辉前程的宗旨是什么？为什么要坚持？",
          checked: false,
        },
      ],
    };
  },
  methods: {
    postSelect(id) {
      this.selectId = id;
    },
    btnQuestion(id) {
      this.id = id;
      let items = this.questionList;
      for (let i = 0; i < items.length; i++) {
        if (items[i].id == id) {
          items[i].checked = !items[i].checked;
        }
      }
      this.questionList = items;
    },
  },
};
</script>
<style>
.ph-contact-head {
  /* display: block; */
  display: flex;
  padding-bottom: 20px;
}
.ph-contact-head span {
  list-style: none;
  float: left;
  background: white;
  margin-right: 20px;
  border-radius: 32px;
  padding: 2px 0px;
  /* border: 1px solid #757575; */
  width: 90px;
  color: #757575;
  text-align: center;
  font-size: 16px;
}
.ph-contact-head .active {
  background: #e16531;
  border: none;
  color: white;
}
.ph-question li {
  list-style: none;
}
.ph-question li div {
  display: flex;
  justify-content: space-between;
  font-size: 18px;
  height: 60px;
  align-items: center;
}
.ph-question li p{
    padding: 10px 0px;
}
</style>