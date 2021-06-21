<template>
  <div style="text-align: center">
    <div class="text-head">
      <p style="font-size: 30px; margin-bottom: 30px">意见反馈</p>
      <div>
        <Form ref="formValidate" :model="formValidate" :rules="ruleValidate">
          <FormItem prop="date">
            <input class="text-content" type="text" v-model="formValidate.name" placeholder="您的称呼" />
          </FormItem>
          <FormItem prop="date">
            <input class="text-content" type="text" v-model="formValidate.phone" placeholder="您的手机号" />
          </FormItem>
          <FormItem prop="date">
            <input class="text-content" type="text" v-model="formValidate.mail" placeholder="您的邮箱" />
          </FormItem>
          <FormItem>
            <textarea 
              placeholder="我们非常重视您的宝贵意见，您可以在这里告诉我们"
              class="text-content"
              rows="3"
              cols="30"
              v-model="formValidate.advice"
            ></textarea>
          </FormItem>
        </Form>
      </div>
      <div>
        <div style="display: flex; justify-content: center">
          <Button style="width: 200px" size="large" type="error" @click="submit('formValidate')">立即提交</Button
          >
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      formValidate: {
        name: "",
        phone: "",
        mail: "",
        advice: "",
      },
      ruleValidate: {
        name: [
          {
            required: true,
            message: "The name cannot be empty",
            trigger: "blur",
          },
        ],
        mail: [
          {
            required: true,
            message: "Mailbox cannot be empty",
            trigger: "blur",
          },
          {
            type: "email",
            message: "Incorrect email format",
            trigger: "blur",
          },
        ],
        phone: [
          {
            required: true,
            message: "Please select the city",
            trigger: "change",
          },
        ],
        advice: [
          {
            required: true,
            message: "意见建议不能为空",
            trigger: "change",
          },
        ],
      },
    };
  },
  methods:{
    submit(){
      var name = this.formValidate.name;
      var phone = this.formValidate.phone;
      var mail = this.formValidate.mail;
      var advice = this.formValidate.advice;
      this.$Message.success("提交成功")
      console.log(name,phone,mail,advice)
    }
  }
};
</script>
<style scoped>
.text-head {
  width: 80%;
  margin: 30px auto;
  background: white;
  padding: 30px;
  border: 1px solid #eee;
}
.text-content {
  width: 100%;
  border: none;
  outline: none;
  border-radius: 4px;
  background: #f7f7f7;
  padding: 10px 10px;
  color: #657180;
}
li {
  list-style: none;
  float: left;

  text-align: left;
  padding: 30px;
}
::-webkit-input-placeholder {
  /* WebKit browsers */
  color: #ccc;
}
:-moz-placeholder {
  /* Mozilla Firefox 4 to 18 */
  color: #ccc;
}
::-moz-placeholder {
  /* Mozilla Firefox 19+ */
  color: #ccc;
}
:-ms-input-placeholder {
  /* Internet Explorer 10+ */
  color: #ccc;
}
</style>
