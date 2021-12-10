import { createApp } from 'vue'
import App from './App'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue';
import 'ant-design-vue/dist/antd.css';
import "@ant-design/icons-vue";
const app = createApp(App);
app.config.productionTip = false;
app.use(store).use(router).use(Antd).mount('#app')

