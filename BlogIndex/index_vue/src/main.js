import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { v4 as uuidv4 } from 'uuid';
uuidv4();
createApp(App).use(store).use(router).mount('#app')
