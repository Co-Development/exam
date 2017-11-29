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

## 题库源
* word转成excel位置：/resources/bank/全体党员学习学习“十九大”精神和党纪党规应知应会题.xlsx(判断题“0”代表错误，“1”代表正确)

## 数据库
### 连接
* 地址118.89.101.23
* 数据库名exam
* 用户名TheThreeStooges
* 密码sasasa
### 表
* 三项单选表（test1）

|字段名|数据类型|是否为空|主外键|备注|
|:--|:--|:--|:--|:--|
|test_id|int|否|主键|题目ID，自动递增|
|test_question|varchar(255)|否||题目问题|
|test_a|varchar(255)|否||题目A选项|
|test_b|varchar(255)|否||题目B选项|
|test_c|varchar(255)|否||题目C选项|
|test_right|varchar(255)|否||题目正确选项内容|

* 四项单选题（test2）

|字段名|数据类型|是否为空|主外键|备注|
|:--|:--|:--|:--|:--|
|test_id|int|否|主键|题目ID，自动递增|
|test_question|varchar(255)|否||题目问题|
|test_a|varchar(255)|否||题目A选项|
|test_b|varchar(255)|否||题目B选项|
|test_c|varchar(255)|否||题目C选项|
|test_d|varchar(255)|否||题目D选项|
|test_right|varchar(255)|否||题目正确选项内容|

* 四项多选题（test3）

|字段名|数据类型|是否为空|主外键|备注|
|:--|:--|:--|:--|:--|
|test_id|int|否|主键|题目ID，自动递增|
|test_question|varchar(255)|否||题目问题|
|test_a|varchar(255)|否||题目A选项|
|test_b|varchar(255)|否||题目B选项|
|test_c|varchar(255)|否||题目C选项|
|test_d|varchar(255)|否||题目D选项|
|test_right|varchar(255)|否||题目正确选项内容，多条用!@!隔开|

* 判断题（test4）

|字段名|数据类型|是否为空|主外键|备注|
|:--|:--|:--|:--|:--|
|test_id|int|否|主键|题目ID，自动递增|
|test_question|varchar(255)|否||题目问题|
|test_result|int|否||题目是否正确，1为正确，0为错误。|

* 考生表（examen）

|字段名|数据类型|是否为空|主外键|备注|
|:--|:--|:--|:--|:--|
|examen_id|int|否|主键|考生ID，自动递增|
|examen_name|varchar(20)|否||考生姓名|
|examen_dpm|varchar(30)|否||考生所在部门|
|examen_score|int|是||考生成绩|
|examen_time|datetime |是||考生考试时间|
