/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class CartModifyBuilder {
    //the instance to build
    private CartModify cartModify;

    /**
     * Default constructor to initialize the instance
     */
    public CartModifyBuilder() {
        cartModify = new CartModify();
    }

    public CartModifyBuilder marketplaceDomain(String marketplaceDomain) {
        cartModify.setMarketplaceDomain(marketplaceDomain);
        return this;
    }

    public CartModifyBuilder aWSAccessKeyId(String aWSAccessKeyId) {
        cartModify.setAWSAccessKeyId(aWSAccessKeyId);
        return this;
    }

    public CartModifyBuilder associateTag(String associateTag) {
        cartModify.setAssociateTag(associateTag);
        return this;
    }

    public CartModifyBuilder validate(String validate) {
        cartModify.setValidate(validate);
        return this;
    }

    public CartModifyBuilder xMLEscaping(String xMLEscaping) {
        cartModify.setXMLEscaping(xMLEscaping);
        return this;
    }

    public CartModifyBuilder shared(CartModifyRequest shared) {
        cartModify.setShared(shared);
        return this;
    }

    public CartModifyBuilder request(List<CartModifyRequest> request) {
        cartModify.setRequest(request);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CartModify build() {
        return cartModify;
    }
}