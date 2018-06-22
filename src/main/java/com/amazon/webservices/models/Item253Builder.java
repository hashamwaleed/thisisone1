/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class Item253Builder {
    //the instance to build
    private Item253 item253;

    /**
     * Default constructor to initialize the instance
     */
    public Item253Builder() {
        item253 = new Item253();
    }

    public Item253Builder aSIN(String aSIN) {
        item253.setASIN(aSIN);
        return this;
    }

    public Item253Builder parentASIN(String parentASIN) {
        item253.setParentASIN(parentASIN);
        return this;
    }

    public Item253Builder errors(Errors errors) {
        item253.setErrors(errors);
        return this;
    }

    public Item253Builder detailPageURL(String detailPageURL) {
        item253.setDetailPageURL(detailPageURL);
        return this;
    }

    public Item253Builder itemLinks(ItemLinks itemLinks) {
        item253.setItemLinks(itemLinks);
        return this;
    }

    public Item253Builder salesRank(String salesRank) {
        item253.setSalesRank(salesRank);
        return this;
    }

    public Item253Builder smallImage(Image smallImage) {
        item253.setSmallImage(smallImage);
        return this;
    }

    public Item253Builder mediumImage(Image mediumImage) {
        item253.setMediumImage(mediumImage);
        return this;
    }

    public Item253Builder largeImage(Image largeImage) {
        item253.setLargeImage(largeImage);
        return this;
    }

    public Item253Builder imageSets(List<ImageSets> imageSets) {
        item253.setImageSets(imageSets);
        return this;
    }

    public Item253Builder itemAttributes(ItemAttributes itemAttributes) {
        item253.setItemAttributes(itemAttributes);
        return this;
    }

    public Item253Builder variationAttributes(VariationAttributes variationAttributes) {
        item253.setVariationAttributes(variationAttributes);
        return this;
    }

    public Item253Builder relatedItems(List<RelatedItems> relatedItems) {
        item253.setRelatedItems(relatedItems);
        return this;
    }

    public Item253Builder collections(Collections collections) {
        item253.setCollections(collections);
        return this;
    }

    public Item253Builder subjects(Subjects subjects) {
        item253.setSubjects(subjects);
        return this;
    }

    public Item253Builder offerSummary(OfferSummary offerSummary) {
        item253.setOfferSummary(offerSummary);
        return this;
    }

    public Item253Builder offers(Offers offers) {
        item253.setOffers(offers);
        return this;
    }

    public Item253Builder rentalOffers(RentalOffers rentalOffers) {
        item253.setRentalOffers(rentalOffers);
        return this;
    }

    public Item253Builder variationSummary(VariationSummary variationSummary) {
        item253.setVariationSummary(variationSummary);
        return this;
    }

    public Item253Builder variations(Variations variations) {
        item253.setVariations(variations);
        return this;
    }

    public Item253Builder customerReviews(CustomerReviews customerReviews) {
        item253.setCustomerReviews(customerReviews);
        return this;
    }

    public Item253Builder editorialReviews(EditorialReviews editorialReviews) {
        item253.setEditorialReviews(editorialReviews);
        return this;
    }

    public Item253Builder similarProducts(SimilarProducts similarProducts) {
        item253.setSimilarProducts(similarProducts);
        return this;
    }

    public Item253Builder accessories(Accessories accessories) {
        item253.setAccessories(accessories);
        return this;
    }

    public Item253Builder tracks(Tracks tracks) {
        item253.setTracks(tracks);
        return this;
    }

    public Item253Builder browseNodes(BrowseNodes243 browseNodes) {
        item253.setBrowseNodes(browseNodes);
        return this;
    }

    public Item253Builder alternateVersions(AlternateVersions alternateVersions) {
        item253.setAlternateVersions(alternateVersions);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Item253 build() {
        return item253;
    }
}