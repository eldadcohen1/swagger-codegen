/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.model;

import java.util.Date;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Order  {
  
  @ApiModelProperty(value = "")
  private Long id = null;

  @ApiModelProperty(value = "")
  private Long petId = null;

  @ApiModelProperty(value = "")
  private Integer quantity = null;

  @ApiModelProperty(value = "")
  private Date shipDate = null;


@XmlType(name="StatusEnum")
@XmlEnum(String.class)
public enum StatusEnum {

@XmlEnumValue("placed") PLACED(String.valueOf("placed")), @XmlEnumValue("approved") APPROVED(String.valueOf("approved")), @XmlEnumValue("delivered") DELIVERED(String.valueOf("delivered"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum b : StatusEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(value = "Order Status")
 /**
   * Order Status  
  **/
  private StatusEnum status = null;

  @ApiModelProperty(value = "")
  private Boolean complete = false;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Order id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Get petId
   * @return petId
  **/
  @JsonProperty("petId")
  public Long getPetId() {
    return petId;
  }

  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

 /**
   * Get quantity
   * @return quantity
  **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

 /**
   * Get shipDate
   * @return shipDate
  **/
  @JsonProperty("shipDate")
  public Date getShipDate() {
    return shipDate;
  }

  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  public Order shipDate(Date shipDate) {
    this.shipDate = shipDate;
    return this;
  }

 /**
   * Order Status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get complete
   * @return complete
  **/
  @JsonProperty("complete")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    return toIndentedString(o, false);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line). Obfuscate the value, if required.
   */
  private String toIndentedString(java.lang.Object o, boolean isObfuscated) {
    if (o == null) {
      return "null";
    }
    if (isObfuscated) {
      return "***";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

