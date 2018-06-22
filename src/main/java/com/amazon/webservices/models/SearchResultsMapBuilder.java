/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class SearchResultsMapBuilder {
    //the instance to build
    private SearchResultsMap searchResultsMap;

    /**
     * Default constructor to initialize the instance
     */
    public SearchResultsMapBuilder() {
        searchResultsMap = new SearchResultsMap();
    }

    public SearchResultsMapBuilder searchIndex(List<SearchIndex> searchIndex) {
        searchResultsMap.setSearchIndex(searchIndex);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SearchResultsMap build() {
        return searchResultsMap;
    }
}