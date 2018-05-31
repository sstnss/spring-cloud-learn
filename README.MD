- **spring cloud 学习笔记**

- [**spring cloud git教程**](https://github.com/forezp/SpringCloudLearning)
- [**spring cloud教程**](https://blog.csdn.net/forezp/article/details/70148833/)

-[两小时学习spring boot](https://blog.csdn.net/forezp/article/details/61472783)
  * [idea 构建工程](#ideal_build)`new prpject -> spring initializr`
  * [yml语法](https://blog.csdn.net/vincent_hbl/article/details/75411243)
  * [controller]()`@RestController//等同于同时加上了@Controller和@ResponseBody`
  * [spring boot 1.*与2.*版本区别](https://blog.csdn.net/j3T9Z7H/article/details/79417470)`对应需要注意组件版本及配置文件的不同`
  * [idea maven打包](https://blog.csdn.net/qq_41823385/article/details/80366766)`只需打开maven project ==>Lifecycle=>run maven build`
  * [spring-data-jpa](https://www.cnblogs.com/dreamroute/p/5173896.html)`通过findByxxx可查询`
  * [spring cloud 与spring boot 版本对应关系](https://blog.csdn.net/ljj_9/article/details/78645267)
  * [markdown简单语法](https://www.jianshu.com/p/191d1e21f7ed)
  * [spring boot配置文件与多环境配置](https://blog.csdn.net/forezp/article/details/70437576)`创建多个application-dev.yml,application-prod.yml 并在application.yml中指定环境启动spring:
  * [spring boot整合mybatis](https://blog.csdn.net/forezp/article/details/70833629)`springboot中已经默认对jpa、jdbc、mybatis开启了事事务，只需要一个注解@Transactional `                                                                                                                                                        profiles:
  * [spring boot整合mybatis详细版](http://blog.720ui.com/2016/springboot_02_data_mybatis/) `可用阿里的fastjson转换json中的key与bean中的属性不能匹配问题，@JSONField进行注解`
  * [mybatis自动生成实体类](https://blog.csdn.net/u011734144/article/details/60351678) `mybatis-generator-maven-plugin插件自动生成代码` 
  * [spring boot整合PageHelper](https://www.cnblogs.com/onetwo/p/7371778.html)  [github](https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/zh/HowToUse.md)                                                                                                                                                     
  * [spring boot redis](https://www.cnblogs.com/EasonJim/p/7805665.html)[哨兵模式](https://www.cnblogs.com/EasonJim/p/7805665.html) [操作数据](https://www.cnblogs.com/EasonJim/p/7803067.html)`redisTemplate.opsForValue();//操作字符串
                                                                                                                                                                                        redisTemplate.opsForHash();//操作hash
                                                                                                                                                                                        redisTemplate.opsForList();//操作list
                                                                                                                                                                                        redisTemplate.opsForSet();//操作set
                                                                                                                                                                                        redisTemplate.opsForZSet();//操作有序set`
  * [关于RedisTemplate和StringRedisTemplate](https://blog.csdn.net/notsaltedfish/article/details/75948281)`推荐用StringRedisTemplate`   
  * [基于Spring的Restful接口生成工具](https://www.jianshu.com/p/ecb8daa4ecf7)`swagger2 Asciidoc asciidoctor` [实例](https://blog.csdn.net/forezp/article/details/71023510)   
  * [spring boot缓存](https://blog.csdn.net/forezp/article/details/71023614) [缓存完整](http://jinnianshilongnian.iteye.com/blog/2001040)`Spring Cache注解对于大多数场景够用了，如果场景复杂还是考虑使用AOP吧；如果自己实现请考虑使用Spring Cache API进行缓存抽象`   
  * [spring boot定时任务](https://blog.csdn.net/forezp/article/details/71023783)[`表达式类似crontab`](https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/scheduling/support/CronSequenceGenerator.html)   
  * [spring boot Validator](https://blog.csdn.net/wingkoo1986/article/details/70768730) [实例](https://blog.csdn.net/forezp/article/details/71023817)  [介绍2](https://www.cnblogs.com/mr-yang-localhost/p/7812038.html)`可用分组功能实现特定操作对特定字段进行验证`
  * [spring boot docker](https://blog.csdn.net/forezp/article/details/71024219)   
  * [spring boot集成tk.mybatis制作通用baseDao/baseService](https://blog.csdn.net/shikaiwencn/article/details/52485883)
     
     
                                                                                                                                                           
                                                                                                                                                           active: dev`
  
  
  
  
  
  
  
  