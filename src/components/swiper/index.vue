<template>
  <Carousel autoplay v-model="value2" loop :dots="dots">
    <CarouselItem>
      <div class="demo-carousel">
        <img style="width: 100%;" src="http://www.wlj.com.cn/UploadFile/ads/bcdd671c-ca36-489e-ab72-fbb20b4086bb.png" alt />
      </div>
    </CarouselItem>
    <CarouselItem>
      <div class="demo-carousel">
        <img style="width: 100%;" src="http://www.wlj.com.cn/UploadFile/ads/20b90298-200a-4ce7-87db-3988ec99c44a.png" alt />
      </div>
    </CarouselItem>
    <CarouselItem>
      <div class="demo-carousel">
        <img style="width: 100%;" src="http://www.wlj.com.cn/UploadFile/ads/06c29124-808a-44bc-b2a2-6268811a6c71.png" alt />
      </div>
    </CarouselItem>
    <CarouselItem>
      <div class="demo-carousel">
        <img style="width: 100%;" src="http://www.wlj.com.cn/UploadFile/ads/869a6f37-7ae7-45ef-a5e2-4bae8ad120f1.png" alt />
      </div>
    </CarouselItem>
  </Carousel>
</template>
<script>
export default {
  name: "Swiper",
  data() {
    return {
      value2: 0,
      dots:'none'
    };
  },
};
</script>
