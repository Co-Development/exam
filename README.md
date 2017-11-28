# 考试出题系统

> 基于springboot + mybatis
>
> 数据库为mysql
>
> 2017-11-28 13:10
>
> 小罗正式加入
>
> zxg正式加入

## 数据库
### 连接
* 地址118.89.101.23
* 数据库名exam
* 用户名TheThreeStooges
* 密码sasasa
### 表
* 题库表（test）

|字段名|数据类型|是否为空|主外键|备注|
|:--|:--|:--|:--|:--|
|test_id|int|否|主键|题目ID|
|test_question|varchar(255)|否||题目问题|
|test_a|varchar(255)|否||题目A选项|
|test_b|varchar(255)|否||题目B选项|
|test_c|varchar(255)|否||题目C选项|
|test_right|varchar(5)|否||题目正确选项|
