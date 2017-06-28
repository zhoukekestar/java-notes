# java-notes
Java Notes。虽然是个前端，但之前也接触过java，所以，就当复习做个笔记吧。

# 准备工作
* 安装Gradle，[查看具体操作](https://github.com/zhoukekestar/java-notes/wiki/Eclipse%E5%AE%89%E8%A3%85Gradle)
* 安装MySQL，[查看具体操作](https://github.com/zhoukekestar/java-notes/wiki/%E5%AE%89%E8%A3%85MySQL)

# 其它推荐资源
* [awesome-java](https://github.com/akullpp/awesome-java)
* [关于java的一些文档](https://github.com/EbookFoundation/free-programming-books/blob/master/free-programming-books-zh.md#java)
* [在线阅读: Spring Boot参考指南](https://qbgbook.gitbooks.io/spring-boot-reference-guide-zh/content/)
* [Spring Boot Samples](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples)
* [mybatis文档](http://www.mybatis.org/mybatis-3/zh/index.html)

# Projects
* `SpringBootHelloWorld`: 使用`Spring Boot`框架，用`maven`构建的`HelloWorld`项目
* `SpringBootHelloWorld-Gradle`: 使用`Spring Boot`框架，用`gradle`构建的`HelloWorld`项目
* `MyBatisHelloWorld`: 使用`mybatis`框架编写的`HelloWorld`项目
*  `SpringBoot-Mybatis`: 未完成
* `MybatisCRUD`

  * `mybatis-config.xml` 元素的声明循序必须按照
    ```
    properties?,settings?,typeAliases?,typeHandlers?,objectFactory?,objectWrapperFactory?,plugins?,environments?,databaseIdProvider?,mappers?
    ```

    ```xml
    <!-- 这样是可以的 -->
    <configuration>
      <properties resource="config.properties"></properties>

      <typeAliases></typeAliases>
    </configuration>

    <!-- 这样是不可以的，会报错 -->
    <configuration>
      <typeAliases></typeAliases>

      <properties></properties>
    </configuration>
    ```
* `CustomAnnotation`: 自定义注解
  * 方法名注解样例
  * 方法参数注解样例

    ```java
    @AutoRun(times = 3)
    public static void showMsgThreeTimes() {
      System.out.println("AutoRun showMsgThreeTimes!");
    }

    @AutoRun
    public static void showSingleMsg() {
      System.out.println("AutoRun showSingleMsg!");
    }

    public void showEmail(@Email String email) {
      System.out.println("email :" + email);
    }

    /* 输出
    AutoRun showSingleMsg!
    AutoRun showMsgThreeTimes!
    AutoRun showMsgThreeTimes!
    AutoRun showMsgThreeTimes!
    Jun 28, 2017 7:45:35 PM org.hibernate.validator.internal.util.Version <clinit>
    INFO: HV000001: Hibernate Validator 5.2.4.Final
    values:email size: 0 msg:
    values:abc size: 1 msg:Email is invalid.
    */
    ```

# 一些概念
* DAO

  查看Stackoverflow上的回答: [data-access-object-dao-in-java](https://stackoverflow.com/questions/19154202/data-access-object-dao-in-java)

  一个[DAO样例](http://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm)。
* IO

* 网络编程
* 多线程
* AOP
  * 主要目的
* DI
  * 主要目的
* 反射
