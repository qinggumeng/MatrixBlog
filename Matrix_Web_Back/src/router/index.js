import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/login.html'
    },
    {
      path: '/login.html',
      component: () => import('@/views/login/index')
    },
    {
      path: '/index.html',
      component: () => import('@/views/login/index')
    }
  ]
})
