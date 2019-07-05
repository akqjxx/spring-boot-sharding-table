package com.xd.springbootshardingtable.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import groovy.transform.EqualsAndHashCode;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("log")
public class Log extends Model<Log> implements java.io.Serializable {

    private static final long serialVersionUID = 7193414055649287290L;

    private String str;
}
