import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import 'ant-design-vue/dist/antd.css'
import Antd from 'ant-design-vue'
import bodyParser from "body-parser";
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
// import vuetimeline from "@growthbunker/vuetimeline";

const app = createApp(App)
app.config.productionTip = false
app.use(Antd)
    .use(store)
    .use(router)
    .use(bodyParser)
    .use(ElementPlus)


    // .use(vuetimeline)

    .mount('#app')


