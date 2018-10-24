import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {Child1Component} from './child1/child1.component';
import {Child2Component} from './child2/child2.component';
import {RoleModule} from './role/role.module';

const routes: Routes = [
  // 每一个对象都是一个路由配置

  // 指定子组件url地址,child1 对应的是Child1Component
  {
    path: 'child1',
    // 对应的组件名称
    component: Child1Component
  },
  {
    path: 'child2',
    component: Child2Component
  },
  {
    path: '',
    redirectTo: 'child1',
    pathMatch: 'full'
  },

  {
    path: 'role',
    loadChildren: () => RoleModule
  }

];

@NgModule({
  // 使用useHash属性,自动生成/#,具有局部缓存的作用
  imports: [RouterModule.forRoot(routes, {useHash: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
