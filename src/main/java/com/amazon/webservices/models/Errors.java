/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Errors 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4882901569866455974L;
    private List<Error> error;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Error")
    public List<Error> getError ( ) { 
        return this.error;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Error")
    public void setError (List<Error> value) { 
        this.error = value;
    }
 
}
 