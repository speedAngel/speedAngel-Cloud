# speedAngel-Cloud  

1. 创建`speedAngel-Cloud`Maven POM Project

2. 删除`src`文件夹

# EurekaServer 
1. 创建`EurekaServer` spring boot项目 ，speedAngel-Cloud的子项目，创建时添加`EurekaServer` 组件 spring-cloud-starter-netflix-eureka-server

2. 配置`application.yml`配置

3. 在# EurekaServerApplication #类上面添加`@EnableEurekaServer`注解

4. 启动，访问http://localhost:8761/

# EurekaClient

1. 创建EurekaClient spring-boot项目，speedAngel-Cloud的子项目
 
2. 添加spring-cloud-starter-netflix-eureka-client依赖

3. 设置服务中心配置信息

4. 在启动类上添加@EnableEurekaClient注解
