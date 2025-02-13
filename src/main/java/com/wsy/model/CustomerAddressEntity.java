package com.wsy.model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;
import com.wsy.entity.BaseEntity;
import lombok.Data;
import com.wsy.table.CustomerAddressTable;


/**
 * 客户收货地址
 * @author Wsy
 */
@Data
@TableName("customer_address")
public class CustomerAddressEntity extends BaseEntity{
  /**
   * 地址
   */
  @TableField(CustomerAddressTable.ADDRESS)
  private String address;
  /**
   * 收货人
   */
  @TableField(CustomerAddressTable.NAME)
  private String name;
  /**
   * 电话
   */
  @TableField(CustomerAddressTable.PHONE)
  private String phone;
  /**
   * 客户ID
   */
  @TableField(CustomerAddressTable.CUSTOMER_ID)
  private String customerId;
}
