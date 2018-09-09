import Vue from 'vue'
import Router from 'vue-router'
import ManagerAccount from '@/page/AccountManager'

Vue.use(Router);

export default new Router({
  routes: [
    {
      name: 'ManagerAccount',
      path: '/system/account',
      component: ManagerAccount
    }
  ]
})
