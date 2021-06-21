<template>
  <div>
    <div class="driver-div">
       <div style="  width: 300px;
  height: 350px;
  position: absolute;
  right: 700px;
  top: 100px;">
           <img src="https://16237307.s61i.faiusr.com/4/AD0I_4XfBxAEGAAgionk1AUosLeiggEwuwM4XA.png" alt="">
       </div>


      <div class="ph-driver-join">

        <Form ref="formItem" :model="formItem" :rules="ruleInline">
          <FormItem>
            <Input
              v-model="formItem.password"
              placeholder="请输入手机号码"
            ></Input>
          </FormItem>
          <FormItem>
            <Input v-model="formItem.account" placeholder="请输入短信验证码">
              <span slot="append">获取验证码</span>
            </Input>
          </FormItem>
        </Form>
        <p
          style="
            width: 100%;
            margin-top:50px;
            height: 50px;
            background: #e16531;
            color: white;
            justify-content: center;
            display: flex;
            align-items: center;
            border-radius:50px;
            font-size: 18px;
          "
        >
          有车加入
        </p>
        <p
          style="
            width: 100%;
            height: 50px;
            border: 1px solid #eee;
            justify-content: center;
            display: flex;
            align-items: center;
            font-size: 18px;
            border-radius:50px;
            margin-top: 30px;
          "
        >
          没车加入
        </p>
      </div>
    </div>
    <div style="width: 50%; margin: 0 auto; padding: 20px">
      <div style="text-align: center; font-size: 40px; margin: 30px 0px">
        <span>司机有话说</span>
      </div>
      <div style="display: flex; align-items: center">
        <img
          style="border-radius: 50%; width: 200px; height: 200px"
          src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2079813107,2247644653&fm=26&gp=0.jpg"
        />
        <span style="margin-left: 30px; line-height: 50px">
          <p>
            <span style="font-size: 30px; font-weight: 700">王师傅</span
            ><span style="margin-left: 50px">工作9年</span>
          </p>
          <p style="font-size: 22px">
            鹏辉前程是一个很好的平台，在这里接触了许许多多的人
          </p>
        </span>
      </div>
      <div
        style="
          display: flex;
          justify-content: center;
          width: 200px;
          height: 100px;
          margin: 20px 0px;
        "
      >
        <div
          style="width: 1px; height: 100px; border: 1px dashed #e16531"
        ></div>
      </div>
      <div style="display: flex; align-items: center">
        <img
          style="border-radius: 50%; width: 200px; height: 200px"
          src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2079813107,2247644653&fm=26&gp=0.jpg"
        />
        <span style="margin-left: 30px; line-height: 50px">
          <p>
            <span style="font-size: 30px; font-weight: 700">王师傅</span
            ><span style="margin-left: 50px">工作9年</span>
          </p>
          <p style="font-size: 22px">
            鹏辉前程是一个很好的平台，在这里接触了许许多多的人
          </p>
        </span>
      </div>
      <div
        style="
          display: flex;
          justify-content: center;
          width: 200px;
          height: 100px;
          margin: 20px 0px;
        "
      >
        <div
          style="width: 1px; height: 100px; border: 1px dashed #e16531"
        ></div>
      </div>
      <div style="display: flex; align-items: center">
        <img
          style="border-radius: 50%; width: 200px; height: 200px"
          src="https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2079813107,2247644653&fm=26&gp=0.jpg"
        />
        <span style="margin-left: 30px; line-height: 50px">
          <p>
            <span style="font-size: 30px; font-weight: 700">王师傅</span
            ><span style="margin-left: 50px">工作9年</span>
          </p>
          <p style="font-size: 22px">
            鹏辉前程是一个很好的平台，在这里接触了许许多多的人
          </p>
        </span>
      </div>
      <div style="text-align: center; font-size: 40px; margin: 30px 0px">
        <span>加入鹏辉前程</span>
      </div>
      <img
        style="width: 100%; height: auto"
        src="https://26288866.s61i.faiusr.com/2/AD0I4sXEDBACGAAg2qHb-wUoxoj72wIw_g44oAY.jpg"
      />
      <div></div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      formItem: {
        account: "",
        password: "",
      },
      ruleInline: {
        account: [
          {
            required: true,
            message: "请填写用户名",
            trigger: "blur",
          },
        ],
        password: [
          {
            required: true,
            message: "请填写密码",
            trigger: "blur",
          },
          {
            type: "string",
            min: 6,
            message: "密码长度不能小于6位",
            trigger: "blur",
          },
        ],
      },
    };
  },
};
</script>
<style scoped>
.driver-div {
  background-image: url("https://13370474.s61i.faiusr.com/2/AD0I6oiwBhACGAAg75PdzQUowJzwTjCADzi8BQ.jpg");
  background-size: auto 100%;
  height: 585px;
  min-width: 1250px;
  width: 100%;
  position: relative;
}

.ph-driver-join {
  width: 300px;
  height: 350px;
  position: absolute;
  right: 180px;
  top: 100px;
  background: white;
  padding: 30px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
  border-radius: 5px;
}
</style>
