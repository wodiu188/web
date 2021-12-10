import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '',
    name: 'main',
    component: ()=>import("../layouts/Main.vue"),
    children:[{
      path: '/about',
      name: 'About',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
    }]
  },
  {
    path: "/test",
    name: "Home",
    component:()=>import("../views/Home.vue")
  }

]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
