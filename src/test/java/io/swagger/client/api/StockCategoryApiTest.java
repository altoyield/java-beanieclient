/*
 * Beanie ERP API
 * An API specification for interacting with the Beanie ERP system
 *
 * OpenAPI spec version: 0.2
 * Contact: dev@bean.ie
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.StockCategory;
import io.swagger.client.model.StockCategoryInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StockCategoryApi
 */
@Ignore
public class StockCategoryApiTest {

    private final StockCategoryApi api = new StockCategoryApi();

    
    /**
     * 
     *
     * Creates a new stock category in the system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStockCategoryTest() throws ApiException {
        StockCategoryInput stockCategories = null;
        StockCategory response = api.addStockCategory(stockCategories);

        // TODO: test validations
    }
    
    /**
     * All stock category
     *
     * Returns all stock category from the system that the user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findStockCategoriesTest() throws ApiException {
        List<String> tags = null;
        Integer limit = null;
        List<StockCategory> response = api.findStockCategories(tags, limit);

        // TODO: test validations
    }
    
    /**
     * Find Stock category by ID
     *
     * Returns a single stock category if the user has access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findStockCategoryByIdTest() throws ApiException {
        Long id = null;
        StockCategory response = api.findStockCategoryById(id);

        // TODO: test validations
    }
    
}
