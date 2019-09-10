<template>
    <div class="companey">
        <div class="componeny-detail">
            <h1>this is an about Page </h1>
           <Button type="primary" @click="back()">返回</Button>
        </div>
    </div>
</template>
<script>
export default {
    data(){
        return{

        }
    },
    methods:{
        back(){
            this.$router.go(-1)
        }
    }
}
</script>