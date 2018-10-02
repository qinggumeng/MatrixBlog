# MatrixBlog

## 分布式开源个人博客网站

项目正在开发阶段，欢迎感兴趣的同胞一起参与。

#### 技术架构设计：

- 使用Spring Cloud微服务 + ZooKeeper分布式协调中心（目前暂未加入ZooKeeper，暂使用Eureka）

- 使用MyBatis + Durid + Redis做数据持久及缓存

- 使用RabbitMQ做消息队列，服务间通讯

- 使用Vue.js + ElementUI做后台管理系统前端架构
- 采用前后端分离设计

#### 功能架构设计：

暂实现单用户个人博客，后期考虑修改多用户博客论坛

#### 项目模块说明：

- Matrix_Back_Account--------------------------------后台用户相关接口服务
- Matrix_Config_Floder--------------------------------配置中心配置文件库
- Matrix_ConfigCenter---------------------------------配置中心项目
- Matrix_Front_Content-------------------------------前台文章相关接口服务
- Matrix_RegisterCenter------------------------------Eureka注册中心
- Matrix_Web_Back-------------------------------------后台前端页面
- Matrix_Web_Front------------------------------------前台前端页面

#### 个人联系方式：

QQ： 2250795018

Wechat：  FX3A87

Email： jaosnfu516@outlook.com

Profile：www.jasonfx.com

（考虑到方便你们运行，项目中有些私密信息就不隐藏了，开源不易，望尊重作者）
