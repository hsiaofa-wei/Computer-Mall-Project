# 电脑商城项目 - Web开发实训

## 项目简介
本项目是一个基于Spring Boot的电脑商品在线销售平台，其主要功能包括：
- 用户注册、登录系统
- 商品浏览与分类展示
- 购物车功能
- 订单管理
- 地址管理
- 商品收藏功能

项目采用前后端分离架构，前端使用Bootstrap框架构建响应式页面，后端使用Spring Boot+MyBatis技术栈。

## 技术栈

### 后端技术
- Spring Boot：基础框架
- MySQL 8.0：关系型数据库
- MyBatis：ORM框架（开启驼峰命名映射）
- Lombok：简化实体类开发
- Maven：项目构建与依赖管理

### 前端技术
- Bootstrap 3：响应式页面框架
- Font Awesome 4.7.0：图标库
- jQuery 1.9.1：DOM操作与AJAX请求
- Holder.js：图片占位工具

## 运行环境
- JDK：1.8
- 操作系统：Windows 11
- IDE：IntelliJ IDEA 
- 数据库：MySQL（端口3306）

## 项目启动
1. 确保数据库已创建并导入数据。   
2. 在`src/main/resources/application.yaml`中配置数据库连接信息。
   ```
   spring:
   datasource:
   url: jdbc:mysql://localhost:3306/数据库名?serverTimezone=UTC&character=utf-8
   username: 你的账号
   password: 你的密码
   driver-class-name: com.mysql.cj.jdbc.Driver
   ```
3. 启动项目。
4. 打开浏览器访问前端页面：`http://localhost:8080/`

## 不足之处
### 功能方面
#### 核心功能待完善：
- 商品搜索功能未完全实现
- 支付功能仅为模拟实现
- 缺少后台管理系统

#### 用户体验：
- 页面交互效果较简单
- 缺少数据验证和错误提示
- 响应式设计有待优化

#### 业务逻辑：
- 库存管理未实现
- 优惠券/促销功能缺失
- 订单状态流转不完整

#### 技术方面
- 前端代码复用率低（大量重复HTML）
- 缺少模块化设计
- CSS样式组织混乱
- 接口权限控制不完善
- 未实现缓存机制
- 图片未做压缩处理
- 数据库查询未优化

#### 项目亮点
- 完整的电商业务流程实现 
- 清晰的MVC架构
- 使用了主流的Java技术栈
- 前后端分离开发
- 良好的代码注释和文档
- 项目结构清晰，易于维护和扩展 

## 项目结构
```
store/ 
├── .idea/ # IDE配置文件 
├── src/
│ ├── main/ 
│ │ ├── java/ # Java源代码
│ │ └── resources/ 
│ │ ├── application.yaml # 应用配置
│ │ └── static/ # 静态资源 
│ │ ├── bootstrap3/ # Bootstrap框架
│ │ ├── images/ # 图片资源 
│ │ ├── js/ # JavaScript文件 
│ │ └── web/ # 前端页面 
│ └── test/ # 测试代码 
├── target/ # 构建输出
├── pom.xml # Maven配置
└── store.iml # 项目配置文件
```

## 部分截图展示
![部分截图预览](/SomeDisplays/Show(1).png)
![部分截图预览](/SomeDisplays/Show(2).png)
![部分截图预览](/SomeDisplays/Show(3).png)
![部分截图预览](/SomeDisplays/Show(4).png)
![部分截图预览](/SomeDisplays/Show(5).png)
![部分截图预览](/SomeDisplays/Show(6).png)
![部分截图预览](/SomeDisplays/Show(7).png)
>更多内容请您下载观看
