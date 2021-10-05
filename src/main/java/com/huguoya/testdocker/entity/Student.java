package com.huguoya.testdocker.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author huguo
 */
@Data
@ApiModel(description = "学生类",value = "Student")
public class Student {

  @ApiModelProperty(value = "id")
  Integer id;
  @ApiModelProperty(value = "名字")
  String name;
  @ApiModelProperty(value = "年龄")
  Integer age;
  @ApiModelProperty(value = "说什么")
  String sayWord;
}
