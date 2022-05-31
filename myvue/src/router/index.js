import Vue                   from 'vue'
import Router                from 'vue-router'
import homeindex             from '@/components/HelloWorld'
import QueryTheDateOfStudent from '@/components/QueryTheDateOfStudent' 
import Login                 from '@/components/login'
import addstudent            from '@/components/addstudent'
import AdminManagement       from '@/components/AdminManagement'
import addoneadmin           from '@/components/addoneadmin'
import PayManagement         from '@/components/PayManagement'
import JFXT                  from '@/components/PayUpdate'
import shtp                  from '@/components/shtp'
import baodao                from '@/components/baodao'
import room                  from '@/components/room'
import roomupdate            from '@/components/roomupdate'
import classma               from '@/components/claamanagement'
import QueryTheClassOfStudent from '@/components/QueryTheClassOfStudent'
import index                 from '@/components/SystemManagement'
import gongao                from '@/components/gonggao'
import sdengru               from '@/components/studentlogin'
import sindex                from '@/components/stuindex'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/stu/index',
      name: 'stuindex',
      component: sindex
    },
    {
      path: "/stu/dengru",
      name: "sdengru",
      component: sdengru,
    },
    {
      path: '/gonggao/management',
      name: 'management',
      component: gongao
    },
    {
      path: '/class/QueryTheClassOfStudent',
      name: 'QueryTheClassOfStudent',
      component: QueryTheClassOfStudent,
    },
    {
      path: '/index',
      name: 'index',
      component: index
    },
    {
      path: '/classmanagement',
      name: 'classmanagement',
      component: classma
    },
    {
      path: '/room/update',
      name: 'roomupdate',
      component: roomupdate
    },
    {
      path: '/user/room',
      name: 'room',
      component: room
    },
    {
      path: '/user/baodao',
      name: 'baodao',
      component: baodao,
    },
    {
      path: '/user/shtp',
      name: 'fhtp',
      component: shtp
    },
    {
       path: '/user/jfxt/',
       name: 'JFXT',
       component: JFXT
    },
    {
       path: '/user/paymanagement',
       name: 'paymanagement',
       component: PayManagement
    },
    {
      path: '/user/addoneadmin',
      name: 'addoneadmin',
      component: addoneadmin,
    },
    {
       path: '/user/AdminManagement',
       name: 'AdminManagement',
       component: AdminManagement
    },
    {
       path: '/user/QueryTheDateOfStudent',
       name: 'QueryTheDateOfStudent',
       component: QueryTheDateOfStudent
    },
    {
      path: '/',
      name: 'homeindex',
      component: homeindex
    },
    {
      path: '/user/login',
      name: 'login',
      component: Login
    },
    {
      path: '/user/addstudent',
      name: 'name',
      component: addstudent
    }
  ]
})
