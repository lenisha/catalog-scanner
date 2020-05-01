/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.msft.atlasscanservice;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PList.
 * Paginated-list, for returning search results.
 */
public class JsonPList {
    /**
     * An array of objects.
     */
    @JsonProperty(value = "list")
    private List<Object> list;

    /**
     * The size of the page.
     */
    @JsonProperty(value = "pageSize")
    private Integer pageSize;

    /**
     * The sorted by field.
     */
    @JsonProperty(value = "sortBy")
    private String sortBy;

    /**
     * Possible values include: 'NONE', 'ASC', 'DESC'.
     */
    @JsonProperty(value = "sortType")
    private String sortType;

    /**
     * The start index of the page.
     */
    @JsonProperty(value = "startIndex")
    private Long startIndex;

    /**
     * The total count of items.
     */
    @JsonProperty(value = "totalCount")
    private Long totalCount;

    /**
     * Get an array of objects.
     *
     * @return the list value
     */
    public List<Object> list() {
        return this.list;
    }

    /**
     * Set an array of objects.
     *
     * @param list the list value to set
     * @return the JsonPList object itself.
     */
    public JsonPList withList(List<Object> list) {
        this.list = list;
        return this;
    }

    /**
     * Get the size of the page.
     *
     * @return the pageSize value
     */
    public Integer pageSize() {
        return this.pageSize;
    }

    /**
     * Set the size of the page.
     *
     * @param pageSize the pageSize value to set
     * @return the JsonPList object itself.
     */
    public JsonPList withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get the sorted by field.
     *
     * @return the sortBy value
     */
    public String sortBy() {
        return this.sortBy;
    }

    /**
     * Set the sorted by field.
     *
     * @param sortBy the sortBy value to set
     * @return the JsonPList object itself.
     */
    public JsonPList withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Get possible values include: 'NONE', 'ASC', 'DESC'.
     *
     * @return the sortType value
     */
    public String sortType() {
        return this.sortType;
    }

    /**
     * Set possible values include: 'NONE', 'ASC', 'DESC'.
     *
     * @param sortType the sortType value to set
     * @return the JsonPList object itself.
     */
    public JsonPList withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * Get the start index of the page.
     *
     * @return the startIndex value
     */
    public Long startIndex() {
        return this.startIndex;
    }

    /**
     * Set the start index of the page.
     *
     * @param startIndex the startIndex value to set
     * @return the JsonPList object itself.
     */
    public JsonPList withStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    /**
     * Get the total count of items.
     *
     * @return the totalCount value
     */
    public Long totalCount() {
        return this.totalCount;
    }

    /**
     * Set the total count of items.
     *
     * @param totalCount the totalCount value to set
     * @return the JsonPList object itself.
     */
    public JsonPList withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

}
