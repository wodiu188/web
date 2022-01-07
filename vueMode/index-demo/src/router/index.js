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
      },{
        path:"/test",
        name:"RightSiderLabel",
        components: {
          top:()=>import("../components/RightSiderLabel")
        }
      }
    ]
  },{
    path:"/insertArticle",
    name:"inserA",
    component: ()=>import("../views/InsertTest")
  },{
    path:"/editorArticle",
    name:"editorA",
    component: ()=>import("../views/EditorArticle")
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
