package org.toobsframework.pres.component.datasource.api;

import org.toobsframework.exception.BaseException;

/**
 * @author stewari
 */
public class NotAMappedPropertyException extends BaseException {
    
    private String dataSourceId;
    private String objectId;
    private String propertyName;
    
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }
    
    public String getDataSourceId() {
        return this.dataSourceId;
    }
    
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    
    public String getObjectId() {
        return this.objectId;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
    
    public String getPropertyName() {
        return this.propertyName;
    }
}
