package com.xd.springbootshardingtable.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import groovy.transform.EqualsAndHashCode;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("order")
public class Order extends Model<User> implements java.io.Serializable {
    private static final long serialVersionUID = -7501493103131571532L;

    private Long id;
    private String name;
    private String pass;
}
