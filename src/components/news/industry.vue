<template>
  <div>
    <div v-for="(item,index) in questionList" :key="index">
      <ul class="ph-question">
        <li>
          <div style="padding:20px">
            <h4 style="margin-bottom:20px;font-size: 18px;">
              <a href>{{item.title}}</a>
            </h4>
            <p
              style="width: 100%;
    color: #555;
    line-height: 26px;
    text-align: justify;
    font-size: 16px;"
            >{{item.content}}</p>
            <p style="margin-top:20px;font-size: 1.05em;"><Icon :size="20" type="ios-calendar-outline" />&nbsp;&nbsp;2020-08-20</p>
          </div>
        </li>
      </ul>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      id: "",
      questionList: [
        {
          id: 1,
          title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 2,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 3,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 4,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 5,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "解放军报西昌6月23日电 （记者安普忠、王天益）完美收官，星耀全球！今天9时43分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射北斗系统第五十五颗导航卫星，暨北斗三号最后一颗全球组网卫星，至此...",
            url:''
        },
        {
          id: 6,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 7,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 8,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        },
        {
          id: 9,
           title:'六手猎鹰火箭发射，马斯克再次续写复用传奇',
          content: "SpaceX迎来了第一枚“六手”猎鹰火箭的发射，创造了猎鹰火箭六次复用的记录，发射第11批星链。",
            url:''
        }
      ],
    };
  },
  methods: {

  },
};
</script>
<style>
.ph-question li {
  list-style: none;
  width: 50%;
  float: right;
  /* text-align: center; */
}
.ph-question li a{
    color: #333;
}
.ph-question li a:hover{
    color: #e16531;
}
</style>