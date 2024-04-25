
## 📁 项目目录
```
Yuki-backend
├── sql                                 # SQL脚本
    ├── mysql5                          # MySQL5 脚本
    ├── mysql8                          # MySQL8 脚本
├── src                                 # 源码目录
    ├── common                          # 公共模块
    ├── config                          # 自动装配配置
        ├── CorsConfig                  # 跨域共享配置
        ├── MybatisConfig               # Mybatis 自动装配配置
        ├── RedisCacheConfig            # Redis 缓存自动装配配置
        ├── RedisConfig                 # Redis 自动装配配置
        ├── SecurityConfig              # Spring Security 自动装配配置
        ├── SwaggerConfig               # API 接口文档配置
        ├── WebMvcConfig                # WebMvc 配置
        ├── WebSocketConfig             # WebSocket 自动装配配置
        ├── XxlJobConfig                # XXL-JOB 自动装配配置
    ├── controller                      # 控制层
    ├── converter                       # MapStruct 转换器
    ├── filter                          # 过滤器
        ├── RequestLogFilter            # 请求日志过滤器
        ├── VerifyCodeFilter            # 验证码过滤器
    ├── model                           # 模型层
        ├── bo                          # 业务对象
        ├── dto                         # 数据传输对象
        ├── entity                      # 实体对象
        ├── form                        # 表单对象
        ├── query                       # 查询参数对象
        ├── vo                          # 视图对象
    ├── mapper                          # 数据库访问层
    ├── plugin                          # 插件(可选)
        ├── captcha                     # 验证码插件，用于生成验证码
        ├── dupsubmit                   # 防重提交插件，用于防止表单重复提交
        ├── mybatis                     # Mybatis 插件，数据权限、字段填充
        ├── easyexcel                   # EasyExcel 插件，Excel 文件的读写
        ├── xxljob                      # XXL-JOB 插件，分布式任务调度和执行
    ├── security                        # Spring Security 安全配置和扩展
        ├── util                        # 工具类
            ├── JwtUtils                # JWT 工具类，用于生成和解析 JWT
            ├── SecurityUtils           # Spring Security 工具类，用于获取当前登录用户
    ├── service                         # 业务逻辑层

    
└── end       
```

## 🌈 接口文档

- `knife4j` 接口文档：[http://localhost:8989/doc.html](http://localhost:8989/doc.html)
- `swagger` 接口文档：[http://localhost:8989/swagger-ui/index.html](http://localhost:8989/swagger-ui/index.html)


## 🚀 项目启动

1. **数据库初始化**

    执行 [yuki-backend.sql](sql/mysql8/yuki-backend.sql) 脚本完成数据库创建、表结构和基础数据的初始化。

2. **修改配置**

    [application-dev.yml](src/main/resources/application-dev.yml) 修改MySQL、Redis连接配置；

3. **启动项目**

    执行 [SystemApplication.java](src/main/java/com/youlai/system/SystemApplication.java) 的 main 方法完成后端项目启动；

    访问接口文档地址 [http://ip:port/doc.html](http://localhost:8989/doc.html) 验证项目启动是否成功。



