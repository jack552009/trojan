/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum CqlResultType implements TEnum {
  ROWS(1),
  VOID(2),
  INT(3);

  private final int value;

  private CqlResultType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static CqlResultType findByValue(int value) { 
    switch (value) {
      case 1:
        return ROWS;
      case 2:
        return VOID;
      case 3:
        return INT;
      default:
        return null;
    }
  }
}