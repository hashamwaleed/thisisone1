/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Items35 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5181899759274528784L;
    private List<Item34> item;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Item")
    public List<Item34> getItem ( ) { 
        return this.item;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Item")
    public void setItem (List<Item34> value) { 
        this.item = value;
    }
 
}
 