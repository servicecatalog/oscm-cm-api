/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2018
 *                                                                                                                                 
 *  Creation Date: 08.10.20178                                                      
 *                                                                              
 *******************************************************************************/

package org.oscm.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.oscm.app.validation.ReadOnly;

@ApiModel(value = "Parameter", description = "Parameter of the instance")
public class InstanceParameterDTO {

    @ApiModelProperty(notes = "Identifier of teh parameter", readOnly = true)
    private long id;

    @ApiModelProperty(notes = "Unique key describing instance's parameter")
    private String key;

    @ApiModelProperty(notes = "Value of instance's parameter")
    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
