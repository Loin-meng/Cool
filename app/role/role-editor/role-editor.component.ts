import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-role-editor',
  templateUrl: './role-editor.component.html',
  styleUrls: ['./role-editor.component.css']
})
export class RoleEditorComponent implements OnInit {
  // ActivatedRoute属性
  constructor(private route: ActivatedRoute) {
    // 对路由参数进行注册,来获取路由的参数
    // 只要访问了/role/modify这个路由,下面的事件就会执行
    this.route.paramMap.subscribe(params => {
      const roleId = params.get('roleId');
      console.log(roleId);
      // 对roleId做是否为null的判断,就可以区分出
      // 是点击添加还是编辑按钮访问的该组件
    });
  }

  ngOnInit() {
  }

}
