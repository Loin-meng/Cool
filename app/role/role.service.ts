import {Injectable} from '@angular/core';
import {from, Observable, of} from 'rxjs';
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class RoleService {

  dataSource: any[] = [
    {
      roleId: 1,
      roleName: '超级管理员'
    },
    {
      roleId: 2,
      roleName: '管理员'
    },
    {
      roleId: 3,
      roleName: '超级管理员'
    }
  ];
  // 网络请求的地址
  host = 'http://localhost:8080/';

  // 发送网络请求
  constructor(private client: HttpClient) {

  }

  // 添加请求头
  headers: HttpHeaders = new HttpHeaders({
    name: 'success',
    'Content-type': 'application/json'
  });

  // 给数据提供一个方法
  // Observable
  getRoleList(): Observable<any> {
    // return的数据是网页请求下来的数据,耗时
    // 使用RXjs的from()相当于遍历,里面有几个元素就发送几次
    // of 操作符,把数组当做一个整体进行发送
    // return of(this.dataSource);
    // 向http://localhost:8080/role/list 发送一个GET请求
    return this.client.get(`${this.host}role/list`, {
      headers: this.headers,
      params: {
        page: '1',
        size: '20'
      }
    });
  }

  addRole(role: any): Observable<any> {
    return this.client.post(`${this.host}role/add`, role, {});
  }
}
