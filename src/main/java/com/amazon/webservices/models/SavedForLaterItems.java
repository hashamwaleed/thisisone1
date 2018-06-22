/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SavedForLaterItems 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5458753929963336506L;
    private List<CartItem> savedForLaterItem;
    private Price subTotal;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SavedForLaterItem")
    public List<CartItem> getSavedForLaterItem ( ) { 
        return this.savedForLaterItem;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SavedForLaterItem")
    public void setSavedForLaterItem (List<CartItem> value) { 
        this.savedForLaterItem = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SubTotal")
    public Price getSubTotal ( ) { 
        return this.subTotal;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SubTotal")
    public void setSubTotal (Price value) { 
        this.subTotal = value;
    }
 
}
 