/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Creator 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5152926662720396450L;
    private String role;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Role")
    public String getRole ( ) { 
        return this.role;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Role")
    public void setRole (String value) { 
        this.role = value;
    }
 
}
 