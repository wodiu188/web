import { createRouter, createWebHistory } from 'vue-router'
import MainLayout from '../layout/MainLayout'
import RightSider from '../components/RightSider'
import MainPage from '../views/mainPage'
const routes = [
  {
    path: '',
    name: 'Home',
    component: MainLayout,
    redirect:'/MainPage',
    children:[
        {
          path:'/MainPage',
          name:"MainPage",
          components:{
            left:MainPage,
            right:RightSider
          }
      },{
        path:"/content",
        name:"ContentPage",
        components: {
          left:()=>import("../views/ContentPage"),
          right: RightSider
        }
      }
    ]
  },{
    path:"/insertArticle",
    name:"inserA",
    component: ()=>import("../views/InsertTest")
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
