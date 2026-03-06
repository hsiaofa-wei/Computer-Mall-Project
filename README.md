## 部分截图展示
![部分截图预览](/SomeDisplays/Show(1).png)
![部分截图预览](/SomeDisplays/Show(2).png)
![部分截图预览](/SomeDisplays/Show(3).png)
![部分截图预览](/SomeDisplays/Show(4).png)
![部分截图预览](/SomeDisplays/Show(5).png)
![部分截图预览](/SomeDisplays/Show(6).png)
![部分截图预览](/SomeDisplays/Show(7).png)
>更多内容请您下载观看

# TechHub Mall · 数码电商平台

基于 **Spring Boot + MyBatis** 开发的前后端分离商品在线销售系统，提供完整的电商购物体验。

## 项目简介
TechHub Mall 是一个功能齐全的数码电商平台，用户可以浏览分类商品、加入购物车、下单支付、收藏心仪产品，并管理收货地址和个人订单。项目采用前后端分离架构，后端负责业务逻辑和数据接口，前端使用 Bootstrap 实现响应式页面。

核心功能：
- 用户注册/登录/个人信息管理
- 商品分类浏览 & 详情查看
- 购物车（添加/编辑/删除/结算）
- 订单创建、支付模拟、状态跟踪
- 收货地址管理
- 商品收藏夹
## 技术栈

### 后端
- Spring Boot（核心框架）
- MySQL 8.0（数据库）
- MyBatis（ORM，开启驼峰映射）
- Lombok（简化实体类）
- Maven（依赖管理 & 构建）

### 前端
- Bootstrap 3（响应式布局）
- jQuery 1.9.1（DOM 操作 & AJAX）
- Font Awesome 4.7.0（图标）
- Holder.js（图片占位）

## 运行环境
- JDK 1.8+
- MySQL 8.0（端口 3306）
- 操作系统：Windows / macOS / Linux
- IDE：IntelliJ IDEA / Eclipse

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
欢迎 Star & Fork！如果对 Spring AI、多模态应用或 Vue 3 全栈开发感兴趣，欢迎 Issues 交流～

