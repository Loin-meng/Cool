import {Component, OnInit} from '@angular/core';
import {RoleService} from './role.service';

@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.css']
  // 因为声明到了模块中,所以这里不需要写了
  // 如果某个Service只需要在该组件下使用
  // 那么在在此处声明
  // providers: [RoleService]
})
export class RoleComponent implements OnInit {
  // 定义一个全局变量,最好给他定义初始值,防止空指针报错,
  dataSource: any[] = [];

  // 依赖注入: 自动将RoleService的对象通过构造方法传递进来
  constructor(private roleService: RoleService) {

  }

  ngOnInit() {
    // resp就是getRoleList方法返回的数据
    this.roleService.getRoleList().subscribe(resp => {
      // 把请求的数据赋值给成员变量
      this.dataSource = resp;
    });


    const body = {roleId: 10, roleName: '六百'};
    this.roleService.addRole(body).subscribe(resp => console.log(resp));
  }

}
